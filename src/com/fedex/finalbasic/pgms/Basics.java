package com.fedex.finalbasic.pgms;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("I started learning java");
		
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("The sum is : "+sum);
		
		Basics1 b1=new Basics1();
		String pass=b1.ValidateHeader();
		
		System.out.println(pass);
	}

}
