package com.test.thread;

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 5; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
			System.out.println(Thread.currentThread().getPriority());
			
//			try {
//				Thread.sleep(1000);
//				} catch (InterruptedException ex) { }
		}
	}
}

public class ManyNames {
	public static void main(String[] args) throws InterruptedException {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		//two.join();
		two.start();
		three.start();
		//three.setPriority(8);
	}
}
