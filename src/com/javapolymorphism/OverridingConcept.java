package com.javapolymorphism;

public class OverridingConcept {

	// You can't change the return type of Overriding Method 
	// Method resolution always takes care by jvm based on Runtime Object
	// This is also known as Runtime polymorphism/dynamic polymorphism/late binding
	// new class() --> Refers to Object of the class
	// From Parent Reference Child Object we can call only parent methods (The rule is : if Parent Method is overridden than 
	// child method --> Then we can call only child Methods) --> You dont have the access to child class methods which are not Overridden 
	// From child reference child object we can call any method which is exist in the class(if method is overridden then it will take overridden method
	// otherwise it will take parent method only)
	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.add();
		System.out.println();
		
		Parent parentchild = new Child();
		parentchild.mul(1, 2);
		parentchild.addition();
		parentchild.parentonly();
		System.out.println();
		
		Child child = new Child();
		child.add();
		child.parentonly();
		child.childonly();
		
		//Child childparent = new Parent();
		
	}

}

class Parent
{
	public void add()
	{
		System.out.println("This is add() method in ***Parent*** Class");
	}
	public int sub()
	{
		System.out.println("This is sub() method with 'int' return type in ***Parent*** Class");
		return 0;
	}
	void mul(int i, int j)
	{
		System.out.println("This mul() method with 2 para in ***Parent*** Class");
	}
	public void addition()
	{
		System.out.println("This is addition() method in ***Parent*** class");
	}
	public void parentonly()
	{
		System.out.println("This method exist only in ***** Parent ***** Class");
	}
}

class Child extends Parent
{
	public void add()
	{
		System.out.println("This add() method in ***Child*** Class");
	}
	public int sub()
	{
		System.out.println("This is sub() method with 'int' return type in ***Child*** Class");
		return 10;
	}
	void mul(int i, int j)
	{
		System.out.println("This mul() method with 2 para in ***Child*** Class");
	}
	public void div()
	{
		System.out.println("This is div() method in ***Child*** class");
	}
	public void childonly()
	{
		System.out.println("This method exist only in ***** Child ***** Class");
	}
}