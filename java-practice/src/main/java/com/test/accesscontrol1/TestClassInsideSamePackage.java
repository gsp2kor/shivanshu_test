package com.test.accesscontrol1;

public class TestClassInsideSamePackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestClassInsideSamePackage x = new TestClassInsideSamePackage();
		
		x.readAll();

	}

	public void readAll() {
		/** Accessed via object of the class */
		AccessSpecifiers access = new AccessSpecifiers();

		//System.out.println(access.privateString); // Un-Accessible
		System.out.println(access.defaultString);
		System.out.println(access.protectedString);
		System.out.println(access.publicString);
	}
}
