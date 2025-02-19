
package pair;

import java.util.Scanner;

public class Student {
  static Scanner scanner = new Scanner(System.in);
  
  private String name;
  private int studentId;
  private boolean withDiscount;

  public Student(String name, int studentId, boolean withDiscount) {
    this.name = name;
    this.studentId = studentId;
    this.withDiscount = withDiscount;
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', studentId=" + studentId + ", withDiscount=" + withDiscount + "}";
  }


  public static void main(String[] args) {
    mainApp mainApp = new mainApp();
    int numberOfStudents = mainApp.getNoStudents();
  
    
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.print("--------------------------------------\n");
      System.out.print("Enter name for student " + (i + 1) + ": ");
      String name = scanner.nextLine();

      System.out.print("Enter student ID for student " + (i + 1) + ": ");
      int studentId = mainApp.getStuId();

      System.out.print("Does the student have a discount (Y/N) for student " + (i + 1) + ": ");
      boolean withDiscount = mainApp.getDiscount();

      Student student = new Student(name, studentId, withDiscount); // wla pa
      System.out.println(student.toString());


      System.out.println("How many trips are you taking?");
      int numTrips = mainApp.obtainNoTrips(); 
      
      System.out.print("--------------------------------------\n");

      for (int j = 0; j < numTrips; j++) {
        System.out.print("What is Your Ticket Type " + (i + 1) + ": ");
        String ticketType = mainApp.obtainTicketType();
  
        System.out.print("What's The Distance " + (i + 1) + "(in Kilometers): ");
        int distance = mainApp.obtainDistance();
  
        System.out.print("--------------------------------------\n");
  
        LRTFareCalcu lrtFareCalcu = new LRTFareCalcu();
        double baseFare = lrtFareCalcu.calcBaseFare(ticketType, distance, withDiscount);
        
        if (ticketType.equals(TicketType.SINGLE_JOURNEY.toString())){
          
          baseFare = lrtFareCalcu.calcSingleJourney(baseFare, distance);
          System.out.println(name + "'s final fare is: " + lrtFareCalcu.fareWithDiscount(baseFare, withDiscount));
          
        } else {
          
          double tempFare = lrtFareCalcu.calcMonthlyJourney(distance);
          tempFare = lrtFareCalcu.fareWithDiscount(tempFare, withDiscount);
          baseFare -= tempFare;
          System.out.println(name + "'s final fare is: " + tempFare + " your remaining balance is " + baseFare);
        }
      }
    }
  }
}


