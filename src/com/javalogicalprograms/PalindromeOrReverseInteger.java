package com.javalogicalprograms;

public class PalindromeOrReverseInteger {

	public static void main(String[] args) {
		// number = 1234 --> 4321 (Palindrome)
		int num=1234, temp=0;
		int duplicatenum = num;
		while(num>=1)
		{
			temp = temp*10;
			temp = temp+num%10;
			num = num/10;			
		}

		System.out.println("Reverse Number of "+duplicatenum+" is: "+temp);
	}

}
