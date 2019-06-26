package com.fedex.finalbasic.pgms;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Payment $100 paid";
		
		boolean res=s.contains("$");
		System.out.println("Is $ present in our String : "+res);
		
		System.out.println("The character present at 8th position is : "+s.charAt(8));
		
		System.out.println("paid is present at the index : "+s.indexOf("paid"));
		
		System.out.println("The substring starting at 8th postion is : "+s.substring(8));
		
		//Printing the String in reverse
		
		String name="Madhuri";
		String output_name="";
		
		System.out.println("The length of name is : "+name.length());
		
		for(int i=name.length()-1;i>=0;i--)
		{
			output_name=output_name+name.charAt(i);
			
		}

		System.out.println("The reverse of the name is : "+output_name);
		
		if(name.equals(output_name))
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("The String is not a palindrome");
		}
	}

}


