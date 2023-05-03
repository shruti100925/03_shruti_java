package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Swaparr_67 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
		
		System.out.println("Before Swaping"+arr1);
		
		Collections.swap(arr1, 2, 3);
		System.out.println("After swaping"+arr1);
	}


}
