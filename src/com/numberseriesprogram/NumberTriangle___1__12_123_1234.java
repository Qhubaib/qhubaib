package com.numberseriesprogram;

public class NumberTriangle___1__12_123_1234 {

	/*   1
	 *  12
	 * 123
	 *1234
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
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
