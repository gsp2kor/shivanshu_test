package com.test.testPattern.builder.pattern;

public  abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
