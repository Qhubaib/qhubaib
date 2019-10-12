package com.numberseriesprogram;

public class NumberTriangle5_45_345_2345 {

	/*5
	 *45
	 *345
	 *2345
	 *12345
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=5;i>=1;i--)
		{
			int k = i;
			for(int j=5;j>=i;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}
