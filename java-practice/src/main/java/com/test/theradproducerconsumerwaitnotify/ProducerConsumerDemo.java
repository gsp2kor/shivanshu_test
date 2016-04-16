package com.test.theradproducerconsumerwaitnotify;

public class ProducerConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Resource res = new Resource();
		new ProducerThread(res);
		new ConsumerThread(res);
	}

}
