package com.javalogicalprograms;

public class SumOfitsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2589, duplicatenum = num;
		int sum = 0;
		while(num >= 1) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.print("Sum of Its digits "+duplicatenum+" is: "+sum);

	}

}
