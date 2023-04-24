package com.assignment;

public class Triangle_27
{
	public Triangle_27() {
		// TODO Auto-generated constructor stub
		
		double a= 3;
		double b= 4;
		double c= 5;
		
		double s= (a+b+c)/2;
		
		double area=Math.sqrt((s-a)*(s-b)*(s-c)*s);
		
		
		System.out.println("Area of triangle=" +area);
		
	}

	public static void main(String[] args) 
	{
		Triangle_27 a= new Triangle_27();
	}
	
}
