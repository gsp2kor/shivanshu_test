package com.test.shivanshu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TestSerializationEx2 {
			
		
		public static void main(String[] args) {
			//ExampleSerialization2 ex = new ExampleSerialization2();
			Dog d =  new Dog(5,"ABC");
			System.out.println("before: " + d.name + " "
			+ d.weight  + Dog.z );
			try {
			FileOutputStream fs = new FileOutputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
			} catch (Exception e) { e.printStackTrace(); }
			
			Dog.z =7;
			try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }
			System.out.println("after: " + d.name + " "
			+ d.z + d.weight);

		
		

		}
}

	class Dog extends Animal implements Serializable {
		
	 String name;
	 static int z = 5;
	public Dog(int w, String n) {
		weight = w; // inherited
		name = n; // not inherited
		}
	}
	class Animal { 
		int weight = 42;
		}

	

