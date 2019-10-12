package com.javaconceptprograms;

public class DotEqualsANDdoubleEqualsExample {

	public static void main(String[] args) {
		/*Usually the talk in the java market is
		 * .equals() --> Refers to Content Comparison
		 *  ==  --> Refers to Reference comparison
		 *  Let see exactly what is true  
		 */
		
		System.out.println("******** Assign String Value without creating an object *********");
		String a = "Qhubaib";
		String b = "Qhubaib";
		
		System.out.println("In Case of String --> Using '==' Method --> a == b is: "+(a==b));
		System.out.println("In Case of String --> Using '.Equals' Method --> a.equals(b) is: "+(a.equals(b)));
		
		//In Both Cases it shows true --> Cause It a & b values should be referring to Same reference in String constant pool
		
		System.out.println("\n********* String Through Object Creation ***********");
		
		String c = new String("Qhubaib");
		String d = new String("Qhubaib");
		
		System.out.println("In Case of Object String --> Using '==' Method --> a == b is: "+(c==d));//Returns false why because These two are not referencing to the same 
		System.out.println("In Case of Object String --> Using '.Equals' Method --> a.equals(b) is: "+(c.equals(d)));//Content comparison is happening here
		
		System.out.println("\n******** String Buffer Introduction *********");
		
		StringBuffer e = new StringBuffer("Qhubaib");
		StringBuffer f = new StringBuffer("Qhubaib");
		
		System.out.println("In Case of StringBuffer --> Using '==' Method --> a == b is: "+(e==f));
		System.out.println("In Case of StringBuffer --> Using '.Equals' Method --> a.equals(b) is: "+(e.equals(f)));
		
		/*
		 * Both "String" & "StringBuffer" Classes are Child of Object Class
		 * The Method ".Equals()" is exist in Object Class
		 * Where as String Class has Override the ".Equals()" Method which is exist in Parent class
		 * Where as StringBuffer Class has NOT Override the ".Equals()" Method which is exist in Parent class
		 * Which Means the ".Equals()" Method in Object class is having content --> To Compare the References only
		 * So, In Case of StringBuffer Class it is "Reference" Comparison Only 
		 */

	}

}
