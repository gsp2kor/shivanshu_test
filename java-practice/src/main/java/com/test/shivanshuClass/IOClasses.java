package com.test.shivanshuClass;

import java.io.*;

public class IOClasses {
	
	public static void main(String[] args) {

		//Simple File Creation
		//		try{
//		boolean fileCreated = false;
//		File file = new File("C:\\Users\\user\\Desktop\\Test.txt");
//		System.out.println("First value of boolean------->" +fileCreated);
//		System.out.println("Check File----------->" +file.exists());
//		fileCreated = file.createNewFile(); // maybe create a file!
//		//System.out.println(fileCreated);
//		System.out.println(file.createNewFile());
//		System.out.println("Second Time--------->" +file.exists());
//		}catch(IOException e) { }
		
		//File IO Operation
		
		char [] in = new char [100];
		int size = 0;
		try{
		boolean fileCreated = false;
		
		
		File myDir = new File("C:\\Users\\Shivanshu\\Desktop\\Test");
		myDir.mkdir();
		File file = new File("C:\\Users\\Shivanshu\\Desktop\\Test\\Test.txt");
		FileWriter fw = new FileWriter(file);
		//BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Shivanshu");
		pw.println("Valentine");
		pw.flush(); // flush before closing
		pw.close();
		//file.delete();
		FileReader fr =new FileReader(file); // create a FileReader
		BufferedReader br = new BufferedReader(fr);
		String s = null; //br.readLine();
		while( (s = br.readLine()) != null) // read data
			System.out.println(s);
//		size = fr.read(in); // read the whole file!
//		System.out.print(size + " "); // how many bytes read
//		for(char c : in) // print the array
		
		//System.out.print(data);
			
			fr.close();
			
			//file.delete();
		}catch(IOException e) { }
		
	}

}
