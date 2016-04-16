package com.test.thread;

class TestWaitNotify {
	public static void main(String[] args) {
		Thread.currentThread().setName("Main Thread");
		ThreadB b = new ThreadB();
		b.setName("ThreadB");
		b.start();

		synchronized (b) {
			try {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				total += i;
			}
			notify();
		}
	}

}