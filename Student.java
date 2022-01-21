import java.io.*;
class Student
{
	int roll,M,P;
	String name;
	void getDetails()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name, Roll number, Maths marks and Physics marks.");
		name=br.readLine();
		roll=Integer.parseInt(br.readLine());
		M=Integer.parseInt(br.readLine());
		P=Integer.parseInt(br.readLine());

	}
	void displayData()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+roll);
		System.out.println("Maths marks:"+M);
		System.out.println("Physics marks:"+P);
	}
	public static void main(String args[])throws IOException
	{
		Student s1=new Student();
		s1.getDetails();
		s1.displayData();
	}
}
