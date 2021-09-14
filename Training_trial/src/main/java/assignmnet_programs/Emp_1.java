package assignmnet_programs;

import java.util.Scanner;

public class Emp_1 
{
	float dn;
	float bon;
	float bp;
	
	public Emp_1()
		{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic pay");
	    bp=sc.nextInt();
	    
	    System.out.println("Enter deduction");
	    dn=sc.nextInt();   
	    
	    System.out.println("Enter bonus");
	    bon=sc.nextInt();
	    
	    }

}
