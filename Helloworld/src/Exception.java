import java.util.Scanner;
public class Exception 
{
	public static void main(String[] args) 
	{
		System.out.println("main() started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		try
		{
			if(number>10)
			{
				System.out.println("Enter value of a");
				int a=sc.nextInt();
				System.out.println("Enter value of b");
				int b=sc.nextInt();
				System.out.println(a/b);				
			}
			else
			{
				int []arr=null;
				System.out.println(arr[0]);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("array ref is null");
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot devide by zero");
		}
		System.out.println("main() ended");
		
		
	}

}
