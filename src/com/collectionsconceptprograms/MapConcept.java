package com.collectionsconceptprograms;

import java.util.*;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<>();
		map.put(0, "Syed");
		map.put(10, "Roshan");
		map.put(2, "Sadaddin");
		map.put(3, "Qhubaib");
		map.put(4, "Hasnain");
		map.put(4, "Mohammad Hasnain");
		map.put(5, null);
		map.put(11, null);
		map.put(null, null);
		map.put(null, "Ahmed");
		System.out.println(map);
		
		System.out.println("To Fetch the values we use Map.getKey() Method");
		System.out.println(map.get(30));
		System.out.println("********** By Using Map.entrySet() Method we fertch the values of 'Map' Set<Entry<int,string> ************ ");
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> s : set)
		{
			System.out.println(s.getKey()+" : "+s.getValue());
		}
		
		Set<Integer> keyset = map.keySet();
		System.out.println("KeySet Values are: "+keyset);
		Iterator<Integer> it = keyset.iterator();
		System.out.println("By Using Keyset through iterator the values are:: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1, "Roshan");
		map1.put(2, "Sadaddin");
		map1.put(3, "Qhubaib");
		map1.put(4, "Hasnain");
		map1.put(4, "Syed Mohammad Hasnain");
		System.out.println(map1);
		Set<Integer> st = map1.keySet();
		for(int i:st)
		{
			System.out.println(i+" "+map1.get(i));
		}
	}

}
