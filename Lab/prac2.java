public class prac2 {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Please provide 3 Strings as command line arguments.");
      return;
    }

    String a, b, c;
    try {
      a = args[0];
      b = args[1];
      c = args[2];
    } catch (NumberFormatException e) {
      System.out.println("Invalid format. Please provide valid Strings.");
      return;
    }

    
    for (int i = 0; i < args.length; i++) {
      System.out.println("args[" + i + "] = " + args[i] + " = " + args[i].length());
    }
  }
}
