package com.javalogicalprograms;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		// Method 1
		int a[] = {11, 12, 13, 14, 16};
		int num = 0;
		int num1 = 0;
		
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i]+1 != a[i+1])
				System.out.println(a[i+1]-1);
		}
		
		//Method 2
		for(int i=0; i<a.length; i++) {
			
			num = num + a[i];
		}

		for(int i=a[0]; i<=a[a.length-1]; i++) {
			
			num1 = num1 + i;
		}
		
		System.out.println("Missing Number is: "+(num1-num));
	}

}
