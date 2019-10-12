package com.javaconceptprograms;

public class CountNoOfObjectsCreated {

	public static void main(String[] args) {
		// Whenever we are creating Object The Class will start as the new one
		// Even the class is having the another Object also
		// For Example Here we have created 6 Objects
		// When we try to call the 'count' variable it will be called once , So the value of 'count' always be 1
		// To overcome this we need to mention the count variable as static
		
		A a = new A();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		int count = a.count;
		System.out.println(count);

	}
}

class A
{
	static int count = 0;
	public A()
	{
		count++;
	}
}
