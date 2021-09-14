package assignmnet_programs;

import java.util.Scanner;

public abstract class Employee_Super 
{
public abstract void calculateSalary();
float totalsalary;
public final int hrs=8;

public void Salary()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the payment per hour : ");
	int payment=sc.nextInt();
 totalsalary=payment*hrs;
 System.out.println("The salary of FullTime Employee is :"+totalsalary );
}

}
