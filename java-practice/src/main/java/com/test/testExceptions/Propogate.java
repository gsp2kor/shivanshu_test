package testExceptions;

public class Propogate {
	
	
	public String reverse(String s)throws MyExceptionClass{
		String reverseStr = "";
		int x = s.length();
		if(x == 0){
		
			throw new MyExceptionClass();
		}else{
			
			
			for(int i=s.length()-1;i>=0;--i) {
			reverseStr += s.charAt(i);
			}
			System.out.println(reverseStr);
			
			
		}
		return reverseStr;
			
	}

	
	public static void main(String[] args) {
	
		Propogate p = new Propogate();
		try{
			p.reverse("");
			
		}catch(MyExceptionClass e) { }
		finally{System.out.println("done");}
		

	}

}
