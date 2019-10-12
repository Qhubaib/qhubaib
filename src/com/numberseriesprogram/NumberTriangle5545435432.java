package com.numberseriesprogram;

public class NumberTriangle5545435432 {

	/*5
	 *5 4
	 *5 4 3
	 *5 4 3 2
	 *5 4 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


