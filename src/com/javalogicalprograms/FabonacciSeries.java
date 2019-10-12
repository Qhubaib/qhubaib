package com.javalogicalprograms;

public class FabonacciSeries {

	public static void main(String[] args) {
		// Fabonacci Series -- 1, 1, 2 , 3, 5, 8, 13
		
		int a=0, b=0, c=1;
		int e,f=0,g=1;
		while(c<56)
		{
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a+b;
		}
		System.out.println();
		
		int num = 56;
		for(int i=0;i<num;i=g)
		{
			System.out.print(g+" ");
			e = f;
			f = g;
			g = e+f;
		}

	}

}
