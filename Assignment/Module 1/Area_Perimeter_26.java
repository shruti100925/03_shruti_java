package com.assignment;

 class Rectangle
{
	double lenght, breath;
	
	void area() 
	{
		System.out.println("Area="+ lenght*breath);
	}
	void peri() 
	{
		System.out.println("Area="+ 2*(lenght*breath));
	}
	void print(double lenght, double breath) 
	{
		this.lenght=lenght;
		this.breath=breath;
		
	}
}
class Square 
{
	double side;
    int area(double side) 
	{
		this.side=side;
		return 0;
		
	}
	int peri(double side)
	{
		this.side=side;
		return 0;
	}
	void print() {
		System.out.println("Area="+ side*side);
	}
}


public class Area_Perimeter_26 
{
	public static void main(String[] args) 
	{
		
		Rectangle a= new Rectangle();
		a.print(4,5);
	}
}
