package com.fedex.finalbasic.pgms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Orlando");
		hs.add("Los Angeles");
		hs.add("Pune");
		hs.add("Orlando"); //it does not allow duplicates
		
		hs.add("travel");
		hs.add("updown");
		
		System.out.println("The hashset is : "+hs);
		System.out.println("Size of the hashset : "+hs.size());
		
		Iterator<String> i=hs.iterator();
		
		System.out.println("The element present at first index is : "+i.next());
		System.out.println("The element present at second index is : "+i.next());
		
		while(i.hasNext())
		{
			System.out.println("Yes its present");
			i.next();
		}
		
	}

}
