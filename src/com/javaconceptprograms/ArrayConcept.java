package com.javaconceptprograms;

import java.util.Arrays;
import java.util.*;

public class ArrayConcept {

	public static void main(String[] args) {

		String s = "Syed Qhubaib Ahmed Roshan Sadaddin Hasnaino";
		String t[] = s.split(" ");
		
		String a[] = {"Syed", "Qhubaib", "Ahmed", "Roshan", "Sadaddin", "Hasnain"};
		String b[] = new String[5];
		b[0] = "Syed";
		b[1] = "Roshan";
		b[2] = "Sadaddin";
		b[3] = "Qhubaib";
		b[4] = "Hasnain";
		
		System.out.println(t);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println("***** Fetch the values through for each method********");
		for(String name:a)
		{
			System.out.print(name+" ");
		}

		System.out.println();
		
		System.out.println("********* Arrays Comparision By using Predefined Arrays Class **************");
		//Arrays Comparision
		System.out.println(Arrays.equals(t, a));
		
		System.out.println("*********** Arrays Comparision by using Logic ************");
		
		int tlen = t.length;
		int alen = a.length;
		int count = 0;
		if(tlen == alen)
		{
			for(int i=0;i<tlen;i++)
			{
				if(t[i].equals(a[i]))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		if(count == alen)
		{
			System.out.println("Both the Arrays are equal");
		}
		else
		{
			System.out.println("Both the Arrays are not equal");
		}
		
		System.out.println("************* Convert Arrays as ArrayList ************");
		List<String> list = Arrays.asList(a);
		System.out.println("Converted Array 'a' to the List is: "+ list);
		
		System.out.println("************** Some More Methods in Array **************");
		System.out.println(a.equals(t));
		
		
	}

}
