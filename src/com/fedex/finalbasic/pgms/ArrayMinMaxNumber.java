package com.fedex.finalbasic.pgms;

public class ArrayMinMaxNumber {
	
	/* 2,4,5
	   3,0,7
	   1,2,9
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find minimum number in the array and then maximum number from min number column
		//0 is the minimum number and is in column 2, max number in that column is 4
		
		
		int a[][]= {{2,4,5},{3,0,7},{1,2,9}};
		
		int min=a[0][0];
		int mincolumn=0;
		
		for (int row=0;row<3;row++)
		{
			for (int col=0;col<3;col++)
			{
				
				if(a[row][col]<min)
				{
					min=a[row][col];
					mincolumn=col;
				}
			}
		}
		
		System.out.println("Minimum number is "+min);
		System.out.println("Minimum number column is "+mincolumn);
		
		int i=0;
		int max=a[0][mincolumn];
		
		while(i<3)
		{
			if(a[i][mincolumn]>max)
			{
				max=a[i][mincolumn];
			}
			
			i++;
		}
		
		System.out.println("The maximum number in column "+mincolumn+" is : "+max);
	}

}
