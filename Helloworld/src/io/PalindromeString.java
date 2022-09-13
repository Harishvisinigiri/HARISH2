package io;

public class PalindromeString {

	public static void main(String[] args) {
		String s="malayalam";
		int i=0,j=s.length()-1;
		while(i>j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println(" is not a palindrome");
			}
			i++;
			j--;
		}
		System.out.println(s+" is a palindrome");
	}

}
