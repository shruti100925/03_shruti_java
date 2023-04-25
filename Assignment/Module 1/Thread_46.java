package com.assignment;
class Example3 extends Thread
{
	
	public void run()
	{
			System.out.println("Thread A");
			
			
		
	}
}
class Example4 extends Thread
{
	
	public void run()
	{
			System.out.println("Thread B");
			
			
		
	}
}

public class Thread_46 
{
	public static void main(String[] args) throws Exception 
	{
		Thread a=new Thread(new Example3());
		Thread b=new Thread(new Example4());
		
		a.start();
		Thread.sleep(2000);
		b.start();
	}

}
