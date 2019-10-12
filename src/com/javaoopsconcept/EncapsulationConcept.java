package com.javaoopsconcept;

public class EncapsulationConcept {

	public static void main(String[] args) {
		// In a concept of java classes -- Objects know something(variables), Object does something(methods)
		// Encapsulation --> variables must be private & Respective Methods must be public(so that these are accessible from outside)
		// we can have the question like if we can able to set & get the value from setters & getters methods(), then indirectly we are accessing the private variables(Use ?)
		// Yes that right question, The advantage is 1. We are not able to change the actual variable value(If Any)
		// 2.If these variable values are getting changed directly through variables, we don't have an option of printing LOGS.
		// 3.By using methods --> we can print the LOG that ki, the value has changed
		// 4.if you want only get the value --> we use getters (we don't write the code for setters)
		// It is always good practice to access the variables through methods.
		Encapsule obj = new Encapsule();
		obj.setCardno(11225623);
		obj.setId(26);
		obj.setLastname("Ahmed");
		
		System.out.println(" The value of id: "+obj.getId()+",\n The value of cardno: "+obj.getCardno()+",\n The value of  LastName: "+obj.getLastName());
		//If you try to access getters without using setters it will take the default value

	}

}

class Encapsule
{
	private int id;
	private int cardno;
	private String lname;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		System.out.println("The value has changed");
		return this.id;
	}
	
	public void setCardno(int cardno)
	{
		this.cardno=cardno;
	}
	public int getCardno()
	{
		return this.cardno;
	}
	
	public void setLastname(String lname)
	{
		this.lname=lname;
	}
	public String getLastName()
	{
		return this.lname;
	}
	
}