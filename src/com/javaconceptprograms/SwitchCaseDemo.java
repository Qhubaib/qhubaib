package com.javaconceptprograms;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// Switch Case is use to switch the statement along with requirement
		
		int i = 6;
		String str = "Syed Basha";
		
		switch(i)
		{
			case 1:
				System.out.println("the integer value is 1");
				break;
			case 2:
				System.out.println("The integer value is 2");
				break;
			case 3:
				System.out.println("the integer value is 3");
				break;
			case 4:
				System.out.println("The integer value is 4");
				break;
			case 5:
				System.out.println("the integer value is 5");
				break;
			default:
				System.out.println("The integer default value is 12");
		}
		
		switch(str)
		{
			case "Ahmed":
				System.out.println("This is Ahmed");
				break;
			case "Qhubaib":
				System.out.println("This is Qhubaib");
				break;
			case "Syed":
				System.out.println("This is Syed");
				break;
			default:
				System.out.println("Default: This is Syed Qhubaib Ahmed");
		}

	}

}
