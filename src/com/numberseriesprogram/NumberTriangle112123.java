package com.numberseriesprogram;

public class NumberTriangle112123 {

	/*1
	 *1 2
	 *1 2 3
	 *1 2 3 4
	 *1 2 3
	 *1 2
	 *1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=num-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
