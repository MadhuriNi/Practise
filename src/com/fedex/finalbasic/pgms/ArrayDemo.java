package com.fedex.finalbasic.pgms;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a[]={2,3,4,5,1};
		
		int a[]=new int[5];
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=1;
		
		
	
		for(int i=0;i<a.length;i++)
		{
			//to print on separate lines
			System.out.println(a[i]+",");
			
			//to print on same line
			//System.out.print(a[i]+",");
		}
		
	}

}
