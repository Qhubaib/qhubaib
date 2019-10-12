package com.javalogicalprograms;

public class AscendingOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11, 22, 55, 66, 12, 17, 48};
		int b = 0;
		int len = a.length;
//		System.out.println(a.length);
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i] > a[j])
				{
					//a[j] = a[i]+a[j]-(a[i]=a[j]);
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+", ");
		}
		
	}

}
