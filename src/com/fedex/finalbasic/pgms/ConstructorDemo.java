package com.fedex.finalbasic.pgms;

public class ConstructorDemo {
	
	
	public ConstructorDemo()
	{
		System.out.println("Am in Constructor");
	}	
	
	public ConstructorDemo(int a,int b)
	{
		System.out.println("Am in the parametrised constructor");
		int c=a+b;
		System.out.println("The sum of two integers in constructor is : "+c);
	}
	
	public ConstructorDemo(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cdp=new ConstructorDemo(4,5);
		ConstructorDemo c=new ConstructorDemo("hii");
		cd.getData();
		
		
	}
	
	public void getData()
	{
		System.out.println("Am in getData function");
	}

}
