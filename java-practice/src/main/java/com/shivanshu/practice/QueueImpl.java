package com.shivanshu.practice;

import java.util.Arrays;

public class QueueImpl {
 private int capacity;
 private int currentSize=0;
 private int[] queueArr;
 private QueueImpl(int queueSize) {
   this.capacity = queueSize;
   this.queueArr = new int[this.capacity];
 }

 private void enqueue(int item){
   if(isQueueFull()){
     System.out.println("Queue full, Increase capacity");
     increaseCapacity();
   }
     queueArr[currentSize++] = item;
   System.out.println(Arrays.toString(queueArr));
 }

 private void increaseCapacity() {
   int[] newQueueArr = new int[this.capacity * 2];
   System.arraycopy(queueArr, 0, newQueueArr, 0, queueArr.length);
   queueArr = newQueueArr;
   capacity = queueArr.length;
   System.out.println(Arrays.toString(queueArr));
 }

 private void dequeue(){
   if(isQueueEmpty()){
     System.out.println("Underflow ! Unable to delete element as queue is empty");
   }else{
     int result = queueArr[0];
     System.out.println("Removed element "+ result);
     reshuffle();
     currentSize--;
   }
 }

 private void reshuffle() {
   System.arraycopy(queueArr, 1, queueArr, 0, queueArr.length - 1);
   System.out.println("Removing element, Reshuffle completed");
   System.out.println(Arrays.toString(queueArr));
 }

 private boolean isQueueFull() {
   return capacity == currentSize;
 }

 private boolean isQueueEmpty() {
   return currentSize==0;
 }

 public static void main(String a[]){

   QueueImpl queue = new QueueImpl(4);
   queue.enqueue(1);
   queue.enqueue(2);
   queue.enqueue(3);
   queue.enqueue(4);
   queue.enqueue(5);
   queue.dequeue();
   queue.dequeue();
   queue.dequeue();
   queue.dequeue();
   queue.dequeue();
   queue.dequeue();
   queue.dequeue();
   queue.enqueue(6);
   queue.enqueue(7);
   queue.enqueue(8);
   queue.dequeue();
   queue.dequeue();
   queue.enqueue(9);
   queue.dequeue();
   queue.enqueue(10);
   queue.enqueue(11);
   queue.enqueue(12);
 }
}

