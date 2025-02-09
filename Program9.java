package stringquestions;

import java.util.Scanner;

public class Program9 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine(),str2=scn.nextLine();
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		String[] arr=new String[2];
		arr[0]=str2;
		arr[1]=str1;
		str1=arr[0];
		str2=arr[1];
		System.out.println("String 1 : "+str1+"\nString 2 : "+str2);
	}
}
