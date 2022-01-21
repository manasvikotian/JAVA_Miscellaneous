import java.io.*;
import java.lang.*;
class StringBuff
{
	public static void main(String args[])
	{
		StringBuffer S1=new StringBuffer("OOPM");
		System.out.println("String after append :"+S1.append(" Theory"));
		//S1=S1.append(" Theory");
		//System.out.println("String :"+S1);
		System.out.println("String after reverse :"+S1.reverse());
		System.out.println("String after insert :"+S1.insert(5," SE"));
		System.out.println("String after delete :"+S1.delete(3,7));
		System.out.println("String after replace :"+S1.replace(2,5,"Kshitij"));
		System.out.println("String's capacity :"+S1.capacity());
	}
}	
