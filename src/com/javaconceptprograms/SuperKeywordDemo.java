package com.javaconceptprograms;

public class SuperKeywordDemo {

	public static void main(String[] args) {
		// super is used to refer immediate parent class objects
		// For child class default constructor/para constructor by default we are having "super()"
		// if we want to have para constructor of parent also through child class then we have to give "super(i)"
		// if we want print the variable value of parent through "super.i"
		// if want to use super keyword in child class we need to use either in method/either in constructor

		B b = new B();
		b.superkey();
	}

}

class Aaa
{
	int i=5;
	public Aaa()
	{
		System.out.println("In Class A default constructor");
	}
	public Aaa(int i)
	{
		System.out.println("In Class A Parameterized constructor");
	}
	public void print()
	{
		System.out.println("the value of 'i' is: "+i);
	}
}

class B extends Aaa
{
	int i = 10;
	public B()
	{
		super(22);
		System.out.println("In Class B default constructor");
	}
	public B(int i)
	{
		System.out.println("In Class B Parameterized constructor");
	}
	public void print()
	{
		System.out.println("the value of 'i' is: "+i);
	}
	public void superkey()
	{
		super.print();
	}
	
}
