public class classesInterfaces {
  interface Shape {
    double calculateArea();
    double calculatePerimeter();
  }

  class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    @Override
    public double calculateArea() {
      return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
      return 2 * Math.PI * radius;
    }
  }

  class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }

    @Override
    public double calculateArea() {
      return length * width;
    }

    @Override
    public double calculatePerimeter() {
      return 2 * (length + width);
    }
  }

  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  class Schedule {
    public String getWorkingHours(Day day) {
      switch (day) {
        case MONDAY:
        case TUESDAY:
        case WEDNESDAY:
        case THURSDAY:
        case FRIDAY:
          return "9 AM to 5 PM";
        case SATURDAY:
        case SUNDAY:
          return "Closed";
        default:
          return "Invalid day";
      }
    }
  }
  public static void main(String[] args) {
    classesInterfaces obj = new classesInterfaces();
    Circle circle = obj.new Circle(5);
    System.out.println("Circle Area: " + circle.calculateArea());
    System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

    Rectangle rectangle = obj.new Rectangle(5, 10);
    System.out.println("Rectangle Area: " + rectangle.calculateArea());
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    Schedule schedule = obj.new Schedule();
    System.out.println("Working hours on Monday: " + schedule.getWorkingHours(Day.MONDAY));
    System.out.println("Working hours on Saturday: " + schedule.getWorkingHours(Day.SATURDAY));
    System.out.println("Working hours on Invalid day: " + schedule.getWorkingHours(null));

  }
}
