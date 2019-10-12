package com.javaconceptprograms;

public class ForWhileDoWhileExample {

	public static void main(String[] args) {
		// While Loop
		//If you don't exact size/length it is better to While Loop with break Example
		//Break Statement is used to terminate the execution(which means it comes out of the loop)
		//If the Loop is inside the Nested one - It will come out of the Nested Loop & Go back to Main Loop
		
		System.out.println("***************** While Loop with break statement ****************");
		int k=10;
		while(k>1)
		{
			k--;
			if(k==5)
				break;
			System.out.println(k);
		}
		
		//Continue will terminate the current Execution 
		System.out.println("***************** While Loop with continue statement ****************");
		int j=10;
		while(j>1)
		{
			j--;
			if(j==5)
				continue;
			System.out.println(j);
		}
		
		//do While Loop will execute atleast once irrespective of matching condition
		System.out.println("***************** Do While Loop with continue statement ****************");
		
		int i = 9;
		do
		{
			System.out.println(i);
			i--;
			if(i==5)
				continue;
		}
		while(i>10);
			
		//For Loop will execute upto the particular condition is true(If we know the exact size it is better to go for For Loop
		System.out.println("***************** For Loop with continue statement ****************");
		for(int h=1;h<4;h++)
		{
			for(int g=1;g<=3;g++)
			{
				if(g+2==h)
					continue;
				System.out.println(g);
			}
		}
		
		
	}

}
