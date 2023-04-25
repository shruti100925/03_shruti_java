package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_58
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		arr1.add("D");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("X");
		arr2.add("Y");
		arr2.add("Z");
		
		arr1.addAll(arr2);
		
		Collections.shuffle(arr1);
		
		System.out.println(arr1);
	}

}
