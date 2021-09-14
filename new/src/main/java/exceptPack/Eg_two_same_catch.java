package exceptPack;

public class Eg_two_same_catch {
	public static void main(String args[])
	{
		int a=10;
		try {
			int b=a/0;
		}
		catch(NullPointerException i)
		{
			System.out.println(i);
			System.out.println("Rest of the code first catch");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Rest of the code second catch");
		}
	}

}
