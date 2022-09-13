


import java.util.Scanner;
public class Magic
{
	long num=0,temp=0;
	public void accept()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num=sc.nextLong();

	}

	public  long CalculateSumOfDigits(long n)
	{

		if(n==0)
		{
			return 0;
		}
		else
		{
			return n%10 + CalculateSumOfDigits(n/10);
		}
	}

	public void isMagicNumber()
	{
		temp=num;
		while(temp>9)
		{
			temp=CalculateSumOfDigits(temp);
		}
		if(temp==1)
		{
			System.out.println(num+ " IS A MAGIC NUMBER");
		}
		else
		{
			System.out.println(num+ " IS NOT A MAGIC NUMBER");
		}

	}

	public static void main(String[] args)
	{
		Magic ob1=new Magic();
		ob1.accept();
		ob1.isMagicNumber();

	}
}
