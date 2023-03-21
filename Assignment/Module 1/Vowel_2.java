package com.assignment;

import java.util.Scanner;

public class Vowel_2
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Alphabet:");
		String ch=sc.next();
		
		char ch1=ch.charAt(0);
		if(ch.length()>1) {
			System.err.println("Error.Enter only one Alphabet.");
		}
		else if((ch1>=65&&ch1<=90)||(ch1>=97&&ch1<=122)){
			
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||
			ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'	) {
			
			System.out.println("It is a vowel.");
		}
		else {
			System.out.println("Its a consonant.");
		}
		}	
		else {
			System.out.println("Invalid input enter a alphabet");
		}
	}
}
