package com.test.shivanshuClass;

import com.test.shivanshu.Foo;

public class Fiz extends Foo{
	
	public static void main(String[] args) {
		 Foo f = new Foo();
		 Foo f1 = new Fiz();
		// System.out.print(" " + f1.a);
		System.out.print(" " + f.getB());
		// System.out.print(" " + f1.a);
		 System.out.println(" " + new Fiz().getB());
		 }

}
