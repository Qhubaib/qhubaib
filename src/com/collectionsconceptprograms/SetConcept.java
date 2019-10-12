package com.collectionsconceptprograms;

import java.util.*;

public class SetConcept {

	public static void main(String[] args) {
		// Set Community Belongs to Remove Duplication
		
		//By Using HashSet Class we can't preserve the Order
		System.out.println("********* HashSet Example **********\n  Order is not preservative");
		Set<String> s = new HashSet<>();
		s.add("Syed");
		//s.add("Qhubaib");
		s.add("Ahmed");
		s.add("Syed");
		s.add("Roshan");
		s.add("Zameer");
		s.add("Sadaddin");
		s.add("Hasnain");
		
		for(String str:s)
		{
			System.out.println(str);
		}
		
		System.out.println("\n************ TreeSet Example ************\n Order is in Ascending");
		//By Using Tree Set --> Order is Preservative
		SortedSet<Integer> tree = new TreeSet<>();
		tree.add(101);
		tree.add(564);
		tree.add(235);
		tree.add(23);
		
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n********* Link HashSet Example **********\n Order is in given added order");
		Set<String> linkhash = new LinkedHashSet<>();
		linkhash.add("Syed");
		linkhash.add("Qhubaib");
		linkhash.add("Ahmed");
		linkhash.add("Syed");
		linkhash.add("Roshan");
		linkhash.add("Zameer");
		
		for(String str:linkhash)
		{
			System.out.println(str);
		}
		
		//linkhash.addAll(s);
		System.out.println(linkhash);
		
		linkhash.retainAll(s);
		System.out.println(linkhash);
	}

}
