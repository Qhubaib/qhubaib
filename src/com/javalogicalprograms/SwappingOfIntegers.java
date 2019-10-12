package com.javalogicalprograms;

public class SwappingOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3, x = 0;
		
		System.out.println("Actual values of 'a' is: "+a+" 'b' is: "+b);
		//Method 1 --> By Using  3rd Variable
		x = a;
		a = b;
		b = x;

		System.out.println("First Method After swapping values of 'a' is: "+a+" 'b' is: "+b);
		
		//Method 2 --> Without using 3rd variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Second Method After swapping values of 'a' is: "+a+" 'b' is: "+b);
		
		//Method 3 --> Within one line
		b = a+b-(a=b);
		System.out.println("Third Method After swapping values of 'a' is: "+a+" 'b' is: "+b);
	}

}
