package com.assignment;

public class Interleaving_19 
{
	
	   
	    static void printInterLeaving(String s1, int i,String s2, int j,String str)
	                            
	                                  
	    {
	        if (i == s1.length() && j == s2.length()) {
	            System.out.println(str);
	        }
	 
	       
	        if (i < s1.length())
	            printInterLeaving(s1, i + 1, s2, j, str + s1.charAt(i));
	                             
	        
	        if (j < s2.length())
	            printInterLeaving(s1, i, s2, j + 1, str + s2.charAt(j));
	                             
	    }
	 
	   
	    public static void main(String[] args)
	    {
	        // TODO Auto-generated method stub
	 
	        String s1 = "WX"; 
	        String s2 = "YZ"; 
	       
	        printInterLeaving(s1, 0, s2, 0, "");
	    }
}
