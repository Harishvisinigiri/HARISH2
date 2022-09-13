public class finalException 
{
	public static void main(String[] args) {
		System.out.println("main() started");
		int a=10,b=5;
		try
		{
			System.out.println(a/b);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("finally block executed");
		}	
		System.out.println("main() ended");
	}

}
