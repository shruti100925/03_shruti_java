package com.assignment;

class Shape1
{
	void rectarea(int l, int b) 
	{
		
	}
	void sqarea(int s) 
	{
		
	}
	void circlearea(int r) 
	{
		double area= 3.14*r*r;
	}
}
class Area extends Shape1
{
	@Override
	void rectarea(int l, int b) {
		// TODO Auto-generated method stub
		int area=l*b;
		System.out.println(area);
	}
	@Override
	void sqarea(int s) {
		// TODO Auto-generated method stub
		//super.sqarea(s);
		int area=s*s;
		System.out.println(area);
	}
	@Override
	void circlearea(int r) {
		// TODO Auto-generated method stub
		//super.circlearea(r);
		double area= 3.14*r*r;
		System.out.println(area);
	}
}
public class Area_RSC_33
{
	public static void main(String[] args) {
		Area a=new Area();
		a.rectarea(35, 25);
		a.sqarea(20);
		a.circlearea(6);
	}
	
}
