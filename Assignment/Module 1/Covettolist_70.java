package com.assignment;

import java.util.HashSet;

public class Covettolist_70
{
	public static void main(String[] args) 
	{
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("2");
		hs.add("4");
		hs.add("2");
		hs.add("5");
		hs.add("8");
		
		System.out.println("Hashset:"+hs);
		String[] arr = new String[hs.size()];
	     hs.toArray(arr);
		System.out.println("Arraylist:");
		 for(String temp : arr){
		        System.out.println(temp);
		     }
	}


}
