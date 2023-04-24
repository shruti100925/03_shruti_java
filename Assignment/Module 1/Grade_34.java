package com.assignment;

import java.util.Scanner;

public class Grade_34
 
{
	   void grades() 
	   {
		   Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter below marks:");
			
			System.out.println("English:");
			int sub1=sc.nextInt();
			
			System.out.println("Maths");
			int sub2=sc.nextInt();
			

		   if(sub1 >=91||sub2 >=91) 
		   {
			System.out.println("Grade A+");   
		   }
		   else if(sub1 >=81||sub2 >=81) 
		   {
			System.out.println("Grade A");   
		   }
		   else if(sub1 >=71||sub2 >=71) 
		   {
			System.out.println("Grade B+");   
		   }
		   else if(sub1 >=61||sub2 >=61) 
		   {
			System.out.println("Grade B");   
		   }
		   else if(sub1 >=51||sub2 >=51) 
		   {
			System.out.println("Grade C");   
		   }
		   else if(sub1 >=41||sub2 >=41) 
		   {
			System.out.println("Grade D");   
		   }
		   else {
			   System.out.println("Fail");
		   }
		   
	   }
	public static void main(String[] args) 
	{
				
		Grade_34 a= new Grade_34();
		
		a.grades();
	}

}
