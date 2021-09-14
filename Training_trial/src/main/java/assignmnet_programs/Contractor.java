package assignmnet_programs;

import java.util.Scanner;

public class Contractor extends Employee_Super
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice 0 or 1 ");
		int choice=sc.nextInt();
		if (choice==0)
		{
			Contractor ob=new Contractor();
			ob.calculateSalary();
		}
		else 
		{
			Contractor ob=new Contractor();
	       ob.Salary();
	}
	}
	
	public void calculateSalary() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment per hour : ");
		int payment=sc.nextInt();
		System.out.println("Enter the hours of work : ");
		int hours=sc.nextInt();
		int calsalary=payment*hours;
		System.out.println("The salary is : "+calsalary);
	}

}
