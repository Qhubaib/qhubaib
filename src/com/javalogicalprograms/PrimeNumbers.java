package com.javalogicalprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// 2,3,5,7,11,13,17 ....
		//Method 1 --> To fetch the prime number upto "num" values
//		int num = 50;
//		for(int i=2;i<=num;i++)
//		{
//			for(int j=2;j<=50;j++)
//			{
//				if(i == j)
//					System.out.print(i+" ");
//				if(i%j == 0)
//					break;
//			}
//		}
		System.out.println(isPrime(29));

		numberOfPrime(56);
	}
	
	//Method To check whether the given number is prime or not
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	//it will print the prime numbers 
	public static void numberOfPrime(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i))
				System.out.print(i+", ");
		}
	}

}
