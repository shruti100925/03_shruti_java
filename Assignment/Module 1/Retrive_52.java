package com.assignment;

import java.util.ArrayList;

public class Retrive_52 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
		
		String a=arr1.get(3);
		
		System.out.println("Element at index 3:"+a);
	}

}
