package com.test.testPattern.builder.pattern;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		
		MealBuilder mb =new MealBuilder();
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Veg Meal");
	    vegMeal.showItems();
	    System.out.println("Total Cost: " + vegMeal.getCost());
	    
	    Meal nonVegMeal = mb.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItems();
	    System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		
	}
}
