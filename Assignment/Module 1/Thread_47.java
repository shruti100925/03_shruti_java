package com.assignment;

public class Thread_47 extends Thread
{
	
		public Thread_47(String name){
			super(name);
		}

		public void run()
		{
			
			if(Thread.currentThread().isDaemon())
			{
				System.out.println(getName() + " is Daemon thread");
			}
			
			else
			{
				System.out.println(getName() + " is User thread");
			}
		}
		
		public static void main(String[] args)
		{
		
			Thread_47 t1 = new Thread_47("t1");
			Thread_47 t2 = new Thread_47("t2");
			
		
			
			t1.setDaemon(true);
			t1.start();
			t2.start();
					
		}
	}



