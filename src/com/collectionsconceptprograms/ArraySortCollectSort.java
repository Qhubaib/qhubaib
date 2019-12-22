package com.collectionsconceptprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortCollectSort {

	public static void main(String[] args) {

		String s[] = {"Syed Roshan Zameer","Syed Sadaddin","Syed Qhubaib Ahmed","Syed Mohammad Hasnain"};
		Arrays.sort(s);
		System.out.println("Ascending order of string array directly with object: "+s.toString()+"\n");
		// Out put for the above is Ascending order of string array: [Ljava.lang.String;@15db9742
		
		for(String str:s)
		{
			System.out.println("Ascending Order is: "+str); //it will print the values in Ascending order
		}
		
		Arrays.sort(s,Collections.reverseOrder());
		System.out.println();
		
		for(String str:s)
		{
			System.out.println("Descending Order is: "+str); //it will print the values in Descending order
		}
		
		System.out.println("\nCoverting String into ArrayList: ");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String str:s)
		{
			arrayList.add(str);
		}
		
		
		Collections.reverse(arrayList);
		System.out.println("Conversion of ArrayList Values are : "+arrayList+"\n");
		
		Collections.sort(arrayList,Collections.reverseOrder());
		System.out.println("Conversion of ArrayList Values by using collections.reverse order: \n "+arrayList);
	}

}
