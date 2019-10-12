package com.javalogicalprograms;

public class DescendingOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11, 22, 55, 66, 12, 17, 48};
		int len = a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i] < a[j])
				{
					a[j] = a[i]+a[j]-(a[i]=a[j]);
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+", ");
		}
		
	}

}
