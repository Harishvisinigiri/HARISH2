package io;

public class Fibonicc_Series {

	public static void main(String[] args) {
		int a=1,b=1,sum=0,x=5;
		System.out.println(a+"\n"+b+" ");
		for(int i=0;i<=x;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum+" ");
		}
		
	}

}
