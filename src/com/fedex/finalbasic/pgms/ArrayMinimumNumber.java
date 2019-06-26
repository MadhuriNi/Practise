package com.fedex.finalbasic.pgms;

public class ArrayMinimumNumber {
	
	/* 
	 2,4,5
	 3,4,7
	 1,2,9
	 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		
		int min=a[0][0];
		
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				if(a[row][col]<min)
				{
					min=a[row][col];
				}
			}
		}
		
		System.out.println("The minimum number is "+min);
		
	}

}
