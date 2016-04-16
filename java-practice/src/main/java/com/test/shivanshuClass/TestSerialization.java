package com.test.shivanshuClass;

import java.io.*;

class Cat implements Serializable { }
public class TestSerialization {

	
	public static void main(String[] args) {
		
		Cat c = new Cat(); // 2
		try {
		FileOutputStream fs = new FileOutputStream("C:\\Users\\user\\Desktop\\testSer.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(c); // 3
		os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\testSer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }
			
			
			
			
	}

}
