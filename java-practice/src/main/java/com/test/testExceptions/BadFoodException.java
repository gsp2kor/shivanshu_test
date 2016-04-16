package testExceptions;

public class BadFoodException extends Exception {
	
	BadFoodException() throws MyExceptionClass{
		System.out.println("Hi...");
	}

}
