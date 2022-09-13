package io;

import java.util.Scanner;
public class Angram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  two String");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		boolean rs=isangram(st1,st2);
        if(rs==true)
        {
            System.out.println("String is Angram");
        }
        else
        {
        	System.out.println("String is not a Angram");
        }
	}
	static boolean isangram(String st1, String st2) 
	{
		int count1[]=new int[26];
		for(int i=0; i<st1.length(); i++)
		{
			char ch=st1.charAt(i);
			if(ch>='A'&&ch<='Z')
			count1[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count1[ch-97]++;
		}
		int count2[]=new int[26];
		for(int i=0; i<st2.length(); i++)
		{
			char ch=st1.charAt(i);
			if(ch>='A'&&ch<='Z')
			count2[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count2[ch-97]++;
	     }
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
}
