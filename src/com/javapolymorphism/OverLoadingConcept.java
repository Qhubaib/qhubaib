package com.javapolymorphism;

public class OverLoadingConcept {
	//OverLoading also known as static polymorphism/compile-time polymorphism/early binding
	//Here there is no restrictions of return types, Let say if a method name is m1() with zero para's, we can't overload another m1() method with another return type
	//In OverLoanding Method Resolution Always takes care by compiler based on reference type
	//There is no restrictions on Access Modifiers -- which means we can reduce the scope of access modifiers also
	//There are no restrictions for return types for same methods (Like public void add() -- OK
	// public int add() -- CE
	
	int a = 21;
	int b = 33;
	int k;
	int i,j;

	public static void main(String[] args) {

		OverLoadingConcept obj = new OverLoadingConcept();
		obj.add();
		
		obj.add(0, 0);
		obj.add(obj.b);
		

	}
	
	public void add()
	{
		System.out.println("No parameter method() : "+(k=i+j));
	}
	public int add(int i,int j)
	{
		System.out.println(this.i);
		return i+j;
	}
	public void add(int i,int j,int k)
	{
		System.out.println(this.a);
	}
	void add(int i)
	{
		System.out.println(this.a);
	}

}
