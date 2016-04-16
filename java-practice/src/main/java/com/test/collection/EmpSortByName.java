package com.test.collection;
import java.util.*;

public class EmpSortByName implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}