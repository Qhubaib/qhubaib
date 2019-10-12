package com.stringprograms;

public class StringRegularExpressionExample {

	public static void main(String[] args) {

		String s = "*@#%String $RegEx123";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s+" --> By Using Regular Expression - Remove All Junk characters -->"+s1);

		System.out.println("************ Next Statement *************");
		
		String s2 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s+" --> By Using Regular Expression - Remove All Junk characters -->"+s2);
		
		String str = "lalu*&$@Babu1";
		String test = str.replaceAll("[^0-9]", "");
		System.out.println("Testing : "+test);
	}

}
