
public class Prefect {
     
	public static void main(String[] args)
	{
		int num=28;
		int sum=0;
		int i=1;
		while(i<num)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
			if(sum==num)
			{
				System.out.println(num+" it is a prefect");
			}
			else
			{
				System.out.println(num+" it is  a not prefect");
			}
	}
}
