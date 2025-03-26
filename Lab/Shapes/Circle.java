public class Circle implements Shape {
  private float PI = 3.14f;
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * PI * radius;
  }

  @Override
  public double getArea() {
    return PI * radius * radius;
  }

  @Override
  public void getDetails() {
    System.out.println("Type: circle");
    System.out.println("Radius: " + radius);
    System.out.printf("Perimeter: %.1f%n" , getPerimeter());
    System.out.printf("Area: %.1f%n" , getArea());
  }
}
