import java.io.*;
import java.lang.*;
class String1
{
	public static void main(String args[])
	{
		String s1="kshitij";
		s1=s1.toLowerCase();
		String s2=s1.charAt(0);
		s2=s2.toUpperCase();
		String s3=s1.substring(1);
		String s4=s2.concat(s3);
		System.out.println("String :"+s1);
	}
}
