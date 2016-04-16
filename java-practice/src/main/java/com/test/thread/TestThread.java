package com.test.thread;

class Chat{
	
	private boolean flag = false;
	
	public synchronized void Odd(int num){
		if(flag){	
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(num);
		flag=true;
		notify();
		
	}
	
	public synchronized void Even(int num){
		if(!flag){	
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(num);
		flag=false;
		notify();
		
	}
}

class T1 implements Runnable {

	Chat m;
    public T1(Chat m1) {
    	m=m1;
    	new Thread(this, "Odd").start();
	}
	public void run() {
        for (int i = 1; i <=10 ; i+=2) {
            m.Odd(i);
        }
    }
}


class T2 implements Runnable {
	Chat m;
    public T2(Chat m2) {
    	m=m2;
    	new Thread(this, "Even").start();
	}
    public void run() {
        for (int i = 2; i <=10 ; i+=2) {
            m.Even(i);
        }
    }
}

public class TestThread{
	
	public static void main(String[] args){
		Chat m = new Chat();
		new T1(m);
		new T2(m);
		
	}
}