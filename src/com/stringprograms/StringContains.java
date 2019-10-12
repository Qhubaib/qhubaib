package com.stringprograms;

public class StringContains {

	public static void main(String[] args) {
		// In this program we write the code Instead of Predefined string.contains() Method
		
		String s = "capadacapcapacapac";
		String c = "capac";
		
		int slen = s.length();
		int clen = c.length();
		
		int count = 0;
		
		for(int i=0;i<=slen-clen;i++)
		{
			
				if(s.charAt(i)==c.charAt(0))
				{
					for(int k=i,l=0;l<clen;k++,l++)
					{
						if(s.charAt(k)==c.charAt(l))
						{
							count++;
						}
						else
						{
							count=0;
						}
					}
					System.out.println(count);
				
				}
				if(count == clen)
					break;
		}
		
		if(count == clen)
		{
			System.out.println("Pattern: "+c+" Found in pattern: "+s);
		}
		else
		{
			System.out.println("Pattern: "+c+" is NOT Found in pattern: "+s);
		}
		
		System.out.println("*************** Next Method with Some Modifications **************");
		
		char a,b;
		int counter = 0;
		for(int i=0;i<=slen-clen;i++)
		{
			a = s.charAt(i);
			b = c.charAt(0);
			if(a == b)
			{
				for(int j=i,k=0;j<i+clen;j++,k++)
				{
					a = s.charAt(j);
					b = c.charAt(k);
					
					if(a == b)
						counter++;
					else
						counter = 0;
				}
				System.out.println(counter);
			}
			if(counter == clen)
				break;
		}

		if(counter == clen)
		{
			System.out.println("Pattern: "+c+" Found in pattern: "+s);
		}
		else
		{
			System.out.println("Pattern: "+c+" is NOT Found in pattern: "+s);
		}
	}

}
