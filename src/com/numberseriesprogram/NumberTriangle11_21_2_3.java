package com.numberseriesprogram;

public class NumberTriangle11_21_2_3 {

	/*   1
	 *  1 2
	 * 1 2 3
	 *1 2 3 4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		
		for(int i=1;i<=num;i++)
		{
			for(int k=num-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
