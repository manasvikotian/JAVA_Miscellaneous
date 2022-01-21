import java.io.*;
import java.lang.*;
class String1
{
	public static void main(String args[])
	{
		String S1="OOPM SE Div: A";
		String S2="OOPM Experiment";
		
		System.out.println("Character at position 8 :"+S1.charAt(8));
		System.out.println("Comparing S1 and S2 :"+S1.compareTo(S2));
		System.out.println("Comparing S2 and S1 :"+S2.compareTo(S1));
		System.out.println("After concatenation :"+S1.concat("1234"));
		System.out.println("Contents are equal to :"+S1.contentEquals(S2));
		System.out.println("S1 ends with A :"+S1.endsWith("A"));
		System.out.println("S1 starts with OOPM :"+S1.startsWith("OOPM"));
		System.out.println("Index of O :"+S1.indexOf("O"));
		System.out.println("Index of OOPM :"+S1.indexOf("PM"));
		System.out.println("Last index of O :"+S1.lastIndexOf("O"));
		System.out.println("Last index of O :"+S1.lastIndexOf("PM"));
		System.out.println("Length of S1 :"+S1.length());
		System.out.println("Length of S2 :"+S2.length());
		System.out.println("After replacing O with A :"+S1.replace("O","A"));
		System.out.println("Substring of S2 :"+S2.substring(5));
		System.out.println("Substring of S2 :"+S2.substring(5,10));
		System.out.println("S1 in uppercase :"+S1.toUpperCase());
		System.out.println("S1 in lowercase :"+S1.toLowerCase());
	}
}
