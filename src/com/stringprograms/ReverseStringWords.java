package com.stringprograms;

public class ReverseStringWords {

	public static void main(String[] args) {
		
		String s = "Assalamalaikum Qhubaib Ahmed Bhai";
		String a[] = s.split(" ");
		String rev = "";
		for(int i=a.length-1;i>=0;i--)
		{
			rev = rev + a[i]+" ";
		}

		System.out.println("The String "+s+"--> Reverse words --> is: "+rev);
	}

}
