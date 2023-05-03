package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Indexprnt_74
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("Pink");
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Yellow");
		
		int j = arr1.size();
		
		for(int i=0;i<j;i++)
		{
			System.out.println("Index: "+i+" "+arr1.get(i));
		}
	}


}
