package com.shivanshu.practice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzzMultiThreaded {
   private int i, n;
   Lock lock;
   public FizzBuzzMultiThreaded(int n) {
       this.n = n;
       i = 1;
       lock = new ReentrantLock();
   }

   // printFizz.run() outputs "fizz".
   public void fizz(Runnable printFizz) throws InterruptedException {
       while(i<=n) {
           synchronized(lock) {      
               while((i%3 != 0 || i%15 == 0) && i<=n) {
                   lock.wait();
               }
               if (i<=n) printFizz.run();
               i++;
               lock.notifyAll();    
           }   
       }   
   }

   // printBuzz.run() outputs "buzz".
   public void buzz(Runnable printBuzz) throws InterruptedException {
       while(i<=n) {
           synchronized(lock) {
               while((i%5 != 0 || i%15 == 0) && i<=n) {
                   lock.wait();
               }
               if (i<=n) printBuzz.run();
               i++;
               lock.notifyAll();    
           } 
       }
   }

   // printFizzBuzz.run() outputs "fizzbuzz".
   public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
       while(i<=n) {
           synchronized(lock) {
               while(i%15 != 0 && i<=n) {
                   lock.wait();
               }
               if (i<=n) printFizzBuzz.run();
               i++;
               lock.notifyAll(); 
           }
       } 
   }

   // printNumber.accept(x) outputs "x", where x is an integer.
   public void number(IntConsumer printNumber) throws InterruptedException {
       while(i<=n) {
           synchronized(lock) {
               while((i%3 == 0 || i%5 == 0) && i<=n) {
                   lock.wait();
               }
               if (i<=n) printNumber.accept(i);
               i++;
               lock.notifyAll();
           }
       } 
   }
}

