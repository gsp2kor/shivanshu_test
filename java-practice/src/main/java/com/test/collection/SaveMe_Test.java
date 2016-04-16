package com.test.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//public class testEqualsMethod {
//	public static void main (String [] args) {
//	Moof one = new Moof(8);
//	Moof two = new Moof(7);
//	if (one.equals(two)) {
//	System.out.println("one and two are equal");
//	}
//	}
//	}
//	class Moof {
//	private int moofValue;
//	Moof(int val) {
//	moofValue = val;
//	}
//	public int getMoofValue() {
//	return moofValue;
//	}
//	public boolean equals(Object o) {
//	if ((o instanceof Moof) && (((Moof)o).getMoofValue()
//	== this.moofValue)) {
//	return true;
//	} else {
//	return false;
//	}
//	}
//	}

public class SaveMe_Test {

	
	public static void main(String[] args) {
		
		SaveMe c = new SaveMe(2,3); // 2
		try {
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Shivanshu\\Desktop\\TestSer\\testSer.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(c); // 3
		System.out.println("Before Serialzation" + c.x);
		os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shivanshu\\Desktop\\TestSer\\testSer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (SaveMe) ois.readObject(); // 4
			System.out.println("After Deserialzation" + c.x);
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }
			
			
			
			
	}

}


class SaveMe implements Serializable{
	transient int x;
	int y;
	SaveMe(int xVal, int yVal) {
	x = xVal;
	y = yVal;
	}
	public int hashCode() {
	return (x ^ y); // Legal, but not correct to
	// use a transient variable
	}
	public boolean equals(Object o) {
	SaveMe test = (SaveMe)o;
	if (test.y == y && test.x == x) { // Legal, not correct
	return true;
	} else {
	return false;
	}
	}
	}