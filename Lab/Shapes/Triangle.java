public class Triangle implements Shape {
  private int side1;
  private int side2;
  private int side3;

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public double getArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public void getDetails() {
    System.out.println("Type: triangle");
    System.out.println("Side 1: " + side1);
    System.out.println("Side 2: " + side2);
    System.out.println("Side 3: " + side3);
    System.out.printf("Perimeter: %.1f%n" , getPerimeter());
    System.out.printf("Area: %.1f%n" , getArea());
  }
}
