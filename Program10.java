/*
Write A Java Program count the total number of vowels and consonants in a String .
*/

package com.dharnish.strings;

import java.util.Scanner;
public class Program10 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String str=scn.nextLine();
		int vCount=0,cCount=0;
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vCount++;
			}
			else
			{
				cCount++;
			}
		}
		System.out.println("Vowels : "+vCount+"\nConsonent : "+cCount);
	}
}
