public class table {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please provide two numbers as command line arguments.");
      return;
    }

    int x, y;
    try {
      x = Integer.parseInt(args[0]);
      y = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format. Please provide valid integers.");
      return;
    }

    System.out.println("Multiplication Table: " + x + " x " + y);
    for (int i = 1; i <= x; i++) {
      for (int j = 1; j <= y; j++) {
        System.out.print("\t" +(i * j));
      }
      System.out.println();
    }

}
}