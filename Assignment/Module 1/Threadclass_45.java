package com.assignment;
class Example1 extends Thread
{
	
	public void run()
	{
			System.out.println("Thread");
			
			
		
	}
}


public class Threadclass_45 
{
	public static void main(String[] args) 
	{
		Thread a=new Thread(new Example1());
		a.start();
		a.start();
		
	}
}
