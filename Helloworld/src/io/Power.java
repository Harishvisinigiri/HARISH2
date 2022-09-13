package io;

public class Power
{
	static int pow(int n,int p)
	{
		if(p==0)
			return 1;
		return n*pow(n,p-1);
	}
	public static void main(String[] args)
	{
		System.out.println(pow(5,3));
		System.out.println(pow(6,2));
		System.out.println(pow(3,0));
	}
}
