package com.assignment;

import java.util.ArrayList;

public class Comparearr_66 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1= new ArrayList<String>();
		
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("A");
		arr2.add("B");
		arr2.add("C");
		
		if(arr1.equals(arr2))
		{
			System.out.println("Both arraylists are equal"+"\n"+arr1+"\n"+arr2);
		}
		else
		{
			System.out.println("Arraylists are not equal");
		}
		
	}

}
