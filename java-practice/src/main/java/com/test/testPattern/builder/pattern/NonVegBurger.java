package com.test.testPattern.builder.pattern;

public class NonVegBurger extends Burger{

	@Override
	public String getName() {
		return "Non Veg Burger";
	}

	@Override
	public float getPrice() {
		
		return 30.0f;
	}

}
