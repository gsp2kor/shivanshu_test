package com.test.shivanshuClass;
import java.io.*;

class Dog implements Serializable{
	private transient Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size) {
	theCollar = collar;
	dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
		os.defaultWriteObject(); // 2
		os.writeInt(theCollar.getCollarSize()); // 3
		} catch (Exception e) { e.printStackTrace(); }
		}
		private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
		is.defaultReadObject(); // 5
		theCollar = new Collar(is.readInt()); // 6
		} catch (Exception e) { e.printStackTrace(); }
}
}
	class Collar { //implements Serializable{
		private int collarSize;
		public Collar(int size) { collarSize = size; }
		public int getCollarSize() { return collarSize; }
		}
	
	

	
public class ExampleSerialization1 {

	
	public static void main(String[] args) {
		
		Collar c = new Collar(3);
		Dog d = new Dog(c, 8);
		System.out.println("before: collar size is "
				+ d.getCollar().getCollarSize());
		try {
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(d);
		os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }
			
			System.out.println("after: collar size is "
					+ d.getCollar().getCollarSize());
	

	}

}

