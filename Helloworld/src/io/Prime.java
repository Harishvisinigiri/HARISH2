package io;

public class Prime {
	public static void main(String[] args) {
		int n=29;
		int count=0;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
	    if (count>=1)
	    	System.out.println(n+" is not prime");
	    else
	    	System.out.println(n+" is prime");
	}

}
