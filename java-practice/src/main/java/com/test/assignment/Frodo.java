package com.test.assignment;

class Hobbit {
	public int z =5;
	int countGold(int x, int y) {
		return x + y;
	}
}

public class Frodo extends Hobbit {
	public static void main(String[] args) {
		Frodo fr = new Frodo();
		Short myGold = 7;
		//System.out.println(countGold(myGold, 6));  // can not access non static thing from static context so make method static
		//System.out.println(z);
		fr.tryMe();
	}

	private void tryMe() {
System.out.println(z); // non static instance variable can be accessed directly via non static method via inheritance
		
	}
}
