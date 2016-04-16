package com.test.theradproducerconsumerwaitnotify;

public class Resource {

	boolean isProduced = false;
	String data = "EMPTY";

	/** Put method : puts only if is not already produced 
	 * @param data **/
	public  void put(String data) throws InterruptedException {
		
		synchronized (this) {
			
			if (isProduced) {
				wait(); // Not Consumed Yet,Wait for consumer's signal.

			} else {

				this.data = data;
				isProduced = true;
				notify(); // Tell the Consumer that i'm done producing.
				System.out.println("Producer >> Data:" + this.data);
			}
			
		}



	}

	public  String get() throws InterruptedException {
		
		synchronized (this) {
			
			if (!isProduced) {

				wait();

			} else {

				String data = this.data;
				System.out.println("CONSUMED -- " + data);
				this.data = "EMPTY";
				isProduced = false;
				notify();
				return data;

			}
			return data;
			
		}



	}

}
