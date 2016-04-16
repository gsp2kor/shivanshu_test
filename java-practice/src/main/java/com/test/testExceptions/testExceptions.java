package testExceptions;



import java.io.*;
public class testExceptions {
//public static void main(String args[]) throws FileNotFoundException {
//try {
//RandomAccessFile raf =
//new RandomAccessFile("myfile.txt", "r");
//byte b[] = new byte[1000];
//raf.readFully(b, 0, 1000);
//}
//
//catch(IOException e) {
//System.err.println("IO Error");
//System.err.println(e.toString());
//e.printStackTrace();
//}
//}
	
	public static void main (String [] args) {
		badMethod();
		}
		static void badMethod() { // No need to declare an Error
		doStuff();
		}
		static void doStuff() { //No need to declare an Error
		try {
		throw new Error();
		}
		catch(Error me) {
			System.out.println("hi");
		throw me; // We catch it, but then rethrow it
		}
		}
}
