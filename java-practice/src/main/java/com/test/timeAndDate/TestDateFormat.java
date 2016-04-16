package com.test.timeAndDate;

import java.util.*;
import java.text.*;
public class TestDateFormat {

	
	public static void main(String[] args) {
//		Date d1 = new Date();
//		DateFormat[] dfa = new DateFormat[6];
//		dfa[0] = DateFormat.getInstance();
//		dfa[1] = DateFormat.getDateInstance();
//		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
//		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
//		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
//		for(DateFormat df : dfa)
//			System.out.println(df.format(d1));
		
		
//		Date d1 = new Date(1000000000000L);
//		System.out.println("d1 = " + d1.toString());
//		DateFormat df = DateFormat.getDateInstance(
//		DateFormat.SHORT);
//		String s = df.format(d1);
//		System.out.println(s);
//		try {
//		Date d2 = df.parse(s);
//		System.out.println("parsed = " + d2.toString());
//		} catch (ParseException pe) {
//			pe.printStackTrace();
//		System.out.println("parse exc");
//		}

		Locale locPT = new Locale("it");
		System.out.println(locPT.getDisplayLanguage());
		DateFormat df = DateFormat.getInstance().getDateTimeInstance();
		System.out.println(df.toString());
		
	}

}
