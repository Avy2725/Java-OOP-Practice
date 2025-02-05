
import java.util.Scanner;

public class errorHandle {

  static  Scanner scanner = new Scanner(System.in);

  private int getNoStudents() {
    while(true) { // loop to keep asking until user enters the right input
      System.out.println("Enter the number of students:");
      try {
        int numberOfStudents = Integer.parseInt(scanner.nextLine()); // get the input from the user converts String into int data type
          // This part of the code will check for conditions that will stop the loop
          if (numberOfStudents < 1) { // range of accepted values with the right data type
              System.out.println("Error: Please enter a valid integer.");
          } else {
            // This part of the code will only run if the input is within the range and the right data type
            return numberOfStudents; // return the value the expected value within the range and right data type (stops the loop)
          }
      } catch (NumberFormatException e) { // catch the wrong data type (program doesn't crash/stop)
      // This part of the code will only run if the input is not the right data type
          System.out.println("Error: Please enter a valid integer.");
      }
  }
}

public static void main(String[] args) {
  errorHandle errorHandle = new errorHandle();
  int numberOfStudents = errorHandle.getNoStudents();
  System.out.println("Number of students: " + numberOfStudents);
}
}
