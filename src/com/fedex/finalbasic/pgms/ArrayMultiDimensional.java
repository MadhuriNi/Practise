package com.fedex.finalbasic.pgms;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{2,4,5},{3,4,7}};
		
		System.out.println("The length of array is : "+a.length);
		
		for(int r=0;r<2;r++)
		{
			
			System.out.print("{");
			for(int c=0;c<3;c++)
			{
				System.out.print(a[r][c]+",");
			}
			
			
			System.out.println("}"+"");
			
			
		}
			
			
	}

}
