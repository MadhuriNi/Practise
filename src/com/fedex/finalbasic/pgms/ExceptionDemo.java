package com.fedex.finalbasic.pgms;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {	
		int a=7;
		int b=0;
		int c=a/b;
	}
	catch(Exception e)
	{
		System.out.println("The Exception is : "+e);
	}
		

	}

}
