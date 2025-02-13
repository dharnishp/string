/*
Write A Java Program check if the both String are equals are not
*/

package com.dharnish.strings;

import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine();
		String str2=scn.nextLine();
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
