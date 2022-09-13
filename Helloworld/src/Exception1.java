import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Exception1 
{
	public static void main(String[] args) 
	{
	try 
	{
		FileOutputStream f1 = new FileOutputStream("D://hello.txt");
		System.out.println("File created!!");
	}
	catch (FileNotFoundException e)
	{
		System.out.println("File created failed!!");
	}
	}

}
