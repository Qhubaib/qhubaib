package com.javalogicalprograms;

public class SmallestAnDLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Another Usage --> do sorting in Asc or Desc --> Make the first & Last Element as smallest and Largest
		int a[] = {29, 16, 44, 55, 23, 65, 27};
		
		int smallest = a[0];
		int largest = a[0];
		int len = a.length;
		
		for(int i=1;i<len;i++)
		{
			if(a[i]<smallest)
				smallest = a[i];
			if(a[i]>largest)
				largest = a[i];
		}
		
		System.out.println("Smallest number is: "+smallest+", Largest Number is: "+largest);
	}

}
