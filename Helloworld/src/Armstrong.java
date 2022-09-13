
public class Armstrong {
    
	public static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
			return count;	
	}
	public static void main(String[] args)
	{
		int num=371,num1=num,count=countDigits(num),ld,sum=0,p;
		
		while(num>0)
		{
			ld=num%10;
			p=power(ld,count);
			sum=sum+p;
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println(" Number is Armstrong");
		}
		else
		{
			System.out.println(" Number is not a Armstrong");
		}
	}
	public static int power(int x,int n)
	{
		int P=1;
		for (int i = 1; i<=n; i++) 
		{
			P=P*x;
		}
    	return P;
	}
}
