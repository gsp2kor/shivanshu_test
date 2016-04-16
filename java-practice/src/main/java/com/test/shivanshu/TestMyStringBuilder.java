package com.test.shivanshu;

public class TestMyStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
StringBuilder s1= new StringBuilder("WOW");
StringBuilder s2 = new StringBuilder("WOW");

boolean x = s1==s2;
boolean y = s1.equals(s2);

System.out.println("String Builder " + " == is " + x + " equals " + y);

String s3 = "AA";
String s4 = "AA";
String s5 = new String("AA");
String s6 = new String(s3);
boolean x1 = s3==s4;
boolean y1 = s3.equals(s4);

boolean x2 = s5==s6;
boolean y2 = s5.equals(s6);

System.out.println("String Class " + " == is " + x1 + " equals " + y1);
System.out.println("String Class New Operator " + " == is " + x2 + " equals " + y2);

StringBuilder s7= new StringBuilder("WOW");
StringBuilder s8 = new StringBuilder(s7);

boolean x3 = s7==s8;
boolean y3 = s7.equals(s8);

System.out.println("String Builder passing object to const " + " == is " + x3 + " equals " + y3);




	}

}
