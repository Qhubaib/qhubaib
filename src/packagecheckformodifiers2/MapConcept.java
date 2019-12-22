package packagecheckformodifiers2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapConcept {


	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(12, "Munna");
		map.put(1, "Roshan");
		map.put(33, "Qhubaib");
		map.put(2, "Sadaddin");
		map.put(4, "Hasnain");
		map.put(44, "Mohammad");
		map.put(null, null);
		
		System.out.println(map);
		
		Map<Integer,String> map1 = new Hashtable<>();
		map1.put(12, "Munna");
		map1.put(1, "Roshan");
		map1.put(3, "Qhubaib");
		map1.put(2, "Sadaddin");
		map1.put(4, "Hasnain");
		map1.put(44, "Mohammad");

		System.out.println(map1.get("obje"));

		Set<Entry<Integer,String>> setentry = map1.entrySet();
		for(Entry<Integer,String> entry: setentry)
		{
			System.out.print(entry.getKey()+" "+entry.getValue()+"\n");
		}
		
		System.out.println(map1);
		
		Map<String,String> map2 = new TreeMap<>();
		map2.put("stud","Munna");
		map2.put("apple", "Apple Fruit");
		map2.put("xer", "Xerox Paper");
		map2.put(null, null);
		
		System.out.println(map2);
		
	}

}
