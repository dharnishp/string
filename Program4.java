/*
Program 4:  Write a Java Program to remove all white spaces from a string without using inbuilt methods.

Sample Input: 
Java Is a Object Orientend Programming Language
Sample Output:
JavaIsaObjectOrientendProgrammingLanguage

Code:
*/

package com.dharnish.strings;

import java.util.Scanner;
public class Program4 
{
	public static void main(String[] args) 
{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine(),rem="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				rem+=str.charAt(i);
			}
		}
		System.out.println(rem);
	}
}
