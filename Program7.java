/*
 * Write A Java Program count the number of words in String .
 */
package stringquestions;

import java.util.Scanner;

public class Program7 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String[] sa=str.split(" ");
		System.out.println(sa.length);
	}
}
