package com.stringprograms;

public class SwapingTwoStrings {

	public static void main(String[] args) {

		String s = "Syed";
		String s1 = "Qhubaib";
		
		System.out.println("s value as: "+s+" ==> AND --> s1 value as: "+s1);
		
		s = s+s1;
		s1 = s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		
		System.out.println("s value swapped as: "+s+" ==> AND --> s1 value swapped as: "+s1);

	}

}
