package com.test.testPattern.nullobject.pattern;

public class NullpatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractCustomer absCst1 = CustomerFactory.getCustomer("Rob");
		System.out.println(absCst1.getName());
		AbstractCustomer absCst2 = CustomerFactory.getCustomer("Bitty");
		System.out.println(absCst2.getName());
	}

}
