package io;

public class Reverse {

	public static void main(String[] args) {
		int k=1234321;
		int rev=0; int num=k;
		while(k>0)
		{
			int ld=k%10;
			rev=rev*10+ld;
			k=k/10;
		}
		if(rev==num)
		  System.out.println(num+" is revese number");
		else
			System.out.println(num+" is not revese number");

	}

}
