package com.test.accesscontrol2;

import com.test.accesscontrol1.AccessSpecifiers;

public class TestClassExtended extends AccessSpecifiers {

	public static void main(String[] args) {

		TestClassExtended x = new TestClassExtended();

		x.readAll();

	}

	public void readAll() {
		/** Accessed via object of the class */
		AccessSpecifiers access = new AccessSpecifiers();

		//System.out.println(access.privateString); // Un-Accessible
		//System.out.println(access.defaultString); // Un-Accessible Different
													// Package
		//System.out.println(access.protectedString); // Un-Accessible Different
													// Package
		System.out.println(access.publicString);

		//System.out.println(this.privateString); // Un-Accessible
		//System.out.println(this.defaultString); // Un-Accessible Different
												// Package
		System.out.println(this.protectedString); // Accessible via inheritance
													
		System.out.println(this.publicString);
	}

}
