import java.util.Scanner;

public class mP2 {

  static Scanner scanner = new Scanner(System.in);

  private int getNoStudents() {
    while(true) {
      System.out.println("Enter the number of students:");
      try {
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
          if (numberOfStudents < 1) {
              System.out.println("Error: Please enter a valid integer.");
          } else {
            return numberOfStudents;
          }
      } catch (NumberFormatException e) {
          System.out.println("Error: Please enter a valid integer.");
      }
  }
}

private void getStuData(int numberOfStudents) {
  for (int i = 0; i < numberOfStudents; i++) {
    System.out.println("Enter student " + (i + 1) + ":");
    
    System.out.print("Name: ");

    String name = scanner.nextLine();
    
    int[] scores = new int[4];
    for (int j = 0; j < 4; j++) {
        switch (j) {
            case 0:
            System.out.println("Enter scores in Human Computer Interaction:");
                break;
            case 1:
            System.out.println("Enter scores in Object Oriented Programming:");
                break;
            case 2:
            System.out.println("Enter scores in Computer Fundamentals:");
                break;
            case 3:
            System.out.println("Enter scores in Discrete Structure:");
                break;
        }

        

        while (!scanner.hasNextInt()) {
          System.out.println("Invalid input. Please enter a valid integer.");          
          try {
            scores[j] = Integer.parseInt(scanner.nextLine());  
          } catch (NumberFormatException e) {
              System.out.println("Error: Please enter a valid integer.");
          }
        }

        scores[j] = Integer.parseInt(scanner.nextLine());    

        if (scores[j] < 0 || scores[j] > 100) {
            System.out.println("Score must be between 0 and 100. Invalid score: " + scores[j]);
            j--;
        }
    }
    
    double average = calculateAverage(scores);
    char grade = determineGrade(average);
    
    displayStudent(name, average, grade);
}
}


    private double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / 4;
    }
    
    private char determineGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    private void displayStudent(String name, double average, char grade) {
        System.out.println("\n" + name);
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
      mP2 gr = new mP2();
      int numberOfStudents = gr.getNoStudents();
      gr.getStuData(numberOfStudents);
        scanner.close();
    }
}
