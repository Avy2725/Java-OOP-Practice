package pair;
import java.util.Scanner;

public class mainApp {
  static Scanner scanner = new Scanner(System.in);


  public int getNoStudents() {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.print("Enter the number of students: ");
      try {
        int numberOfStudents = Integer.parseInt(scanner.nextLine()); 
          if (numberOfStudents < 1) { 
            System.out.println("Error: Please enter a valid integer.");
          } else {
            System.out.println("Number of students: " + numberOfStudents);
            return numberOfStudents; 
          }
      } catch (NumberFormatException e) { 
      System.out.println("Error: Please enter a valid integer.");
      }
  }
}

public int getStuId() {
  while(true) {
    try {
      int id = Integer.parseInt(scanner.nextLine().trim()); 
        if (id < 1) { 
          System.out.println("Error: Please enter a valid Id.");
        } else {
          return id; 
        }
    } catch (NumberFormatException e) { 
    System.out.println("Error: Please enter a Id.");
    }
}
}

public boolean getDiscount() {
  Scanner scanner = new Scanner(System.in);
  while(true) {
    try {
      String dis = scanner.nextLine().toLowerCase().trim(); 
        if (dis.equals("n")) { 
          System.out.println("You Don't have a discount");
          return false;
        } else if (dis.equals("y")) {
          System.out.println("You have a discount");
          return true; 
        } else {
          System.out.print("Wrong input: Please enter a Y/N.");
        }
    } catch (NumberFormatException e) { 
    System.out.println("Error: Please enter a Y/N.");
    }
}
}

public String obtainTicketType() {
  Scanner scanner = new Scanner(System.in);
  while(true) {
    try {
      String ticketString = scanner.nextLine().toUpperCase().trim(); 
        if (ticketString.equals(TicketType.SINGLE_JOURNEY.toString())) { 
          
          return ticketString;
        } else if (ticketString.equals(TicketType.MONTHLY_BEEP.toString())) {
          return ticketString; 
        } else {
          System.out.print("Wrong input: Please enter SINGLE_JOURNEY/MONTHLY_BEEP ");
        }
    } catch (NumberFormatException e) { 
    System.out.println("Error: Please enter SINGLE_JOURNEY/MONTHLY_BEEP ");
    }
}
}

public int obtainDistance() {
  while(true) {
    try {
      int id = Integer.parseInt(scanner.nextLine().trim()); 
        if (id < 1) { 
          System.out.println("Error: Please enter a valid integer.");
        } else {
          return id; 
        }
    } catch (NumberFormatException e) { 
    System.out.println("Error: Please enter a integer.");
    }
}
}

public int obtainNoTrips() {
  Scanner scanner = new Scanner(System.in);
  while(true) {
    System.out.print("Enter the Number of Trips: ");
    try {
      int numberOfTrips = Integer.parseInt(scanner.nextLine().trim()); 
        if (numberOfTrips < 1) { 
          System.out.println("Error: Please enter a Number of Trips.");
        } else {
          System.out.println("Number of Trips: " + numberOfTrips);
          return numberOfTrips; 
        }
    } catch (NumberFormatException e) { 
    System.out.println("Error: Please enter a valid integer.");
    }
}
}
}
