package com.test.assignment;

/** Programmer : The Outer Class **/
class Programmer{
	private String name; 
	private void someOuterFunction(){ 
		System.out.println("Inside private method of Outer class"); 
		InnerProgrammer inner = new InnerProgrammer(); 
		inner.language = "New Language"; 
		inner.someInnerFunction(); 
		}
	
	/** InnerProgrammer : The Inner Class **/ 
	class InnerProgrammer{ 
		private String language; 
		private int age; 
		public void someInnerFunction(){ 
			System.out.println("Inside private method of Inner class"); 
			Programmer.this.name = "New Name"; 
			Programmer.this.someOuterFunction(); 
			} 
		} /** End of Inner Class **/
} 

/** USAGE **/ 
class InnerClassTest{ 
	
	public static void main(String[] args){ 
		
		Programmer.InnerProgrammer inner = (new Programmer()).new InnerProgrammer();
		inner.someInnerFunction();
		
		}
	}


