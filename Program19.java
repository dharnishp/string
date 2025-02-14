/*
Write A Java Program to  find the first non-repeating character in a given String?
*/
package com.dharnish.strings;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Program20 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine();
		char[] ch=str1.toCharArray();
		LinkedHashMap<Character,Integer>lhm=new LinkedHashMap();
		for(Character c:ch)
		{
			if(lhm.containsKey(c))
			{
				lhm.put(c, lhm.get(c)+1);
			}
			else
			{
				lhm.put(c, 1);
			}
		}
		System.out.println(lhm);
		Set<Character> s=lhm.keySet();
		for(Character c:s)
		{
		if(lhm.get(c)==1)
		{
			System.out.println(c);
			break;
		}
		}
	}
}
