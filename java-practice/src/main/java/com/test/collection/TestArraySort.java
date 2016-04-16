package com.test.collection;

import java.util.*;

public class TestArraySort {

	public static void main(String args []){
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<3; x++)
		iL.add(x);
		Object[] oa = iL.toArray(); // create an Object array
		System.out.println(oa.toString());
		Integer[] ia2 = new Integer[3];
		System.out.println(ia2.toString());
		ia2 = iL.toArray(ia2);
		System.out.println("Final " + ia2.toString());
	}
}
