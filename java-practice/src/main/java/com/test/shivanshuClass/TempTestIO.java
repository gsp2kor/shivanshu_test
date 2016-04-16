package com.test.shivanshuClass;
import java.io.*;

public class TempTestIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
		File existingDir = new File("C:\\Users\\user\\Desktop\\existingDir"); // assign a dir
		existingDir.mkdir();
		File myFile = new File(
				existingDir, "myFile.txt");
		myFile.createNewFile();
		File newDir = new File("C:\\Users\\user\\Desktop\\newDir"); // rename directory
		existingDir.renameTo(newDir);
		System.out.println(existingDir.isDirectory());

	}catch(IOException e){
		
		System.out.println("ERROR");
	}

}
}