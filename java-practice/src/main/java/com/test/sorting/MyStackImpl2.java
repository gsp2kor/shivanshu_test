package com.test.sorting;

public class MyStackImpl2 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.pop();
		stack.push(15);
		stack.push(17);
		System.out.println(Stack.size);
		stack.printStack();
		
		

	}

}

class Item {

	int data;
	Item next;

	public Item(int data) {

		this.data = data;
	}
}

class Stack {
	
	public static int size = 0; 

	private Item top;

	public void push(int data) {
		if (null == top) {
			top = new Item(data);
			size++;
			System.out.println(data + " Added");
		} else {
			Item item = new Item(data);
			item.next = top;
			top = item;
			System.out.println(data + " Added");
			size++;
		}
	}

	public int pop() throws Exception {
		if (top == null) {
			throw new Exception("Stack is empty. Can not remove element.");
		} else {

			int data = top.data;
			top = top.next;
			System.out.println(data + " Removed");
			size--;
			return data;

		}

	}
	
	
	public void printStack() { 
		
		System.out.println("==================================");
		
		Item tmp = top; 
		
		if (top == null) { 
			System.out.print("Stack is empty !!"); 
			} 
		System.out.println(); 
		while (tmp != null) { 
			System.out.print(" > " + tmp.data); 
			tmp = tmp.next; } 
		}
	
}
