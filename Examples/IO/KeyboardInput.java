
import java.io.*;
public class KeyboardInput
{
public static void main(String args[]) throws IOException
{
BufferedReader br =
new BufferedReader(new InputStreamReader(System.in)); System.out.println("Enter values and press ^Z or ^D to end."); String str;
while((str = br.readLine()) != null)
{
System.out.println(str + ", was typed."); // str = br.readLine();
}
br.close();
}
}
// "Z is null in Command.com // D is null in terminal
