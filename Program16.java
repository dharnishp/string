/*
 * Write A Java Program convert first alphabet capital of each word in given String ?
 */
package stringquestions;

import java.util.Scanner;

public class Program17 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		String str=scn.nextLine(),str1="";
		String[] sa=str.split(" ");
		for(int j=0;j<sa.length;j++)
		{
			String ne="";
			for(int i=0;i<sa[j].length();i++)
			{
				if(i==0)
				{
					ne+=sa[j].charAt(i);
					ne=ne.toUpperCase();
				}
				else
				{
					ne+=sa[j].charAt(i);
				}
			}
			str1+=ne+" ";
		}
		System.out.println(str1);
	}
}
