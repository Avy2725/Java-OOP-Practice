import java.util.Scanner;

public class FinalsHomework {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.println("Enter numerator(x) (x/y):");
    int numerator = s.nextInt();

    System.out.println("Enter denominator(y): " + "(" + numerator + "/y)");
    int denominator = s.nextInt();

    System.out.println("User Input is: " + numerator + "/" + denominator);

    // Calculate the quotient as a double value
    double quotient = (double) numerator / denominator;

    // Display the quotient in three different formats
    System.out.println("Raw double quotient value: " + quotient);
    System.out.println("Rounded to two decimal places: " + String.format("%.2f", quotient));
    
    System.out.println("Right-aligned (6 characters, 2 decimal places) using String.format(): " + String.format("[%6.2f]%n", quotient));
    System.out.printf("Right-aligned (6 characters, 2 decimal places) using System.out.printf(): [%6.2f]%n", quotient);

    s.close();
  }
}
