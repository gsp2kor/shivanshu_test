package com.test.shivanshu;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.Enumeration;
import java.util.Properties;

public class TestPropertyFile{
	
	public static void main(String[] args) {
		
		System.out.println("Present working dir: " + new File(".").getAbsolutePath());
		
		try{
			File file = new File(".\\src\\shivanshu\\PropertyFile.property");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			
			Enumeration<Object> enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": " + value);
				
			}
			
			
			System.out.println(properties.getProperty("name"));
			System.out.println(properties.getProperty("language"));
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}