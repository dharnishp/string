/*
 * : Write A Java Program  count the number of occurrences of a character in a 
		 string in Java.

 */
package stringquestions;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Program5 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		char[] ch=str.toCharArray();
		LinkedHashMap<Character,Integer> hm= new LinkedHashMap();
		for(Character c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		Set<Character> s=hm.keySet();
		for(Character h:s)
		{
			System.out.println(h+" - "+ hm.get(h));
		}
	}
}
