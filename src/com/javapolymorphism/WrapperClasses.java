package com.javapolymorphism;

public class WrapperClasses {

	public static void main(String[] args) {
		//Note: If you try convert string value "1100abc" into integer --> you will get NumberFormatException
		//Try to convert string value "TRUe"/"TRue"/whatever case of "true" value is into Boolean it will give you 'true'
		//Apart from "true" -- if you give any value like false/syed/abc/etc .. it will give 'false' only in terms of boolean conversion

		String s = new String("true1");
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		String s1 = "trUe";
		System.out.println(Boolean.parseBoolean(s1));
		
		int i = 100;
		String st=String.valueOf(i);
		System.out.println(st);

	}

}
