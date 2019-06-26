package com.fedex.finalbasic.pgms;

import net.bytebuddy.implementation.bind.annotation.Super;

public class SyntelCDemo extends FedexPDemo{
	
	String name="Pune";
	
   public SyntelCDemo()
   {
	   super();
	   System.out.println("Am in the Syntel Constructor");
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SyntelCDemo s=new SyntelCDemo();
		s.getStringData();
		s.getData();
	}
	
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}

	
	public void getData()
	{
		System.out.println("Am in the Syntel Child class");
		super.getData();
	}
}
