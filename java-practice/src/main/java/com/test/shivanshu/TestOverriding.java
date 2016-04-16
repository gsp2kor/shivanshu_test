package com.test.shivanshu;

public class TestOverriding {
	public static void main(String[] args) {
		Animals a = new Animals();
		Animals b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()		
		
		System.out.println("=====================================================");
		
		Animals c = new Animals();
		Animals d = new Horse();
		Horse e = new Horse();
		System.out.println(" d.display(c); Animals d = new Horse(); Animals c = new Animals();  ");
		d.display(c);
		System.out.println(" c.display(d); Animals d = new Horse(); Animals c = new Animals();  ");
		c.display(d);
		System.out.println(" e.display(e); Animals d = new Horse(); Animals c = new Animals();  ");
		e.display(e);
		e.display(c);
		e.display(d);
		e.eat();
		c.eat();
		d.eat();
		
		//Horse f = (Horse)e;
		//Animal h = (Animal)e;  //Can not cast Horse to Animal;
		Horse i = (Horse)c;
		System.out.println("*************************************************************");
 		i.display(c);
		i.display(e);
		
		//Animals c = new Horse();
		//Hosre d = new Animal(); // Compilation Error Horse can not point to Animal
		//c.buck(); // Animal has not defined buck
	}
	
}
	


class Animals {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	
	public void display(Animals animal){
		System.out.println("Inside Animal");
		animal = null;
		
	}
	
	public void suck() {
	}
}

class Horse extends Animals {
	public void eat() {
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}

	public void buck() {
	}
	
	public void display(Horse horse){
		System.out.println("Inside Horse");
		horse = null;
		
	}
}
