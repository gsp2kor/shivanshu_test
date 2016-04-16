package com.test.shivanshuClass;

import java.util.*;

public class Pet implements Comparable {
	
	public String petType;
	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int petId;

	
	
	public Pet(int age , String name)
	{
		petType = name;
		petId = age;
	}
	
	public int compareTo(Object o)
	{
		
		Pet petAnother = (Pet)o;
		
		return this.petType.compareTo(petAnother.petType);
	}
	
//	public static void main(String args[])
//	{
//		List list =new ArrayList();
//		list.add(new Pet(2,"dog"));
//		list.add(new Pet(2,"cat"));
//		list.add(new Pet(2,"lion"));
//		
//		Collections.sort(list);
//		
//	for(Iterator iter = list.iterator();iter.hasNext();)
//	{
//		Pet p = (Pet)iter.next();
//		System.out.println(p.petType);
//	}
//	

//	}
}
