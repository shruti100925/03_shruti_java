package com.assignment;


class Shape
	{
		void a()
		{
			System.out.println("This is shape");
		}
	}
class Circle extends Shape
	{
		void b()
		{
			System.out.println("This is circular shape");
		}
	}
interface Rectangle1
	{
		void c();
	}
class Square1 extends Circle  implements Rectangle1

	{
		void d()
		{
			System.out.println("Square is a rectangle");
		}

		public void c() {
			// TODO Auto-generated method stub
			System.out.println("This is rectangular shape");
		}

		
	}

public class Multilevel_35 
	{
		public static void main(String[] args) {
			
			Square1 s =new  Square1();
			
			s.a();
			s.b();
			s.c();
			s.d();
			
		}
	}


