import java.io.*;
class Bank
{
	static double balance;
	static int acc,type,amt,a,i=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void getDetails()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your account number.");
		acc=Integer.parseInt(br.readLine());
		for(type=0;type!=1&&type!=2;)
		{
			System.out.println("Enter:\n1 - Savings Account.\n2 - Current Account.");
			type=Integer.parseInt(br.readLine());
			if(type!=1&&type!=2)
			{
				System.out.println("Invalid input. \nTry again.");
			}
		}
		System.out.println("Enter the balance in your account.");
		balance=Double.parseDouble(br.readLine());
	}
	void display()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Account number: "+acc);
		if(type==1)
		{
			System.out.println("Account type: Savings.");
		}
		else
		{
			System.out.println("Account type: Current.");
		}
		System.out.println("The balance in your account is: "+balance);
	}
	void deposit()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount to be entered.");
		amt=Integer.parseInt(br.readLine());
		balance=balance+amt;
		System.out.println("The balance after transaction is: "+balance);
	}
	void withdraw()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount to be withdrawn.");
		amt=Integer.parseInt(br.readLine());
		if(amt>balance)
		{
			System.out.println("Amount to be withdrawn is greater than the balance.");
		}
		else
		{
			if(type==1&&amt>2500)
			{
				System.out.println("Savings account cannot withdraw more than 2500 Rupees.");
			}
			else
			{
				balance=balance-amt;
				System.out.println("The balance after transaction is: "+balance);
			}
		}
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Bank b1=new Bank();
		b1.getDetails();
		for(a=0;i==0;)
		{
			System.out.println("Enter:\n1 - Deposit.\n2 - Withdrawal.");
			a=Integer.parseInt(br.readLine());
			if(a!=1&&a!=2)
			{
				System.out.println("Invalid input. \nTry again.");
			}
			else
			{
				if(a==1)
				{
					b1.deposit();
				}
				else
				{
					b1.withdraw();
				}
				System.out.println("Enter:\n1 - Deposit.\n2 - Withdrawal.\n3 - Stop.");
				a=Integer.parseInt(br.readLine());
				if(a==3)
				{
					break;
				}
			}
		}			
		b1.display();
	}
}

