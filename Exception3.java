import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 
{
	int a;
	int b;
	int c;
	public void sum() throws ArithmeticException
	{
	try
	{
	 c= a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
	}
	public static void main (String[] args) throws InputMismatchException{
		Scanner sc=new Scanner(System.in);
		Exception3 ex=new Exception3();
		try {
		System.out.println("Enter value of a");
		ex.a=sc.nextInt();
		System.out.println("Enter value of b");
		ex.b=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally
		{
		ex.sum();
		}
		System.out.println("Hello");
	}
	}