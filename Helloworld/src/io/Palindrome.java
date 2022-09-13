package io;
import java.util.Scanner;
public class Palindrome
{
	static boolean ispalindrome(int n)
	{
		return ispalindrome(n,n,0);
	}
	static boolean ispalindrome(int n,int temp,int rev)
	{
		if(n==0)
		return temp==rev;
		return ispalindrome(n/10,temp,rev*10+n%10);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean rs=ispalindrome(x);
		if(rs==true)
			System.out.println(x+"is a palindrome number");
		else
			System.out.println(x+"is not a palindrome number");

	}

}
