package com.javaoopsconcept;

public class InterfaceJava8Features {

	public static void main(String[] args) {
		// interface --> only declaration is available --> implementation part is with child class
		// from java 8 we can have default methods also in interfaces
		// in interface every method is public & abstract Whether we declare it or not
		// Every variable inside interface is by default public , static & final whether we are declare it or not
		// For interface variables compulsory we need to perform initialization at the time of declaration || CE
		// inside interface we can't declare instance & static blocks -- otherwise we will get CE
		// The default method which we are implemented in Interfaces we need to implement these methods as public in child class

		Testing1 obj = new Testing1();
		obj.show();
		//Testing1 obj1 = new Testing2();
		
	}

}

interface Interface1
{
	void m1();
	default void m2()
	{
		System.out.println("default m2() in interface1 :: ");
	}
}

interface Interface2
{
	void m1();
	default void m2()
	{
		System.out.println("default m2() in interface2 :: ");
	}
}

abstract class Abstraction1 implements Interface1
{
	static
	{
		System.out.println("Static Block");
	}
	public void show()
	{
		System.out.println("This is show() method");
	}
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("Second static Block");
	}
	public Abstraction1()
	{
		System.out.println("Abstraction1 is in as--> constructor "+getClass());
	}
	{
		System.out.println("Second instance block");
	}
}

class Testing implements Interface1,Interface2
{

	@Override
	public void m1() {
		System.out.println("Method m1() ");
	}

	public void m2()
	{
		System.out.println("default m2() method implemented in Test Class:: ");
	}
}

class Testing1 extends Abstraction1
{

	@Override
	public void m1() {
		System.out.println("This is m1() in Testing1 class:: ");		
	}
	
}

class Testing2 extends Testing1
{
	
}
