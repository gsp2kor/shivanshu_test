package com.test.theradproducerconsumerwaitnotify;

public class ConsumerThread implements Runnable{
	
	Resource resource;
	
	public ConsumerThread(Resource resource){
		
		this.resource=resource;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				resource.get();
			} catch (InterruptedException e) {

			}
		}
	}

}
