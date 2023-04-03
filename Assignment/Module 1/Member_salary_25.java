package com.assignment;


	class Member 
	{
		void datamember() 
		{
			System.out.println("Name:Hemant");
			System.out.println("Age: 35");
			System.out.println("Phone number: 8180241578");
			System.out.println("Address: shiv park, yagnik road");
		}
		void printsalary() {
			System.out.println("Salary:30000");
		}
	}
		
	class Manager extends Member
	{
		void department() 
		{
			System.out.println("Name:Rahul");
			System.out.println("Age: 35");
			System.out.println("Phone number: 8180241578");
			System.out.println("Address: shiv park, yagnik road");
			System.out.println("salary:500000");
			System.out.println("Department:ACN");
		}
		
	}
	class Employee extends Member
	{
		void specializationt() 
		{
			System.out.println("Name:Hemant");
			System.out.println("Age: 35");
			System.out.println("Phone number: 8180241578");
			System.out.println("Address: shiv park, yagnik road");
			System.out.println("salary:500000");
			System.out.println("Department:ACN");
			
		}
	
	}
public class Member_salary_25
{	
	public static void main(String[] args) 
	{
		
		Manager n= new Manager();
		Employee m=new Employee();
		
		m.specializationt();
		m.datamember();
		m.printsalary();
		n.department();
	
	}

}
