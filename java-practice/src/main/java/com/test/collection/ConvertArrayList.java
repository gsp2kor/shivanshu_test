package com.test.collection;

import java.util.*;
import java.util.List;

class Animal{}
class Dog extends Animal{
	public String name;
	Dog(String n) { name = n; }
	}


public class ConvertArrayList {

	
	public static void main(String[] args) {
//		String[] sa = {"one", "two", "three", "four"};
//		List sList = Arrays.asList(sa); // make a List
//		System.out.println("size " + sList.size());
//		System.out.println("idx2 " + sList.get(2));
//		sList.set(3,"six"); // change List
//		sa[1] = "five"; // change array
//		for(String s : sa)
//		System.out.print(s + " ");
//		System.out.println("\nsl[1] " + sList.get(1));

		
//		List<Integer> iL = new ArrayList<Integer>();
//		for(int x=0; x<3; x++)
//		iL.add(x);
//		Object[] oa = iL.toArray(); // create an Object array
//		Integer[] ia2 = new Integer[3];
//		ia2 = iL.toArray(ia2);
		
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("magnolia"));
		Iterator<Dog> i3 = d.iterator(); // make an iterator
		while (i3.hasNext()) {
		Dog d2 = i3.next(); // cast not required
		System.out.println(d2.name);
		}
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		d.remove(2);
		Object[] oa = d.toArray();
		for(Object o : oa) {
		Dog d2 = (Dog)o;
		System.out.println("oa " + d2.name);
	}

}
}
