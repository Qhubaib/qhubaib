package com.javaconceptprograms;

public class StringStringBufferConcept {

	public static void main(String[] args) {
		/*
		 * String --> Immutable in Nature
		 * StringBuffer --> Mutable in Nature & Also Thread Safe(Synchronized)
		 * StringBuilder --> Mutable in Nature & Also it is Non-Thread Safe(Non - Synchronized)
		 * Here Thread Safe --> It wont allow you to access Multiple threads at a time
		 * Only one thread will perform the action at a time --> Here it will be synchronized
		 */

		String s = "Qhubaib";
		s.concat("Ahmed");
		s.replace('Q', 'q');
		System.out.println(s);
		
		String s1 = new String("Syed ");
		s1.concat(s);
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Syed ");
		sb.append("Qhubaib");
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		/*
		 * Which means if you create a String Literal (or) String Object
		 * You want to add some value (or) Replace some value you should give the Object reference to concat/replace Methods ...
		 * So, the String Class is IMMUTABLE in Nature (Which means non changing value)
		 * Where as in case of StringBuffer Class if you do any operation the object will change accordingly
		 */
		
		StringBuilder sb1 = new StringBuilder("Qhubaib ");
		sb1 = sb1.append(s1); //If you assign the object reference (or) not the output wont change
		System.out.println(sb1);

	}

}
