package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Extractarraylist_65
{

	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
		arr1.add("Green");
		arr1.add("Purple");
		arr1.add("Black");
		arr1.add("Brown");
		List<String> arr2= arr1.subList(2, 5);
		System.out.println(arr2);
	}
}
