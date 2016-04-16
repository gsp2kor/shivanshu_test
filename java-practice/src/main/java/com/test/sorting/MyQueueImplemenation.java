package com.test.sorting;

public class MyQueueImplemenation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue que = new Queue();
		que.enqueue(5);
		que.enqueue(6);
		que.enqueue(16);
		que.dequeue();
		que.dequeue();
		que.enqueue(7);
		que.enqueue(8);
		System.out.println(Queue.size);
		que.printQueue();
		


	}

}

class QueueItem {

	int data;
	QueueItem next;

	public QueueItem (int data) {

		this.data = data;
	}
}

class Queue{
	
	public static int size = 0; 

	private QueueItem front;
	private QueueItem rear;
	
	public void enqueue(int data){
		
		if(rear == null){
			front = rear = new QueueItem(data);
			size++;
			System.out.println(data + " Added");
		}else{
			QueueItem item = new QueueItem(data);
			front.next = item;
			front =item;
			size++;
			System.out.println(data + " Added");
		}
	}
	
	public int dequeue(){
		
		if(rear == null){
			System.out.println("Can not remove element ,Queue is Empty");
			return -1;
			
		}
		
		int data = rear.data;
		rear = rear.next;
		size--;
		System.out.println(data + " Removed");
		return data;
	}
	
	public void printQueue(){
		if(rear==null){
			System.out.println("Queue Empty");
		}else{
		
			QueueItem tmp = rear;
			System.out.print("REAR"); 
			while (tmp != null) { 
			System.out.print("<" + tmp.data); 
			tmp = tmp.next; 
			} 
			
			System.out.println("<FRONT");
			
		}
	}
}


