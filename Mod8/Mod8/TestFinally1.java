

public class TestFinally1
{
	public static void main(String args[])
	{
		System.out.println("Inside the main method..");
		doStuff();
		System.out.println("After doStuff() call..");
	}

	public static void doStuff()
	{
		System.out.println("Inside doStuff");
		try
		{
			System.out.println("Inside the try block..");
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught..");
			return;
		}
		finally
		{
			System.out.println("Inside the finally block..");
		}
	}
}

