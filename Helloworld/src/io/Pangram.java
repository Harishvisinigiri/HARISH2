package io;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st1=sc.nextLine();
		boolean rs=ispangram(st1);
        if(rs==true)
            System.out.println("String is pangram");
        else
        	System.out.println("String is not a pangram");
	}
	static boolean ispangram(String st1) {
		if(st1.length()<26)
			return false;
		int count1[]=new int[26];
		for(int i=0; i<st1.length(); i++) {
			char ch=st1.charAt(i);
			if(ch>='A'&&ch<='Z')
			count1[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count1[ch-97]++;
	     }
		for(int i=0;i<26;i++) {
			if(count1[i]==0)
			return false;
		}
		return true;
	}
}
