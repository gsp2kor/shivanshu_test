package com.test.accesscontrol1;

public class AccessSpecifiers {
	// Accessible everywhere outside/inside class
	public String publicString = "publicString"; // UnAccessible everywhere
													// outside class
	private String privateString = "privateString"; // Accessible via
													// objects/inheritance
													// inside same package,
	// Accessible outside only via Inheritance protected
	protected String protectedString = "protectedString";
	// Accessible only inside same package
	String defaultString = "defaultString";

}
