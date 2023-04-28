package com.assignment;

import java.util.HashMap;
import java.util.Map;


public class Hashmap_62
{
	public static void main(String[] args) 
	{
		
		HashMap<String,String>map =new HashMap<String,String>();
		
		
		map.put("A", "101");
		map.put("B", "102");
		map.put("E", "103");
		map.put("D", "104");
		
		//for each loop
		for(Map.Entry m : map.entrySet() )
		{
			
			System.out.println(m.getKey() +" "+m.getValue());
		}
	}
}
