import java.io.*;

public class SampleIO2
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			BufferedReader in = 
					new BufferedReader(new 
					InputStreamReader(System.in));

			System.out.println("What is your name?");
			String name = in.readLine();
			System.out.println("How old are you?");
			int age = Integer.parseInt(in.readLine());
			System.out.println("Hello " + name + 
				", next year you will be " + (age + 1) + 
				" years old.");
			in.close();
		}
		catch(IOException ioe)
		{
		 	System.err.println("An exception occured.." + ioe);
		}
	}
}
