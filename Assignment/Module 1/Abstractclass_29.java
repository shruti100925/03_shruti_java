package com.assignment;

 class Parent
{

	void message() 
	{
		
	}
	
	 
	
}
class Subclass extends Parent
	{
		 void message()
		 {
			 System.out.println("This is First subclass"); 
			 
		 }
		
	}
	
class Subclass1 extends Parent
	{
		 void message() 
		 {
			 System.out.println("This is Second subclass");
			
		 }
	}
public class Abstractclass_29 
{
 
	
	public static void main(String[] args) 
	{
		
		Parent a;
		
		a=new Subclass();
		a.message();
		a=new Subclass1();
		a.message();
	}

}
