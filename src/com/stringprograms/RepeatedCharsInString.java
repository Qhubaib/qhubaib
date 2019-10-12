package com.stringprograms;

public class RepeatedCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "QhubaibAhmed";
		String s = s1.toLowerCase();
		int count = 1;
		char a,b;
				
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				a = Character.toLowerCase(s.charAt(i));//dont use this char.toLower() here 
				b = Character.toLowerCase(s.charAt(j));// this is useless to use here
				if(a == b)
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(s.charAt(i)+" Character is repeated: "+count+" times.");
			String rep = String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(rep, "");
			i--;
			count = 1;
		}

	}

}
