package com.fedex.finalbasic.pgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(0, "hiiiii");
		hm.put(1, "hows u");
		hm.put(2,"good");
		hm.put(3,"morning");
		
		System.out.println("The hashMap is : "+hm);
		
		for(int i=0;i<4;i++)
		{
		System.out.println(hm.get(i));
		}
		
		Set es=hm.entrySet();
		System.out.println("The entry set is : "+es);
		
		Iterator it= es.iterator();
		
		
		
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
		
	}

}
