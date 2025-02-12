/*
 * Write A Java Program prints vowels and consonants of a given string ? 
 */
package com.dharnish.strings;

import java.util.Scanner;

public class Program15
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String vow="",cons="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vow+=ch;
			}
			else
			{
				cons+=ch;
			}
		}
		System.out.println("Vowels in given String : "+vow+"\nConsonents in given String : "+cons);
	}
}
