package com.assignment;

class Parent
{
	
	void p() 
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	void c() 
	{
		System.out.println("This is child class");
	}
}
public class SingleInheritance_24 
{
	
	
	
	public static void main(String[] args) {
		Parent a= new Parent();
		Child b= new Child();
		
		a.p();
		b.c();
		b.p();
	}
}
