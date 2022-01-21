import java.io.*;
class cal
{
	void sum(int a,int b)
	{
		System.out.println("Method 1");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Method 2");
		System.out.println(a+b+c);
	}
	void sum(double a,double b,double c)
	{
		System.out.println("Method 3");
		System.out.println(a+b+c);
	}
	void sum(double a,double b)
	{
		System.out.println("Method 4");
		System.out.println(a+b);
	}
	void sum(double a,int b)
	{
		System.out.println("Method 5");
		System.out.println(a+b);
	}
	void sum(int a,double b)
	{
		System.out.println("Method 6");
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		cal c=new cal();
		c.sum(1,5);
		c.sum(15,1290);
		c.sum(1,5.7);
		c.sum(1,90,5);
		c.sum(1.1,5.69948);
		c.sum(1.9,5.235,856.324);
		c.sum(0.1,5);
	}
}	
	
	
	
	
