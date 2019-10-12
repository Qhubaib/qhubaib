package com.collectionsconceptprograms;

import java.util.*;

public class HashtableConcept {

	public static void main(String[] args) {
		// it is similar to HashMap --> But it is not thread safe(synchronized)
		// keys --> Object --> hashcode -->Value
		// it wont allow any null keys/null values --> if you try to insert it then it will through 'NullPointerException'
		Hashtable<String,String> table=new Hashtable<>();
		table.put("one", "Roshan");
		table.put("three", "Qhubaib");
		table.put("two", "sadaddin");
		table.put("four", "hasnain");
		//table.put(null, null);
		table.put("five", "somebody");
		table.put("five", "jdk");
		System.out.println("Before using Hashtable.clear() method :: \n"+table);
		
		
		Hashtable<String,String> clone=new Hashtable<>();
		clone = (Hashtable<String,String>)table.clone();
		System.out.println("Cloned Hashtable is:: \n"+clone);
		table.clear();
		System.out.println("After using Hashtable.clear() method :: \n"+table);
		System.out.println("Cloned Hashtable After using Clear() Method is:: \n"+clone);

	}

}
