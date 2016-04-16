package com.test.thread;

class FooRunnable implements Runnable {
	public void run() {
		System.out.println("Foo Running");
		for (int x = 1; x < 6; x++) {
			System.out.println("Foo Runnable running");
		}
	}
}

class BarRunnable implements Runnable {
	public void run() {
		System.out.println("Bar Running");
		for (int x = 1; x < 6; x++) {
			System.out.println("Bar Runnable running");
		}
	}
}

public class TestThreads {
	public static void main(String[] args) {
		FooRunnable r1 = new FooRunnable();
		BarRunnable r2 = new BarRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
