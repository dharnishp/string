/*
 * Write a Java Program to find the largest and smallest word in a string?
 */
package com.dharnish.strings;

import java.util.HashMap;
import java.util.Scanner;
public class Program14 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String[] sa=str.split(" ");
		int max=sa[0].length(),min=sa[0].length();
		String large=sa[0],small=sa[0];
		for(int i=0;i<sa.length;i++)
		{
			if(sa[i].length()>max)
			{
				max=sa[i].length();
				large=sa[i];
			}
			
		}
		for(int i=0;i<sa.length;i++)
		{
			if(sa[i].length()<min)
			{
				min=sa[i].length();
				small=sa[i];
			}
		}
		System.out.println(small+" \n"+large);
	}
}
