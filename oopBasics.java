// oopBasics.java

// Class demonstrating various OOP concepts in Java

// 1. Encapsulation: Wrapping data (variables) and code (methods) together as a single unit.
class Person {
  // Private variables to restrict direct access
  private String name;
  private int age;

  // Constructor to initialize Person object
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Public getter and setter methods to access and update private variables
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

// 2. Inheritance: Mechanism where one class acquires the properties and behaviors of a parent class.
class Employee extends Person {
  private String employeeId;

  // Constructor to initialize Employee object
  public Employee(String name, int age, String employeeId) {
    super(name, age); // Calling the constructor of the parent class (Person)
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
}

// 3. Polymorphism: Ability of an object to take many forms. It allows one interface to be used for a general class of actions.
class Manager extends Employee {
  private int teamSize;

  // Constructor to initialize Manager object
  public Manager(String name, int age, String employeeId, int teamSize) {
    super(name, age, employeeId); // Calling the constructor of the parent class (Employee)
    this.teamSize = teamSize;
  }

  // Overriding the getEmployeeId method to demonstrate polymorphism
  @Override
  public String getEmployeeId() {
    return "Manager ID: " + super.getEmployeeId();
  }

  public int getTeamSize() {
    return teamSize;
  }

  public void setTeamSize(int teamSize) {
    this.teamSize = teamSize;
  }
}

// 4. Data Abstraction: Hiding the complex implementation details and showing only the necessary features of an object.
abstract class Shape {
  // Abstract method (does not have a body)
  abstract void draw();
}

class Circle extends Shape {
  // Providing implementation for the abstract method
  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }
}

class Rectangle extends Shape {
  // Providing implementation for the abstract method
  @Override
  void draw() {
    System.out.println("Drawing a Rectangle");
  }
}

// 5. Modularity: Dividing a program into separate modules that can be developed, tested, and debugged independently.
public class oopBasics {
  public static void main(String[] args) {
    // Creating objects and demonstrating encapsulation
    Person person = new Person("John Doe", 30);
    System.out.println("Person Name: " + person.getName());
    System.out.println("Person Age: " + person.getAge());

    // Creating objects and demonstrating inheritance
    Employee employee = new Employee("Jane Doe", 28, "E123");
    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Employee Age: " + employee.getAge());
    System.out.println("Employee ID: " + employee.getEmployeeId());

    // Creating objects and demonstrating polymorphism
    Manager manager = new Manager("Alice Smith", 35, "M456", 10);
    System.out.println("Manager Name: " + manager.getName());
    System.out.println("Manager Age: " + manager.getAge());
    System.out.println(manager.getEmployeeId());
    System.out.println("Manager Team Size: " + manager.getTeamSize());

    // Creating objects and demonstrating data abstraction
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    circle.draw();
    rectangle.draw();
  }
}