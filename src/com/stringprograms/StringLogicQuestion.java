package com.stringprograms;

public class StringLogicQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a,b,c,d,+,-,*";
		str=str.replaceAll(",", "");
		
		String s1 = str.replaceAll("[^a-z]", "");
		System.out.println(s1);
		
		String s2 = str.replaceAll("[a-z]", "");
		System.out.println(s2);
		
		String rep = "";
		
		int k=1,i=0,j=0;
		
		while(k<=s1.length()+s2.length())
		{
			if(k%2!=0)
			{
				while(i<s1.length())
				{
					rep = rep+s1.charAt(i);
					break;
				}
				i++;
			}
			else
			{
				while(j<s2.length())
				{
					rep = rep+s2.charAt(j);
					break;
				}
				j++;
			}
			k++;
		}
		
		System.out.println(rep);

	}

}
