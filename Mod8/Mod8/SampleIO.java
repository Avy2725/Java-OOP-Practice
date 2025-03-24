import java.io.*;

public class SampleIO
{
	public static void main(String args[])// throws IOException 	// declare an exception
	{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("What is your name?");
			String name = br.readLine();

			System.out.println("How old are you?");
			int age = Integer.parseInt(br.readLine());

			System.out.println("Hello " + name + ", next year you'll be " 
+ ++age + " years old.");
			br.close();
		throw new IOException();

		} 
		catch (IOException e)
		{
			System.err.println("An IOException occured..");
		}
	}
}

/*
Handle: try - catch block
Declare: throws
 */
 
