package com.assignment;

public class Nestedcatch_3839
{
	 public static void main(String[] args)
	   {
		
		   try{
			   try 
			   	{
				   int a[]=new int[5];    
				   a[5]=30/0;    
			   	}    
		       catch(ArithmeticException e)  
		          {  
		           System.out.println("Arithmetic exception occurs");  
		          }    
		       catch(ArrayIndexOutOfBoundsException e)  
		          {  
		           System.out.println("ArrayIndexOutOfBounds exception occurs");  
		          }
		   }
		   finally {
			   System.out.println("Not Excecuted");
		   }

	   }


}
