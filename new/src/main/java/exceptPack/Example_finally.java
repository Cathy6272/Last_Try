package exceptPack;

public class Example_finally {
	public static void main(String args[])
	{
		int a=10;
		try {
			int b=a/0;
			System.out.println("Rest of the try");
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			
		}
		finally
		{
			System.out.println("Rest of the code");
		}
	}

}
