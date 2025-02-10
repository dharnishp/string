/*
 * Write A Java Program count the number of spaces in String .
 */
package com.dharnish.strings;

import java.util.Scanner;
public class Program11 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ') 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
