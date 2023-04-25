package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_50 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
		
		Iterator i=arr1.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}

}
