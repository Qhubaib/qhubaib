package com.stringprograms;

public class CompareToMethodInString {

	public static void main(String[] args) {

		String s1 = "Qhubaib";
		String s2 = "Munna";

		int value = s1.compareTo(s2);
		System.out.println(value);// 4

		int value1 = s2.compareTo(s1);
		System.out.println(value1);// -4
		
		String name = "My Name is Syed Qhubaib Ahmed";
		String names[] = name.split(" ");
		stringWordsSortingOrder(names, "Ascending");
		stringWordsSortingOrder(names, "Descending");
		
		/*
		 * 4
			-4
			is Syed Qhubaib Name My Ahmed 
			Ahmed My Name Qhubaib Syed is 
		 */
	}

	public static void stringWordsSortingOrder(String str[], String sort) {
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (sort.equalsIgnoreCase("Ascending")) {
					if (str[i].compareTo(str[j]) < 0) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				} else {
					if (str[i].compareTo(str[j]) > 0) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}

}
