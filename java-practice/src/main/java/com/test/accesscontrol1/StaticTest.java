package com.test.accesscontrol1;

class StaticTest {
	/** A static variable */
	private static int num;
	private  int num_non_static;
	/** A static block */
	static {
		num = 20;
		System.out.println("Inside static block");
	}

	/** Constructor */
	public StaticTest() {
		System.out.println("Inside Constructor");
	}

	public static void myStaticMethod() {
		//num_non_static;
		System.out.println("Inside static func");
	}

	public void myNonStaticMethod() {
		System.out.println("Inside non static func");
		myStaticMethod();
	}

	private static void main(String[] args) {
		StaticTest.myStaticMethod();
		StaticTest test = new StaticTest();
		test.myNonStaticMethod();
	}
}
