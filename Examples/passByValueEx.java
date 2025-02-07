public class passByValueEx {
  // This method attempts to modify the value of the parameter 'num'
  public static void modVall(int num) {
    // Assigning a new value to 'num'
    num = 20;
    // Printing the value of 'num' within the method
    System.out.println("After calling the method, the value of num is: " + num);
  }
    
  public static void main(String[] args) {
    // Initializing 'num' with a value of 10
    int num = 10;
    // Printing the value of 'num' before calling the method
    System.out.println("Before calling the method, the value of num is: " + num);

    // Calling the method 'modVall' and passing 'num' as an argument
    modVall(num);
  }
}
