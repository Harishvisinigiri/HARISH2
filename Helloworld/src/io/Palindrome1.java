package io;

public class Palindrome1 {

	public static void main(String[] args) {
		int num=343;
		int rev=0; int t=num;
		while(num!=0)//(num>0)
		{
			int x=num%10;
			rev=rev*10+x;
			num=num/10;
		}
		if(t==rev)
		{
			System.out.println(rev+" Palindrome");
		}
		else
		{
			System.out.println(rev+" Not Palimdrome");
		}

	}

}
