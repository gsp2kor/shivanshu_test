package com.test.shivanshuClass;

import java.io.File;
import java.io.IOException;

public class TestFileRenaming {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File delDir = new File("C:\\Users\\Shivanshu\\Desktop\\Test\\"); // make a directory
		delDir.mkdir();
		File delFile1 = new File(
		delDir, "delFile1.txt"); // add file to directory
		delFile1.createNewFile();
		File delFile2 = new File(
		delDir, "delFile2.txt"); // add file to directory
		delFile2.createNewFile();

		delFile1.delete(); // delete a file
		System.out.println("delDir is "
		+ delDir.delete()); // attempt to delete
		// the directory
		File newName = new File(
		delDir, "newName.txt"); // a new object
		delFile2.renameTo(newName); // rename file
		File newDir = new File("C:\\Users\\Shivanshu\\Desktop\\newDir"); // rename directory
		delDir.renameTo(newDir);
		
		String[] files = new String[1000];
		files = newDir.list();
		
		for(String file: files){
			System.out.println(file.toString());
		}
	}

}
