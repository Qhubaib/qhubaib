package com.stringprograms;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"Syed", "Qhubaib","Roshan","Syed", "Sadaddin","Roshan"};
		int count = 0;
		int len = a.length;
		System.out.println("Starting time Length is: "+len);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					a[j] = a[len-1];
					len--;
					j--;
					
				}
				for(String b:a)
				{
					
					System.out.print(b+", ");
				}
			}
			System.out.println();
			
		}
		System.out.println("After Removing duplicates from array Length is: "+len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}

	}

}
