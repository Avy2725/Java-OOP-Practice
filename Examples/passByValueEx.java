// Class representing a Number with a single integer field 'num'
class Number {
  // Private field to store the integer value
  private int num;

  // Constructor to initialize the 'num' field
  public Number(int num) {
    this.num = num;
  }

  // Getter method to retrieve the value of 'num'
  public int getNum() {
    return num;
  }

  // Setter method to set the value of 'num'
  public void setNum(int num) {
    this.num = num;
  }

  // Method to modify the value of 'num' to 20
  public void modVall() {
    this.num = 20;
    // Printing the value of 'num' after modification
    System.out.println("After calling the method, the value of num is: " + this.num);
  }
}

public class passByValueEx {
  public static void main(String[] args) {
    // Creating an instance of Number with initial value 10
    Number number = new Number(10);
    // Printing the value of 'num' before calling the method
    System.out.println("Before calling the method, the value of num is: " + number.getNum());

    // Calling the method 'modVall' on the instance 'number'
    number.modVall();
  }
}

