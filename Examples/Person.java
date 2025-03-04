public class Person {
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Setter for age
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Age must be positive.");
    }
  }

  // Method to display person details
  public void displayPersonInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  public static void main(String[] args) {
    Person person = new Person("John Doe", 25);
    person.displayPersonInfo();

    person.displayPersonInfo();
  }
}