package com.javaconceptprograms;

class Family
{
	int id;
	String name;
	static String father;
	
	static
	{
		System.out.println("First static block");
	}
	{
		System.out.println("instance block");
	}
	public Family()
	{
		id = 3;
		name = "Qhubaib";
		
		System.out.println("In Constructor");
	}
	
	static
	{
		System.out.println("In static Block");
	}
	{
		System.out.println("Second instance block");
	}
	
	public void show()
	{
		System.out.println("Student Details :: ID: "+id+", NAME: "+name+", FATHER: "+father);
	}
}

public class StaticDemo {
	/*
	 * static variable are same for all the objects
	 * non static variables different for all the objects
	 * non static cannot be used inside the static block
	 * static block & instance block will load first as soon as we create the object of a class
	 * static block load only once, but instance block will load multiple times as soon as we load the class
	 * 
	 * Note: Static block calls when load a class(class loads only once if you create 'n' no.of objects also
	 * 		 Constructor calls when you create an object
	 * 
	 * 
	 *	First static block
		In static Block
		
		instance block
		Second instance block
		In Constructor
		instance block
		Second instance block
		In Constructor
		Student Details :: ID: 3, NAME: Qhubaib, FATHER: Father of Qhubaib Ahmed
		instance block
		Second instance block
		In Constructor
		Student Details :: ID: 1, NAME: Roshan Zameer, FATHER: Father of Qhubaib Ahmed
		Student Details :: ID: 2, NAME: Sadaddin, FATHER: Father of Qhubaib Ahmed
		Student Details :: ID: 4, NAME: Hasnain, FATHER: Father of Qhubaib Ahmed

	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Family one = new Family();
		one.id = 1;
		one.name = "Roshan Zameer";
		one.father = "Mr. Syed Basha";
		
		
		Family two = new Family();
		two.id = 2;
		two.name = "Sadaddin";
		
		two.father = "Father of Qhubaib Ahmed";
		
		Family three = new Family();
		three.show();
		
		Family four = new Family();
		four.id = 4;
		four.name = "Hasnain";
		one.show();
		two.show();
		
		four.show();
		
	}

}
