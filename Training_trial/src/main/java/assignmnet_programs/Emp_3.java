package assignmnet_programs;

public class Emp_3 extends Emp_2{
	
	
	
	public void salary()
	{
	float totalsalary=bp+HRA-pf-dn+bon;
	
    System.out.println("===========================================================");
    System.out.println("	Salary-Slip");
    System.out.println("===========================================================");
	System.out.println("The basic pay of the employee 	 "+bp);	
	System.out.println("The deduction is               	 "+dn);
	System.out.println("HRA:                             "+HRA);
	System.out.println("The pf is :                      "+pf);
	System.out.println("The bonus is                     "+bon);
	System.out.println("The total salary  by hand is :   "+totalsalary);
	System.out.println("===========================================================");
	}

	public static void main(String args[])
	{
		
	
	Emp_3 ob3=new Emp_3();
	ob3.pf();
	ob3.hra();
	ob3.salary();
	
	
	
	}

}
