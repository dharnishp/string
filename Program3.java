/*
Program 3: Write a Java Program to find the duplicate characters in a string.

Sample Input:
Java
Sample Output:
a

Sample Input:
malayalam
Sample Output:
Mal

Code:
*/

package com.dharnish.strings;
  
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class Program3 
{
	public static void main(String[] args) 
{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		char[] ch=str.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap();
		for(Character h:ch)
		{
			if(hm.containsKey(h))
			{
				hm.put(h, hm.get(h)+1);
			}
			else
			{
				hm.put(h, 1);
			}
		}
		Set<Character> s=hm.keySet();
		for(Character c:s)
		{
			if(hm.get(c)>1)
			{
				System.err.print(c);
			}
		}
	}
}
