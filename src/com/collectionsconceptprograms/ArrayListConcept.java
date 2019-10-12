package com.collectionsconceptprograms;
import java.util.*;

public class ArrayListConcept {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Syed");
		list.add("Qhubaib");
		list.add("Ahmed");
		list.add("Syed");
		//list.add(null);

		System.out.println(list);
		for(String s:list)
		{
			System.out.print(s+" ");
		}
		System.out.println("\n");

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Mohammad");
		list1.add("Hasnain");
		list1.add("Younger Brother");
		list1.add("Syed");

		
		list.addAll(list1);
		System.out.println("By Using AddAll Method: "+list);
		
		list.removeAll(list1);
		System.out.println("By Using RemoveAll Method: "+list);
		
		Collections.sort(list);
		System.out.println("By Using Collections Class Sort Method: "+list);
		
		Collections.reverse(list1);
		System.out.println("By Using Collections Class reverse Method: "+list1+"\n");
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Younger Brother");
		//Collections.sort(null); // it you pass the list which is null --> throw NullPointerException
		
		System.out.println(list2);
		list2.clear();

		System.out.println("By Using Clear Method: "+list2+"\n");
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Mohammad");
		list3.add("Hasnain");
		list3.add("Younger Brother");
		list3.add("Syed");
		System.out.println(list3);
		
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("Mohammad");
		list4.add("Hasnain");
		list4.add("Younger");
		list4.add("Chota");

		System.out.println(list4);
		list3.retainAll(list4);
		System.out.println("\nBy Using retainAll Method: "+list3);
		
		ArrayList<String> list5 = list4;
		list5.add("Syed Qhubaib Ahmed");
		System.out.println("\nWithout Creating the new List --> Directly Assigning Object to the List: "+list5);
		System.out.println("Check for the Assigned Object Changes:?? "+list4);
		System.out.println("\n"+list5+"\n"+list4);
		
		list4.add("Syed Sadaddin");
		System.out.println("\n"+list5+"\n"+list4);

	}

}
