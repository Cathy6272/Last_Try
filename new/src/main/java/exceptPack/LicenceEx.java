package exceptPack;

public class LicenceEx {
	public void Validate(int age)throws NeethaException
	{
	if(age<18)
	{
		throw new NeethaException("Age not valid");
	}
	else
	{
		System.out.println("Eligible to vote");
	}
	}
public static void main(String args[])
{
LicenceEx ob=new LicenceEx();
try
{
ob.Validate(12);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
