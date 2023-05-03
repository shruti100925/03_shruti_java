package com.assignment;

import java.util.HashSet;

public class Retainsets_75 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs= new HashSet<String>();
		HashSet<String> hs1=new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add("2");
		hs1.add("2");
		hs1.add("5");
		
		hs.retainAll(hs1);
		System.out.println(hs);
		
	}

}
