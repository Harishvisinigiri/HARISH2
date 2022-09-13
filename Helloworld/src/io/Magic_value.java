package io;

import java.util.Arrays;
import java.util.Scanner;

public class Magic_value {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		int br[]=new int[n];
		System.out.println("Enter "+n+" values");
		for (int i=0;i<n;i++)
		{
			br[i]=ar[i]=sc.nextInt();
		}
		Arrays.sort(br);
		int gsum=0,bsum=0;
		for( int i=0;i<=n;i++)
		{
			if(ar[i]==br[i])
				gsum=gsum+ar[i];
			else
				bsum=bsum+ar[i];
		}
		System.out.println(gsum-bsum);
	}

}
