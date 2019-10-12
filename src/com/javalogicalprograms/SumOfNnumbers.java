package com.javalogicalprograms;

public class SumOfNnumbers {
	public static void main(String[] args) {
		// N numbers are : 5 , 1+2+3+4+5 = 15
		int num = 5;
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of '"+num+"' Numbers is: "+sum);
		
		
		int result = (num*(num+1))/2;
		System.out.println("Sum of '"+num+"' Numbers is: "+result);
	}

}
