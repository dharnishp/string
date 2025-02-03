/*Program 1: Write a Java Program to reverse a string without using String inbuilt function.
Sample Input:
Learn With Dharnish
Sample Output:
hsinrahD htiW nraeL
*/
//Code:

import java.util.Scanner;
public class Program1 
{
	public static void main(String[] args) 
  {
    Scanner scn = new Scanner(System.in);
		String str=scn.nextLine();
		for(int i=str.length()-1;i>=0;i--)
    {
			System.out.print(str.charAt(i));
		}
	}
}
