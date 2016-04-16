package com.test.theradproducerconsumerwaitnotify;

public class ProducerThread implements Runnable {

	Resource resource;

	public ProducerThread(Resource resource) {
		this.resource = resource;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				resource.put("DATA ADDED"+i);
			} catch (InterruptedException e) {

			}
		}
	}

}
