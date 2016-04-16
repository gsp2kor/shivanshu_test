package com.test.collection;

import java.util.*;

public class TestEmployeeSort   {
	
	
	
	
	
	
	public static void main(String[] args) { 
		
		List<Employee> col = new ArrayList<Employee>();
		
		col.add(new Employee(5, "Frank", 28));
	    col.add(new Employee(1, "Jorge", 19));
	    col.add(new Employee(6, "Bill", 34));
	    col.add(new Employee(3, "Michel", 10));
	    col.add(new Employee(7, "Simpson", 8));
	    col.add(new Employee(4, "Clerk",16 ));
	    col.add(new Employee(8, "Lee", 40));
	    col.add(new Employee(2, "Mark", 30));
	    
	    Collections.sort(col); // sort method
        printList(col);
        
        Collections.sort(col, new EmpSortByName());
        printList(col);
        
	}
        
        


private static void printList(List<Employee> list) {
    System.out.println("EmpId\tName\tAge");
    for (Employee e: list) {
        System.out.println(e.getEmpId() + "\t" + e.getName() + "\t" + e.getAge());
    }
}
}
