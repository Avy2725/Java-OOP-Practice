package Lab.gradeSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class BantongCabantingInvalidScoreException extends RuntimeException{
    public BantongCabantingInvalidScoreException(String m){
        super(m);
    }
}



public class grade {
  public static void studentGrades() {
    File outputDir = new File("output");
      if (!outputDir.exists()) {
        outputDir.mkdir();
      }
    try(    
      FileInputStream studentsIn = new
      FileInputStream("students.txt");
      
      FileOutputStream outputStream = new
      FileOutputStream("output/grades.txt");
    ){

    int content;
    StringBuilder studentContent = new StringBuilder();
    while ((content = studentsIn.read()) != -1) {
      studentContent.append((char) content);

    }
      String[] studentLines = studentContent.toString().split("\\r?\\n");
      String[] studentNum = new String[studentLines.length];
      String[] studentName = new String[studentLines.length];
      String[] studentGrade = new String[studentLines.length];
      Integer[] studentIntGrade = new Integer[studentLines.length];
      String[] studentGradeLetter = new String[studentLines.length];

      
    
      for (int i = 0; i < studentLines.length; i++) {
        String[] parts = studentLines[i].split(",");
        if (parts.length == 3) {
        studentNum[i] = parts[0].trim();
        studentName[i] = parts[1].trim();
        studentGrade[i] = parts[2].trim();
        } else {
        System.out.println("Invalid line format: " + studentLines[i]);
        }
      }

      for (int num = 0; num < studentLines.length; num++) {
      studentIntGrade[num] = Integer.valueOf(studentGrade[num]);
      if (studentIntGrade[num] >= 90 && studentIntGrade[num] <= 100) {
        studentGradeLetter[num] = "A";
      } else if (studentIntGrade[num] >= 80 && studentIntGrade[num] < 90) {
        studentGradeLetter[num] = "B";
      } else if (studentIntGrade[num] >= 70 && studentIntGrade[num] < 80) {
        studentGradeLetter[num] = "C";
      } else if (studentIntGrade[num] >= 60 && studentIntGrade[num] < 70) {
        studentGradeLetter[num] = "D";
      } else if (studentIntGrade[num] < 60) {
        studentGradeLetter[num] = "F";
      }
      }

      
      for (int i = 0; i < studentLines.length; i++) {
        if (studentIntGrade[i] < 0 || studentIntGrade[i] > 100){
          System.out.println("Invalid score for " + studentName[i] + ": Score must be between 0 and 100");
        } 
      }

      System.out.println("Grade Summary:");
      System.out.println(String.format("%-15s | %-15s | %-10s | %-10s", "StudentID", "StudentName", "Score", "Grade"));

      String[] CombinedStrings = new String[studentLines.length];
      for (int i = 0; i < studentLines.length; i++) {
        if (studentIntGrade[i] > 0 && studentIntGrade[i] < 100) {
        CombinedStrings[i] = String.format("%-15s | %-15s | %-10s | %-10s", studentNum[i], studentName[i], studentGrade[i], studentGradeLetter[i]);
        }
      }
      Map<String, String> StudentData = new HashMap<>();

      outputStream.write("Grade Summary:".getBytes());
      outputStream.write(System.lineSeparator().getBytes());
      outputStream.write(String.format("%-10s | %-15s | %-5s | %-5s", "StudentID", "StudentName", "Score", "Grade").getBytes());
      outputStream.write(System.lineSeparator().getBytes());

      for (int i = 0; i < studentLines.length; i++){
        if (studentIntGrade[i] > 0 && studentIntGrade[i] < 100) {
        StudentData.put(studentNum[i], CombinedStrings[i]);
        CombinedStrings[i] = String.format("%-10s | %-15s | %-5s | %-5s", studentNum[i], studentName[i], studentGrade[i], studentGradeLetter[i]);
        outputStream.write( CombinedStrings[i].getBytes());
        outputStream.write(System.lineSeparator().getBytes());
        }
      }

      for (Map.Entry<String, String> entry : StudentData.entrySet()) {
        System.out.println(entry.getValue());
      }
      System.out.println("Files in the output directory:");
      File[] files = outputDir.listFiles();
      if (files != null) {
        for (File file : files) {
          System.out.println(file.getName());
        }
      } else {
        System.out.println("No files found in the output directory.");
      }
      
    }catch (IOException e){
      e.printStackTrace();
    }
  }
  
  public static void ValidateGrade(int gradenum, String studentName) {
    if (gradenum < 0 || gradenum > 100){
      throw new BantongCabantingInvalidScoreException("Invalid score for " + studentName + ": Score must be between 0 and 100" );
    } 
  }
  
  public static void main(String[] args) {   
    Scanner in = new Scanner(System.in); 
    // File node - reading and writing to files
    try (
    FileInputStream userIn = new
    FileInputStream("userlist.txt");


    // FileOutputStream outputStream = new
    // FileOutputStream("output.txt");
    ) {
    // Displaying the content of userlist.txt
    int userContent;
    StringBuilder fileContent = new StringBuilder();
    while ((userContent = userIn.read()) != -1) {
      fileContent.append((char) userContent);

    }
    // System.out.println(fileContent.toString());

        // Splitting the content into user and pass arrays
        String[] lines = fileContent.toString().split("\\r?\\n");
        String[] users = new String[lines.length];
        String[] passwords = new String[lines.length];
    
        for (int i = 0; i < lines.length; i++) {
          String[] parts = lines[i].split(",");
          if (parts.length == 2) {
            users[i] = parts[0].trim();
            passwords[i] = parts[1].trim();
          } else {
            System.out.println("Invalid line format: " + lines[i]);
          }
        }
            

        while(true) { // loop to keep asking until user enters the right input
          System.out.println("Enter Username: ");
          String username = in.nextLine();
          System.out.println("Enter Password: ");
          String password = in.nextLine();

          for (int i = 0; i < users.length; i++) {
            if (username.equals(users[i]) && password.equals(passwords[i])) {
              System.out.println("Welcome " + username + "!");
              File studentList = new File("students.txt");

              System.out.println("Does the file exist?: " + studentList.exists());
              System.out.println("File Name: " + studentList.getName());
              System.out.println("File Size: " + studentList.length());
              System.out.println("Last Modified: " + studentList.lastModified());
              System.out.println("Is hidden: " + studentList.isHidden());
              studentGrades();
              
              break;
            } else if (i == users.length - 1) {
              System.err.println("User Not Found");
            }
          }
          break;
        }

    } catch (IOException e) {
    e.printStackTrace();
    }
  }
}

        // Displaying the users and passwords
        // System.out.println("Users:");
        // for (String user : users) {
        //   System.out.println(user);
        // }
    

