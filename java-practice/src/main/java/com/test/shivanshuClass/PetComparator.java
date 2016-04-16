package com.test.shivanshuClass;
import java.util.*;

public class PetComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		int result = 0;
		
		Pet pet = (Pet) o1;
		Pet pet1 = (Pet) o2;
		
		Integer pId = new Integer(pet.getPetId());
		Integer pIdAno = new Integer(pet1.getPetId());
//		return pId.compareTo(pIdAno);
		result = pId.compareTo(pIdAno);
		if(result ==0)
		{
		result=  pet.getPetType().compareTo(pet1.getPetType());
		}
	return result;
		
	}

	
	public static void main(String args[])
	{
		List list =new ArrayList();
		list.add(new Pet(2,"dog"));
		list.add(new Pet(7,"cat"));
		list.add(new Pet(3,"lion"));
		
		Collections.sort(list , new PetComparator());
		
	for(Iterator iter = list.iterator();iter.hasNext();)
	{
		Pet p = (Pet)iter.next();
		System.out.println(p.petType);
	}
	


}
}
