package exceptPack;

public class Eg_Finally {
	public static void main(String args[])
	{
		int a=10;
		try {
			int b=a/0;
			System.out.println("Rest of the try");
		}
		
		finally
		{
			System.out.println("Rest of the code");
		}
	}

}
