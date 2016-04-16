package com.test.shivanshu;
import java.util.*;

public class  TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		Set set = new HashSet();
		set.add("Bernadine");
		set.add("Elizabeth");
		set.add("Gene");
		set.add("Elizabeth");
		set.add("Clara");
		set.add("lara");
		List l = new ArrayList();
		l.addAll(set);
		l.size();
		System.out.println(l.size());
		l.remove("Clara");
		l.add("Shilpa");
		l.size();
		System.out.println(l.size());
		System.out.println(l);
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
		}
		
	

}
