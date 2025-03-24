public class ArgsException4
{
	public static void main(String args[])
	{
		int sum = 0;
		for (int i = 0; i < args.length; i++)
		{
			try
			{
				sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException nfe)
			{
				System.err.println("[" + args[i] 
						+ "] is not an int.");
			}
			finally {
				System.out.println("===========");
			}

		}
		System.out.println("Sum: " + sum);
	}
}
