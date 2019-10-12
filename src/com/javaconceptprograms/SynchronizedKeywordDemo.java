package com.javaconceptprograms;

public class SynchronizedKeywordDemo{

	
	public static void main(String[] args) throws Exception {

		Counter c = new Counter();
		Thread obj = new Thread(new Runnable() 
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.counter();
						}
					}
				});
		Thread obj1 = new Thread(() ->
			{
				for(int i=1;i<=1000;i++)
				{
					c.counter();
				}
			});
		
		obj.start();
		obj1.start();
		obj.join();
		obj1.join();
		
		System.out.println("Count is: "+c.count);
	}
}

class Counter
{
	int count;
	public synchronized void counter()
	{
		count++;
	}
}

class AB extends Thread
{
	Counter obj = new Counter();
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			obj.counter();
		}
		
	}
}
class BC extends Thread
{
	Counter obj = new Counter();
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			obj.counter();
		}
		
	}
}
