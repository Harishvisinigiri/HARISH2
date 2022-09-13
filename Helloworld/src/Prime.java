
public class Prime {
   
	public static void main(String[] args)
	{
		int a=5;
		int b=2;
		int c=0;
		while(a>=b)
		{
			if(a%b==0)
			{
				c++;
			}
			b++;
		}
		if(c==2)
		{
			System.out.println(a+" is a prime");
		}
		else 
		{
			System.out.println(a+" is not a prime");
		}
	}
}
