package com.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Hsitretor_60 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("Hello");
		hs.add("World");
		
		Iterator i= hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		
	}
}
