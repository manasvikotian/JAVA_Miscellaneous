import java.util.*;
class bitwise1
{
	public static void main(String args[])
	{
		int a,b;
		boolean c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Bitwise AND="+(a&b));
		System.out.println("Bitwise OR="+(a|b));
		System.out.println("Bitwise XOR="+(a^b));
		System.out.println("Bitwise NOT="+(~a));
		System.out.println("Shift right="+(a>>2));
		System.out.println("Shift left="+(a<<2));
		System.out.println("Equality operator="+(a==b));
		System.out.println("Not equal to operator="+(a!=b));
		System.out.println("Less than="+(a<b));
		System.out.println("Greater than="+(a>b));
		
		System.out.println("Enter true/false value for c and d:");
		c=s.nextBoolean();
		d=s.nextBoolean();
		System.out.println("Logical AND operator="+(c&&d));
		System.out.println("Logical OR operator="+(c||d));
		
	}
}
