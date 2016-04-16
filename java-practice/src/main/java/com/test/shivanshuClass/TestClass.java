package com.test.shivanshuClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public  class TestClass{ 
	
	


	
	public void testMe()
	  {
		  List al = new ArrayList();
		  al.add(new String("5"));
		  al.add(new String("   Shivanshu   Gupta    "));
		 
		  Iterator i =al.iterator();
		  while(i.hasNext())
		  {
			  System.out.println("" +i.next().toString().trim());
		  }
	  }
	final int sumTotal(List<Integer> in) 
	  {
			int s = 0;
			for (Integer n : in) { s += n; }
			System.out.println("" +s);
			return s;
			}
	
public static void main  (String args[]) {
	
  TestClass test = new TestClass();
  test.testMe();
  List<Integer> ints = new ArrayList<Integer>();
  ints.add(5);
  ints.add(2);
  
  
  List<Number> nums = new ArrayList<Number>();
  List<Integer> insts = Arrays.asList(1, 2);
  List<Double> dbls = Arrays.asList(2.78, 3.14);
  nums.addAll(ints);
  nums.addAll(dbls);
  assert nums.toString().equals("[1, 2, 2.78, 3.14]");
  
test.sumTotal(ints);
}
}
