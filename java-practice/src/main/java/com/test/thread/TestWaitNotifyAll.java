package com.test.thread;

class TestWaitNotifyAll extends Thread {
	Calculator c;

	public TestWaitNotifyAll(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation...");
				c.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new TestWaitNotifyAll(calculator).start();
		new TestWaitNotifyAll(calculator).start();
		new TestWaitNotifyAll(calculator).start();
		calculator.start();
	}
}

class Calculator extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
		}
	}
}