package packagecheckformodifiers2;

import java.util.*;

public class SetConcept {


	public static void main(String[] args) {

		Set<String> s = new TreeSet<>();
		s.add("Munna");
		s.add("Munna");
		s.add("Qhubaib");
		s.add("Qhubaib");
		s.add("Ahmed");
		s.add("Ahmed");
		s.add("Syed");
		s.add(null);
		
		System.out.println(s); //[null, Ahmed, Syed, Qhubaib, Munna]

		for(String str: s)
		{
			System.out.print(str+" \n");
		}
		
		
	}

}
