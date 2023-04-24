package com.assignment;

class Marks 
{
		void getpercentage() {
			
		}
}

class A extends Marks
{
	double per;
	void getpercentage() 
	{
		System.out.println(per);
	}
	public A(double sub1, double sub2, double sub3) {
		// TODO Auto-generated constructor stub
		per = ((sub1+sub2+sub3)/300)*100;
	}
}
class B extends Marks
{
	double per;
	void getpercentage() 
	{
		System.out.println(per);
	}
	public B(double sub1, double sub2, double sub3,double sub4)
	{
		// TODO Auto-generated constructor stub
		per = ((sub1+sub2+sub3+sub4)/400)*100;
	}
}

public class Percentage_31
{
	public static void main(String[] args) 
	{
		Marks m;
		m= new A(35,58,68);
		m.getpercentage();
		m= new B(35,85,90,85);
		m.getpercentage();
		
		
	}
}
