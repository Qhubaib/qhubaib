package com.javaconceptprograms;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		// this keyword is used to refer the current instance
		// You can use "this" keyword to avoid naming conflicts in the method/constructor of your instance/object
		

		This obj = new This();
		obj.setData(22, 33);
		obj.show();
		
		This1 obj1 = new This1();
		obj1.setData(22, 33);
		obj1.show();
	}

}

class This
{
	int a;
	int b;
	public void setData(int a,int b)
	{
		a=a;
		b=b;
	}
	public void show()
	{
		System.out.println("The value of a: is "+a+", & The value of b: is "+b);
	}
}

class This1
{
	int a;
	int b;
	public void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println("The value of a: is "+a+", & The value of b: is "+b);
	}
}
