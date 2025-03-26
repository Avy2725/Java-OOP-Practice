public class Square implements Shape {
  private int side;

  public Square(int side ) {
    this.side = side;
  }

  @Override
  public double getPerimeter() {
    return 4 * side;
  }

  @Override
  public double getArea() {
    return side * side;
  }

  @Override
  public void getDetails() {
    System.out.println("Type: square");
    System.out.println("Side: " + side);
    System.out.printf("Perimeter: %.1f%n" , getPerimeter());
    System.out.printf("Area: %.1f%n" , getArea());
  }
  
}
