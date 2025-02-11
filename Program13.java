/*
Write A Java Program to remove duplicate characters in a given String?
*/

package com.dharnish.strings;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class Program13 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine(),str1="";
		char[] ch=str.toCharArray();
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap();
		for(Character h:ch)
		{
			if(lhm.containsKey(h))
			{
				lhm.put(h, lhm.get(h)+1);
			}
			else
			{
				lhm.put(h, 1);
			}
		}
		Set<Character> s=lhm.keySet();
		for(Character c:s)
		{
			if(lhm.get(c)==1)
			{
				str1+=c;
			}
		}
		System.out.println(str1);
	}
}
