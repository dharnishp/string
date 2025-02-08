/*
 * Write A Java Program prints the words of String in reverse order.
 */
package stringquestions;

import java.util.Scanner;

public class Program8 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String[] sa=str.split(" ");
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i]+" ");
		}
	}
}
