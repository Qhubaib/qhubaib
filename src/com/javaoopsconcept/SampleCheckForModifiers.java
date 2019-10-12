package com.javaoopsconcept;

public class SampleCheckForModifiers {

	public static void main(String[] args) {
		// In this class we are checking the Modifiers accessibility
		// This ModifierCheck class is exist in the same package so it is not require to import the package separately
		// Please check "AccessModifiersCheckOutsidePackage" Class which is exist in "com.javaconceptprograms" Package
		// For further clarity & Reference
		// NOTE: AS THIS 'ModifierCheck' CLASS IS DEFAULT CLASS SO IT IS NOT ACCESIBLE OUTSIDE THE PACKAGE
		// FOR THIS REASON I HAVE MADE SAME METHODS IN 'AccessModifiers' CLASS & CHECKING IN "AccessModifiersCheckOutsidePackage" CLASS
		
		
		ModifierCheck obj = new ModifierCheck();
		obj.defaultModifier();
		obj.protectedModifier();
		obj.publicModifier();
		System.out.println();
		
		Sample s = new Sample();
		s.defaultMethod();
		s.protectedMethod();
		s.publicMethod();

		AccessModifiers a = new AccessModifiers();
		a.defaultnum=10;
		a.protectednum=20;
		a.publicid=30;
	}

}
