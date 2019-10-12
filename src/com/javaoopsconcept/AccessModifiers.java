package com.javaoopsconcept;

public class AccessModifiers {

	public int publicid;
	int defaultnum;
	protected int protectednum;
	
	public static void main(String[] args) {
		// public can be accessible anywhere in the world(So there is no need of this Example
		// within the same package every method is accessible Except private Methods
		// Please CHECK THE "SampleCheckForModifiers" CLASS For further Reference (or) Clarity

		ModifierCheck obj = new ModifierCheck();
		obj.defaultModifier();
		obj.protectedModifier();
		obj.publicModifier();
		privateModifier();
	}
	
	private static void privateModifier()
	{
		System.out.println("This is 'Private Method'");
	}
	protected void protectedModifier()
	{
		System.out.println("This is 'Protected Method'");
	}
	void defaultModifier()
	{
		System.out.println("This is 'Default Method'");
	}
	public void publicModifier()
	{
		System.out.println("This is 'public Method");
	}
	
}

class ModifierCheck
{
	public static void main(String[] args) {
		ModifierCheck.privateModifier();
		AccessModifiers a = new AccessModifiers();
		a.publicid=12;
		a.defaultnum=23;
		a.protectednum=3;
		ModifierCheck ab = new ModifierCheck();
		ab.ac();
	}
	private static void privateModifier()
	{
		System.out.println("This is 'Private Method'");
	}
	private void ac()
	{
		System.out.println("ac");
	}
	protected void protectedModifier()
	{
		System.out.println("This is 'Protected Method'");
	}
	void defaultModifier()
	{
		System.out.println("This is 'Default Method'");
	}
	public void publicModifier()
	{
		System.out.println("This is 'public Method");
	}
}

