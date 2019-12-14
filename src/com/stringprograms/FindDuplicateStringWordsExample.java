package com.stringprograms;

import java.util.*;

public class FindDuplicateStringWordsExample {

	public static void main(String[] args) {

		String s = "Hey java i am using java is i Hey java java hey".toLowerCase();
		String a[] = s.split(" ");
		int count;
		
		for(int i=0;i<a.length;i++)
		{
			count = 1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";
				}
			}
			if(count>1 && a[i]!="0")
			{
				System.out.println("The value: '"+a[i]+"' is Repeated: "+count+" Times");
			}			
		}
		
		//Method 2
		System.out.println("************** Next Method Using Set *************");
		
		String ss = "Hey syed this is this syed hey what syed this hey syed".toLowerCase();
		String[] q = ss.split(" ");
		int counter=1;

		for(int i=0;i<q.length;i++)
		{
			for(int j=i+1;j<q.length;j++)
			{
				if(q[i].equals(q[j]))
				{
					counter++;
				}
			}
			if(counter>1)
			{
				System.out.println("The value: '"+q[i]+"' is Repeated: "+counter+" Times");
				ss = ss.replaceAll(q[i],"");
				System.out.println(ss);
				q=ss.split(" ");
				counter=1;
			}
		}

		/***
		 * Output for above two
		 * The value: 'hey' is Repeated: 3 Times
			The value: 'java' is Repeated: 4 Times
			The value: 'i' is Repeated: 2 Times
			************** Next Method Using Set *************
			The value: 'hey' is Repeated: 3 Times
			The value: 'syed' is Repeated: 4 Times
			The value: 'this' is Repeated: 3 Times
			The value: '' is Repeated: 3 Times
			The value: '' is Repeated: 2 Times

		 */

		
		

	}

}
