package com.numberseriesprogram;

public class NumberTriangle112112321 {

	/*1
	 *121
	 *12321
	 *1234321
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		for(int i=1;i<=4;i++)
		{
			int l = 0;
			for(int j=1;j<=k;j++)
			{
				if(j<=i)
					l++;
				else
					l--;
				System.out.print(l);
			}
			k=k+2;
			System.out.println();
		}
		
		System.out.println("************* Next Method **************");
		
		//Method 2
		int u;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			u= i;
			while (u>1)
			{
				u--;
				System.out.print(u);
			}
			System.out.println();
		}

	}

}
