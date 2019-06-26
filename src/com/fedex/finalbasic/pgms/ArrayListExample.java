package com.fedex.finalbasic.pgms;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Madhuri");
		a.add("Nirmale");
		a.add("Mahale");
		a.add(0, "Mrs");
		
		System.out.println("The arrayList is : "+a);
		
		Boolean res=a.contains("Madhuri");
	    System.out.println("Madhuri is present in the arrayList : "+res);
		
		System.out.println("Nirmale is present at the index : "+a.indexOf("Nirmale"));
		
		System.out.println("String present at location 3 : "+a.get(3));
		
		System.out.println("Is the arrayList empty : "+a.isEmpty());
		
		System.out.println("The size of the array is : "+a.size());
		
		
		
		

	}

}
