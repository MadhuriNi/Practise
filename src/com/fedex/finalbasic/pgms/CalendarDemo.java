package com.fedex.finalbasic.pgms;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.AM_PM));
	    System.out.println(cal.get(Calendar.MINUTE));
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	}

}
