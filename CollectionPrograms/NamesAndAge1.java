import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
class Students
{
	String name;
	int age;
	public Students(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class NamesAndAge1
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
				Students stud=new Students(name,age);
				studs.add(stud);
			}
			Iterator itr=studs.iterator();
			int i=0;
			while(itr.hasNext())
			{
				int age=studs.get(i).age;
				String name=studs.get(i).name;
				if(age>=18 && age<=100)
				{
					System.out.println(name+" Your Age is "+age+" your Eligible to Vote");
				}
				else if(age<=0)
				{
					System.out.println(name+" You Enterd "+age+" Please Enter Valid Age");
				}
				else if(age>100)
				{
					System.out.println(name+" You Enterd "+age+" Please Enter Valid Age");
				}
				else
				{
					System.out.println(name+" Your Age is "+age+" your Not Eligible to Vote");
				}
				i++;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Only Age/Number of Persons in input context");
	}
		catch(IndexOutOfBoundsException f)
		{
			//System.out.println("Enter Only Integer in Age Context");
		}
		
	}
}