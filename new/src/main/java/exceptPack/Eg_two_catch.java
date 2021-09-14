package exceptPack;

public class Eg_two_catch {
	public static void main(String args[])
	{
		int a=10;
		try {
			int b=a/0;
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			System.out.println("Rest of the code first catch");
		}
		catch(NullPointerException i)
		{
			System.out.println(i);
			System.out.println("Rest of the code second catch");
		}
	}
}
