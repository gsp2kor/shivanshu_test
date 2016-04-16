package com.test.shivanshuClass;


public class SimleStringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String s = "0123456789";
//		System.out.println(s.substring(0));
//		System.out.println(s.substring(4 , 11));
		
//		String x = new String("big surprise");
//		System.out.println( x.toString() );
		
//		String x = "     hi ";
//		System.out.println( x + "x" ); 
//		System.out.println( x.trim() + "x");
		
//		StringBuilder sb = new StringBuilder ("Shivanshu");
//		sb.append(new StringBuilder (" weds "));
//		sb.append("Shilpa").replace(sb.indexOf("w"),sb.indexOf("w")+4, "****");
//		System.out.println(sb);
		
		
		String x = "abc";
		String y = x.concat("def").toUpperCase().replace('C','x').replace('x', 'B');
		//chained methods
		System.out.println("y = " + y);
		
		
		
		
	}

}
