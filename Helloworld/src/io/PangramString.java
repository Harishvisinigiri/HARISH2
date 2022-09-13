package io;

public class PangramString {

	public static void main(String[] args) {
		
		String s="abcdefghijklmnopqrstuvwxyz";
		
		if(s.length()<26) {
			System.out.println(" is not pangram");
		}
		else {
			s=s.toLowerCase();
			char ch=s.charAt(1);
			
			for (ch = 'A'; ch < 'Z'; ch++) {
				if(s.indexOf(ch)==-1) {
					System.out.println(" is pangram");
				}
			}
		}
		//System.out.println(" is pangram");	
	}
}
