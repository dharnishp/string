/*
Program 2: Write a Java Program to find whether a string is palindrome or not.
Sample Input:
Java
Sample Output:
Not Palindrome

Sample Input:
Malayalam
Sample Output:
Palindrome

Code:
*/
package com.dharnish.strings;

import java.util.Scanner;
public class Program2 
{
	public static void main(String[] args) 
{
		Scanner scn = new Scanner(System.in);
		String str=scn.nextLine(),rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
