/*
 * Write A Java Program to check if two Strings are anagrams ?
 */
package com.dharnish.strings;

import java.util.Arrays;
import java.util.Scanner;
public class Program12 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine().toLowerCase(),str2=scn.nextLine().toLowerCase();
		if(str1.length()==str2.length())
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int count=0;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					count++;
				}
			}
			if(count==str1.length())
			{
				System.out.println("Anagrams");
			}
			else
			{
				System.err.println("Not Anagrams");
			}
		
		}
		else
		{
			System.err.println("Not Anagrams");
		}
	}
}
