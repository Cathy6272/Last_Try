package exPackage;

public class Test1 implements Test2
{
public static void main(String args[])
{
Test2 ob=new Test1();
ob.hello();
}
public void hello()
{
System.out.println("Hello");	
}
}
