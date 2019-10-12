package com.javaconceptprograms;

import com.javaoopsconcept.*;

/*
 * We can only create the object for public classes from outside packages
 * If you have a default class you can create the object for that particular class within the same package
 * if you try to create an object for that default class outside the package --> you will get CE.
 * and also you cannot inherit that default class outside the package---> you will get CE.
 * CE is --> "Change visibility of 'ClassName' to 'public'
 * The same concept is available in case of variables also
 */

public class AccessModifiersCheckOutsidePackage extends AccessModifiers {

	public static void main(String[] args) {
		//'AccessModifiers' is class we importing from 'com.javaoopsconcept.AccessModifiers' package
		// Note: **** To access protected methods from outside package, we should call protected method by using 
		// **** child Reference & child Object *** Otherwise we cannot access "protected" method ******
		
		AccessModifiersCheckOutsidePackage obj = new AccessModifiersCheckOutsidePackage();
		//obj.defaultModifier(); --> Default Modifier Method is not allowed to access outside the package otherwise we get CE.
		obj.publicModifier();
		obj.protectedModifier();
		obj.protectednum=66;
		//obj.defaultnum=90; --> Cannot accesible outside package for int k=20;(like this variables), so give it as 
		// protected int num;/public int num;
		
		//Sample s = new Sample();

		AccessModifiers am = new AccessModifiersCheckOutsidePackage();
		am.publicModifier();
		am.publicid=55;
		
	
		
	}

}

class AccessModifiersCheckOutsidePackage2 extends AccessModifiers{

	public static void main(String[] args) {
		//'AccessModifiers' is class we importing from 'com.javaoopsconcept.AccessModifiers' package
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicModifier();
		//obj.protectedModifier(); --> Protected Modifier Method is not allowed to access outside the package 
		//with parent Reference & parent Object --> otherwise we get CE.
		
		AccessModifiers obj2 = new AccessModifiersCheckOutsidePackage2();
		obj2.publicModifier();
		//obj.protectedModifier(); --> Protected Modifier Method is not allowed to access outside the package 
		// with parent Reference & child Object --> otherwise we get CE.
		
		AccessModifiersCheckOutsidePackage2 obj3 = new AccessModifiersCheckOutsidePackage2();
		obj3.publicModifier();
		obj3.protectedModifier();//we can access "protected" method with child class Reference & Object
	}
}


