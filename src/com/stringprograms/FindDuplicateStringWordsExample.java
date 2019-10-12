package com.stringprograms;

import java.util.*;

public class FindDuplicateStringWordsExample {

	public static void main(String[] args) {

		String s = "Hey java i am using java is i Hey java java";
		String a[] = s.split(" ");
		int count=1;
		String c,d;
		
		for(int i=0;i<a.length;i++)
		{
			c=a[i];
			//count = 1;
			for(int j=i+1;j<a.length;j++)
			{
				d=a[j];
				if(c.equalsIgnoreCase(d))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("The value: '"+c+"' is Repeated: "+count+" Times");
			}
			s = s.replaceAll(a[i], "");
			//System.out.println(s+"      "+a.toString());
			count = 1;
			//i--; // --> i value decrement is not required, Cause a[] value is fixed
		}
		
		//Method 2
		System.out.println("************** Next Method Using Set *************");
		
		Set<String> set = new HashSet<>();
		for(String sub:a)
		{
			if(set.add(sub)==false)
			{				
				System.out.println("Duplicate Names in Array is: "+sub+" --> it repeats  Times");
			}
			//counter = 1;
		}

	}

}
