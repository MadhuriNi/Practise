package com.fedex.finalbasic.pgms;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock;

public class Inheritance_Son extends Inheritance_GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Inheritance_Son s=new Inheritance_Son();
		
		s.city();
		s.country();
		
	}

	public void SonActivities()
	{
		System.out.println("This is sons method");
	
	}
	
}


