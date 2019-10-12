package com.javaoopsconcept;

public class InterfaceConcept {

	public static void main(String[] args) {


		I interf = new Test();
		int k=interf.m2();
		System.out.println(k);
		
		Test t=new Test();
		t.i=6;
		int j=t.m2();
		t.show();
		System.out.println(j);
		
		Abstract ab = new Test();
		int l=ab.m2();
		System.out.println(l);
		
		II abs = new Tester();
		System.out.println(abs.getClass());
		
		Z z=new Z();
		z.display();
		z.m1();

	}

}

interface I
{
	public void m1();
	public int m2();
	default void display()
	{
		System.out.println("This is interface I Method");
	}
}
class Z implements I
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
interface II
{
	public void m1();
	public int m2();
}

abstract class Abstract implements I,II
{
	public void m1()
	{
		System.out.println("m1 Method is implemented: "+getClass());
	}
	public Abstract()
	{
		m1();
	}
}

abstract class Abstraction extends Abstract implements I,II
{
	public int m2()
	{
		return 10;
	}
	public Abstraction()
	{
		m1();
	}
}

class Test extends Abstract
{

	int i = 5;
	public int m2() {
		if(i<=5)
			return 0;
		else
			return -1;
	}
	
	public void show()
	{
		System.out.println("show Method");
	}
}

class Tester extends Abstraction
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
