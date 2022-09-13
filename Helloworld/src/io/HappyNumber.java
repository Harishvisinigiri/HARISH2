package io;

public class HappyNumber {
	
	public static void main(String[] args) {
		int n=49;
		int n1=n;
		while(n>9)
		{
			int sum=0;
			do {
				int ld=n%10;//9//1
				sum=sum+ld*ld;//81
				n=n/10;//4
			   }while(n!=0);
				n=sum;
		}
        if(n==1||n==7)
        	System.out.println(n1+" is Happy number");
        else
        	System.out.println(n1+" is not Happy number");
	}
}
