/*
Write A Java Program concat two Strings by using plus operator 
*/

package com.dharnish.strings;

import java.util.Scanner;
public class Program17 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine();
		String str2=scn.nextLine();
		String str3=str1+str2;
		System.out.println(str3);
	}
}
