package testExceptions;

public class MyException {
	
	public void checkFood(String s) throws BadFoodException, MyExceptionClass
	{
		if(true){
			throw new BadFoodException();
		}
	}
	
	public static void main (String args[]) {
		MyException p = new MyException();
	try{
		p.checkFood("Apple");
	}catch(BadFoodException e){
		
		e.printStackTrace();
	} catch (MyExceptionClass e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{}
	

}
}