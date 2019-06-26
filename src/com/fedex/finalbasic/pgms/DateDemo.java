package com.fedex.finalbasic.pgms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		
		System.out.println(d.toString());
		
		System.out.println("The current date is : "+d.getDate()+"/"+d.getMonth()+"/"+d.getYear());
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));

		
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
	}

}
