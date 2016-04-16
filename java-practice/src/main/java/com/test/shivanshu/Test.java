package com.test.shivanshu;

import java.util.Arrays;

/**
 * This class find smallest subword in a string which contains a specified set
 * of characters in any sequence. Also it checks for filter characters.
 * 
 * @author Kishor Kumar Padhan
 * 
 */
//public class Test {
//	public static void main(String[] args) {
//
//		int [] arr1 = {1, 3, 4, 6,8,10, 17, 34};
//		int [] arr2 = {2, 8, 17, 33, 44, 66, 89, 100, 123};
//		
//		Set <Integer> a1 = new HashSet();
//		for(int i : arr1) a1.add(i);
//		Set <Integer> a2 = new HashSet();
//		for(int i : arr2) a2.add(i);
//		
//		Set <Integer> a1C = new HashSet(a1);
//		Set <Integer> a2C = new HashSet(a2);
//		
//		a1C.removeAll(a2);
//		a2C.removeAll(a1);
//		
//		Set <Integer> a3 = new HashSet();
//		a3.addAll(a1C);
//		a3.addAll(a2C);
//		
//		Set<Integer> res = new TreeSet(a3);
//		
//		for(int i : res)
//			System.out.print(i + ", ");
//		System.out.println();
//	}
//
//}

public class Test {
    public static void main(String[] args) throws Exception {
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
