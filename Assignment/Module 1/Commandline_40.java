package com.assignment;

import java.util.Scanner;

public class Commandline_40 
{
	  public static void main(String[] args) 
	  {
	        int a = Integer.parseInt(args[0]);
	        int b = Integer.parseInt(args[1]);
	        
	        try
	        {
	        	if(b!=0) 
	        	{
	        	int div = a / b;
		        System.out.println("Division " + div);
	        	} 
	        }
	        catch (ArithmeticException e) {
				// TODO: handle exception
			}
	        
	        
	  }

}
