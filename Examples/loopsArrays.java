public class loopsArrays {
  public static void main(String[] args) {
    // Example of while loop
    int i = 0;
    while (i < 5) {
      System.out.println("While loop iteration: " + i);
      i++;
    }

    // Example of do-while loop
    int j = 0;
    do {
      System.out.println("Do-while loop iteration: " + j);
      j++;
    } while (j < 5);

    // Example of for loop
    for (int k = 0; k < 5; k++) {
      System.out.println("For loop iteration: " + k);
    }

    // Example of for-each loop
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
      System.out.println("For-each loop iteration: " + number);
    }

    // Example of while(true) loop with continue and break
    int l = 0;
    while (true) {
      if (l == 3) {
      l++;
      continue; // Skip the rest of the loop when l is 3
      }
      if (l >= 5) {
      break; // Exit the loop when l is 5 or more
      }
      System.out.println("While(true) loop iteration: " + l);
      l++;
    }
  }
}
