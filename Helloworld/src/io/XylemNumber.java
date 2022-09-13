package io;

public class XylemNumber {

	public static void main(String[] args) {
		
		int x=42345;
		int num=x;
		int ms=0,os=0;
		int d=x%10;
		os=os+d;
		x=x/10;
		while(x>9)
		{
			int k=x%10;
			ms=ms+k;
			x=x/10;
		}
		os=os+x;
		if(os==ms)
			System.out.println(num+" Xylem");
		else
			System.out.println(num+" not Xylem");
	}

}
