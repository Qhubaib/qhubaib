package com.collectionsconceptprograms;

import java.util.*;
import java.util.Map.Entry;

public class HashMapThroghCreatedClass {

	public static void main(String[] args) {
		// HashMap is class which implements AbstractMap Class
		// HashMap is Not Thread Safe --> Means non synchronized 
		// it allows one null key & multiple null value
		// it wont allow duplication
		// it wont follow the insertion order
		// we will fetch the values of HashMap through Entry interface
		// HashMap class is having a predefined method called clone()
		
		AbstractMap<Integer,Student> map = new HashMap<>();
		
		Student s1 = new Student(1,"Qhubaib","Cricket");
		Student s2 = new Student(2,"Hasnain","Board");
		Student s3 = new Student(3,"Sadaddin","Game");
		
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		Set<Entry<Integer,Student>> set = map.entrySet();
		for(Entry<Integer,Student> entry : set)
		{
			int num = entry.getKey();		
			System.out.println(" "+num+" Key Details are:: ");
			Student obj = entry.getValue();
			System.out.println(obj.id+" : "+obj.name+" : "+obj.hobby+"\n");
		}

	}

}
