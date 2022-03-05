import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.InputMismatchException;
class Students
{
	String name;
	int age;
	public void method(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class NamesAndAgePrintAllWithOutConstructor
{
	public static void main(String[] args)
	{
		try
		{	
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Number of Persons Eligible to Vote or Not");
			int n=scan.nextInt();
			List<Students> studs=new ArrayList<Students>(n);
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Name of The Student");
				String name=scan.next();
				System.out.println("Enter Age of The Student");
				int age=scan.nextInt();
				Students stud=new Students();
					   stud.method(name,age);
				studs.add(stud);
			}
			
			Iterator<Students> itr=studs.iterator();
			
			while(itr.hasNext())
			{
				Students std=itr.next();
				int age=std.age;
				String name=std.name;
				System.out.println("Name is :"+name+" and his age is :"+age);
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Only Integer in Age Context");
		}
		
		
	}
}