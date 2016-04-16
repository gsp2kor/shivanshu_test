package com.test.timeAndDate;

import java.util.*;


public class TestDate {

	
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		Calendar c = Calendar.getInstance();
		c.setTime(d1); // #1
		if(c.SUNDAY == c.getFirstDayOfWeek()) // #2
		System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is "
		+ c.get(c.DAY_OF_WEEK)); // #3
		c.add(Calendar.MONTH, 1); // #4
		Date d2 = c.getTime(); // #5
		System.out.println("new date " + d2.toString() );

	}

}
