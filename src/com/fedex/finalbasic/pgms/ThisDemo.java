package com.fedex.finalbasic.pgms;

public class ThisDemo {

	int a=2;
	
	public void getData()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);  //this refers to the class level/global variables
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td=new ThisDemo();
		td.getData();
		
	}

}
