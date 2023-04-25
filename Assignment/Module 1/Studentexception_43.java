package com.assignment;


class Student
{
	int age;
	String name;
	public Student(int rollno,int age,String name, String course) 
	{
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
		
		
	void abc() throws AgeException
	{
		if(age<15 || age>21) {
			throw new AgeException("AgeNotWithinRangeException");
		}
		
	
	}	
	void abc1()throws Nameexception
	{
		if (name != "[^a-zA-Z]") 
		{
			throw new Nameexception("NameNotValidException");
		}
	}
	class AgeException extends Exception
	{
		public AgeException(String a) {
			// TODO Auto-generated constructor stub
			super(a);
		}
	}
	class Nameexception extends Exception
	{
		public Nameexception(String b)
		{
			// TODO Auto-generated constructor stub
			super(b);
		}
	}
}
public class Studentexception_43 
{
	
	public static void main(String[] args) 
	{
		Student s= new Student(10, 25, "abc.", "B.com");
		
		try {
			s.abc();
			s.abc1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
		}
		
		
	}

	
		
}
	

