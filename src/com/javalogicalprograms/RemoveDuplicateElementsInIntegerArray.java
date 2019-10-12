package com.javalogicalprograms;

import java.util.*;

public class RemoveDuplicateElementsInIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {25, 26, 11, 16, 25, 11, 35, 25, 16, 11};
		int len = a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i] == a[j])
				{
					a[j] = a[len-1];
					len--;
					j--;
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+", ");			
		}
		
		System.out.println();
		System.out.println("************* Next Method **************");
		
		//Method 2
		Set<Integer> s = new TreeSet<>();
		
		for(int i:a)
		{
			s.add(i);
		}

		System.out.println();
		System.out.print("Unique Elements are: "+s);
	}

}
