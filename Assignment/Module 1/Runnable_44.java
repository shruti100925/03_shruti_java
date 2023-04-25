package com.assignment;

class Example implements Runnable
{
	
	public void run()
	{
			System.out.println("Thread");
			
			
		
	}
}

public class Runnable_44
{
	public static void main(String[] args) 
	{
		Thread a=new Thread(new Example());
		a.start();
		
	}
}
