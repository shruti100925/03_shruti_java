package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistreverse_64 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
	
		Collections.reverse(arr1);
		System.out.println(arr1);
	}
}	