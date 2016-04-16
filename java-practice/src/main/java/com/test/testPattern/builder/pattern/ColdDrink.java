package com.test.testPattern.builder.pattern;

public  abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
