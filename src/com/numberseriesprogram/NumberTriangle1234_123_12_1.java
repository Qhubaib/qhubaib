package com.numberseriesprogram;

public class NumberTriangle1234_123_12_1 {

	public static void main(String[] args) {

		/*
		 * 1234
		 *  123
		 *   12
		 *    1
		 */

		int num = 4;
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			for(int k=num;k>=i;k--)
			{
				if(k==4 && i==1)
					break;
				System.out.print(" ");
			}
		}
		
		System.out.println("************* Next Method **************");
		
		int num1 = 4;
		for(int i=num1;i>=1;i--)
		{
			for(int k=num1-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
