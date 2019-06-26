package com.fedex.finalbasic.pgms;

public class ArrayHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,5,8,7,4};
		int sum=0;
		
		System.out.println("The length of array is : "+a.length);
		
		for(int i=0;i<a.length;i++)
		{

			sum=sum+a[i];
		}
		
		System.out.println("The sum is : "+sum);
		
		
		//finding the loaction of elemnt 8
		
		
		for(int i=0;i<a.length;i++)
		{

			if(a[i]==7)
			{
				System.out.println("The int 7 is present at index : "+i);
				System.out.println("The int 7 is present at the location : "+(i+1));
				break;
			}
		}
		
	}

}

