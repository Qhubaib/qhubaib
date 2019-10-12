package com.stringprograms;

public class SubStringOperation {

	public static void main(String[] args) {

		String s = "Syed Qhubaib Ahmed.";
		
		String sub = s.substring(12);//String Begins with a character at specified index & extends to end of string
		System.out.println(s+" --> with only one index in substring method: --> "+sub);
		
		String sub1 = s.substring(0, 4);//It begins with begin index & Ends up with End Index - 1 value
		System.out.println(s+" --> By Using with begin & End Index:  --> "+sub1);
		
		System.out.println(s.subSequence(0, 4));//It Returns a CharSequence Interface

	}

}
