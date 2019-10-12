package com.javaconceptprograms;

public class ThreadDemo {

	public static void main(String[] args) {
		// To Achieve Threads we have to use either "Thread" Class/"Runnable" interface
		// why we need to use "Runnable" interface because -->
		// Lets say we have a class A extends B --> in this it has to extend "Thread" class
		// so multiple class inheritance is not possible in java, so we have to use "Runnable" interface
		
		Qhubaib obj = new Qhubaib();
		obj.start();
		
		Ahmed obj1 = new Ahmed();
		obj1.start();
		
		//By using Runnable interface through Lambda Expression class QhubaibAhmed
		Runnable obj2 = new Runnable()
				{
					public void run()
					{
						for(int i=1;i<=5;i++)
						{
							System.out.println("Qhubaib Ahmed");
							try {Thread.sleep(500);} catch(Exception e){}
						}
					}
				};
		Thread t=new Thread(obj2);
		t.start();
		
		//By using Runnable interface through Lambda Expression class QhubaibAhmed1
		Runnable obj3 = () ->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Syed Qhubaib");
					try {Thread.sleep(500);} catch(Exception e){}
				}
			};
		Thread t2=new Thread(obj3);
		t2.start();
		
		//Even More Simplification of code with Lambda Expression
	Thread t3=new Thread(() ->
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Syed Qhubaib Ahmed");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	});
	t3.start();
		
		//Here what happens is when you are calling the run() method in both the classes, two different threads are accessing it
		//So , At some of time Two different Threads can call the run() method at the same time, So the output may vary from actual
		//in this case we need to use obj.join() method (join() is use to wait until the thread will complete its action)

	}

}

class Qhubaib extends Thread
{ 
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Qhubaib");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	}
}

class Ahmed extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ahmed");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	}
}

//Instead of this class we have used Lambda Expression ::
class QhubaibAhmed implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Qhubaib Ahmed");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	}
}

//Instead of this class we have used Lambda Expression ::
class QhubaibAhmed1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Syed Qhubaib");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	}
}


