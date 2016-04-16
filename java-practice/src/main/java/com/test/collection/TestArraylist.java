package com.test.collection;

import java.util.*;

public class TestArraylist {

	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		String s = "hi";
		l.add("String");
		l.add(s);
		l.add(s+s);
		l.add("hi");
		System.out.println(l.size());
		System.out.println(l.contains(42));
		System.out.println("HiHi" +l.contains("hihi"));
		l.remove("hi");
		System.out.println(l.size());
		System.out.println("\n\n\n\n\n\n\n");
		for(String x : l){
		System.out.println(l.indexOf(x) +"        " +x);
		}
		
		
		
		System.out.println("-------------\n\n\n\n\n\n\n");
		ListIterator<String> it = l.listIterator();
		while(it.hasNext())
		{
	
			System.out.println(it.nextIndex() +"   -----      " +it.next());
		}
	

	}

}
