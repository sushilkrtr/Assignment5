import java.util.Scanner;

public class Bankdetail {
	String cust_name;
	int acc_no;
	double bal=890000;
	double c;

	public void  withdraw(int c) throws InsufficientFundException
	{
		
			if(c>bal)
				{
				throw new InsufficientFundException();
				}
			else
				{System.out.println("Withdrawl Allowed");
				bal=bal-c;
				
				}
//		catch(InsufficientFundException e)
//		{
//			System.out.println(e);
//		}
	}
	
	public void getBalance()
	{
		System.out.println("Updated Balance is "+bal);
	}
	
	public static void main(String[] args) throws InsufficientFundException
	{
		
		Scanner sc=new Scanner(System.in);
		Bankdetail bd=new Bankdetail();
		try
		{
	    bd.withdraw(90000);
		}
		catch(InsufficientFundException e)
		{
//			System.out.println(e);
		}
		bd.getBalance();
		
	}
	
}
