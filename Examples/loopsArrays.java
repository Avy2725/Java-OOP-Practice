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
    for (int number : numbers) {// number is the variable that holds the value of the current element, numbers is the array
      System.out.println("For-each loop iteration: " + number);
    }

    // Example of break and continue in a for loop
    for (int m = 0; m < 10; m++) {
      if (m == 2) {
        continue; // Skip the rest of the loop when m is 2
      }
      if (m == 7) {
        break; // Exit the loop when m is 7
      }
      System.out.println("For loop iteration with break and continue: " + m);
    }
    // Example output:
    // For loop iteration with break and continue: 0
    // For loop iteration with break and continue: 1
    // For loop iteration with break and continue: 3
    // For loop iteration with break and continue: 4
    // For loop iteration with break and continue: 5
    // For loop iteration with break and continue: 6

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
    // Example output:
    // While(true) loop iteration: 0
    // While(true) loop iteration: 1
    // While(true) loop iteration: 2
    // While(true) loop iteration: 4
  }

  // Example of jagged arrays
  public static void jaggedArrayExample() {
    int[][] jaggedArray = {
      {1, 2, 3},
      {4, 5},
      {6, 7, 8, 9}
    };

    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }
  }

//   1 2 3 
//   4 5 
//   6 7 8 9 
}
