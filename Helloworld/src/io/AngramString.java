package io;
import java.util.Arrays;
public class AngramString {
	public static void main(String[] args) {
	    String s="keep";
	    String s1="peek";
	
    	if(s.length()!=s1.length())
    	{
	    	System.out.println(" Not a Angram");
      	}
	    char ch[]=s.toCharArray();
	    char ch1[]=s1.toCharArray();
	 
	    Arrays.sort(ch);
	    Arrays.sort(ch1);
	    
	    if(Arrays.equals(ch,ch1)==true)
	    {
	    	System.out.println(" is Angram");
	    }

}
}
 