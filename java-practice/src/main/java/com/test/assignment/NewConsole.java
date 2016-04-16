package com.test.assignment;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NewConsole {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
        String s = br.readLine();
		
		System.out.println("Shilpa" +s);
		
		}
	}


