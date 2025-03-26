public class Rectangle implements Shape {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  @Override
  public double getArea() {
    return length * width;
  }

  @Override
  public void getDetails() {
    System.out.println("Type: rectangle");
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.printf("Perimeter: %.1f%n" , getPerimeter());
    System.out.printf("Area: %.1f%n" , getArea());
  }
}
