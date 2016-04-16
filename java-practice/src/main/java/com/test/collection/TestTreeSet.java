package com.test.collection;
import java.util.*;
public class TestTreeSet {
public static void main(String[] args) {
//TreeSet<Integer> times = new TreeSet<Integer>();
//times.add(1205); // add some departure times
//times.add(1505);
//times.add(1545);
//times.add(1830);
//times.add(2010);
//times.add(2100);
//
////Java 5 version
//TreeSet<Integer> subset = new TreeSet<Integer>();
//subset = (TreeSet)times.headSet(1600);
//System.out.println("J5 - last before 4pm is: " + subset.last());
//TreeSet<Integer> sub2 = new TreeSet<Integer>();
//sub2 = (TreeSet)times.tailSet(2000);
//System.out.println("J5 - first after 8pm is: " + sub2.first());
////Java 6 version using the new lower() and higher() methods
//System.out.println("J6 - last before 4pm is: " + times.lower(1600));
//System.out.println("J6 - first after 8pm is: " + times.higher(2000));
	
	TreeMap<String, String> map = new TreeMap<String, String>();
	map.put("a", "ant"); map.put("d", "dog"); map.put("h", "horse");
	SortedMap<String, String> submap;
	submap = map.subMap("b",false, "g",true); // #1 create a backed collection
	System.out.println(map + " " + submap); // #2 show contents
	map.put("b", "bat"); // #3 add to original
	submap.put("f", "fish"); // #4 add to copy
	map.put("r", "raccoon"); // #5 add to original - out of range
	 submap.put("e", "eel");
	 submap.put("g", "goat");
	System.out.println(map + " " + submap);
}
}