public class prac1 {
  public static void main(String[] args) {
    
    if (args.length != 4) {
      System.out.println("Please provide 4 numbers as command line arguments.");
      return;
    }

    int a, b, c, d;
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = Integer.parseInt(args[2]);
      d = Integer.parseInt(args[3]);
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format. Please provide valid integers.");
      return;
    }

    int sum = 0;
    int[] numbers = {a, b, c, d};
    for (int number : numbers) {
      sum += number;
    }
    double average = sum / (double) numbers.length;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
