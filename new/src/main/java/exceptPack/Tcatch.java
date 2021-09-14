package exceptPack;

public class Tcatch {
	public static void main(String args[])
	{
		int a=10;
		try {
			int b=a/0;
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			System.out.println("Rest of the code");
		}
	}

}
