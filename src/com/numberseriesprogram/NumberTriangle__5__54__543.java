package com.numberseriesprogram;

public class NumberTriangle__5__54__543 {

	/*    5
	 *   54
	 *  543
	 * 5432
	 *54321  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		for(int i=num;i>=1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=num;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
