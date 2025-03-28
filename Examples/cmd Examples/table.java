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
    int[][] table = new int[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
      table[i][j] = (i + 1) * (j + 1);
      }
    }

    System.out.println("Multiplication Table: " + x + " x " + y);
    System.out.println("--------------------------------------");
    for (int[] row : table) {
      for (int value : row) {
      System.out.print(value + "\t");
      }
      System.out.println();
      System.out.println();
    }


}
}