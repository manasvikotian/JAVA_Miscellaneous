import java.util.*;
class array1d
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int marks[]=new int[5];
		int grades[]=new int[5];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the marks of student"+(i+1)+":");
			int n=s.nextInt();
			marks[i]=n;
		}
		for(int i=0;i<grades.length;i++)
		{
			grades[i]=(marks[i]+1362)/100;
		}
		System.out.println("The marks and grades are as follows:");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks:"+marks[i]+"\nGrade:"+grades[i]+"\n\n");
		}
	}
}
