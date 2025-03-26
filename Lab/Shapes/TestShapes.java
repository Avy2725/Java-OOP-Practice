public class TestShapes {
  public static void main(String[] args) {
    try {
      for (String arg : args) {
        if (Integer.parseInt(arg) < 0) {
          throw new IllegalArgumentException("Negative values are not allowed.");
        }
      }

      if (args.length <= 0 || args.length > 3) {
        throw new IllegalArgumentException("Argument list must contain between 1 and 3 values.");
      } else {
        if (args.length == 1) {
          Shape circle = new Circle(Integer.parseInt(args[0]));
          circle.getDetails();
        } else if (args.length == 2 && !args[0].equals(args[1])) {
          Shape rectangle = new Rectangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
          rectangle.getDetails();
        } else if (args.length == 2 && args[0].equals(args[1])) {
          Shape square = new Square(Integer.parseInt(args[0]));
          square.getDetails();
        } else if (args.length == 3) {
          Shape triangle = new Triangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
          triangle.getDetails();
        }
      }
    } catch (NumberFormatException e) {
      throw new NumberFormatException("All arguments must be integers.");
    }
  }
}
