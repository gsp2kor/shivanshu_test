package com.test.accesscontrol2;

import com.test.accesscontrol1.AccessSpecifiers;

public class TestClass {

	public static void main(String[] args) {
		
		TestClass x = new TestClass();
		
		x.readAll();

	}

	public void readAll() {
		/** Accessed via object of the class */
		AccessSpecifiers access = new AccessSpecifiers();

		//System.out.println(access.privateString); // Un-Accessible
		//System.out.println(access.defaultString);  // Un-Accessible Different Package
		//System.out.println(access.protectedString); // Un-Accessible Different Package
		System.out.println(access.publicString);
	}

}
