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
    // Example of jagged arrays


    int[][] jaggedArray = {
      {1, 2, 3},
      {4, 5},
      {6, 7, 8, 9}
    };
    
    for (int x = 0; x < jaggedArray.length; x++) {
      for (int y = 0; y < jaggedArray[x].length; y++) { // needs to be like this due to diff lengths per row
        System.out.print(jaggedArray[x][y] + " ");
      }
      System.out.println();
    }
    System.out.println(jaggedArray.length + " LENGTH(Y)");
    // LENGTH STARTS WITH 1, INDEX STARTS WITH 0
    //   1 2 3    // 3 LENGTH(x)
    //   4 5      // 2 LENGTH(x)
    //   6 7 8 9  // 4 LENGTH(x)
    System.out.println(jaggedArray[2][1]);
    // Example of changing values within an array
    int[] array = {10, 20, 30, 40, 50};
  
    // Change the value at index 2
    array[2] = 99;
  
    // Print the modified array
    for (int o = 0; o < array.length; o++) {
      System.out.print(array[o] + " ");
    }
    System.out.println();


    // Example output:
    // 10 20 99 40 50

    System.out.println(" -------------------------------");
    
    // Example of flipping an array
    int[] originalArray = {1, 2, 3, 4, 5};
    int[] flippedArray = new int[originalArray.length];

    for (int p = 0; p < originalArray.length; p++) {
      flippedArray[p] = originalArray[originalArray.length - 1 - p];
      System.out.println(flippedArray[p] + " ");
    }


    // Example output: NAG FLIP NA SIYA dulo and start
    // 5 4 3 2 1
    System.out.println(" -------------------------------");
    int[] myArrays = {10, 20, 30, 40, 50};
    int temp = myArrays[0];
    myArrays[0] = myArrays[myArrays.length - 1];
    myArrays[myArrays.length - 1] = temp;
    for (int num : myArrays) {
      System.out.println(num + " ");
    }

    // Example of copying an array using System.arraycopy method
    int[] sourceArray = {1, 2, 3, 4, 5};
    int[] destinationArray = new int[sourceArray.length];

    // Copying elements from sourceArray to destinationArray
    System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

    // Print the copied array
    for (int q = 0; q < destinationArray.length; q++) {
      System.out.print(destinationArray[q] + " ");
    }
    System.out.println();

    // Example output:
    // 1 2 3 4 5
  }
}
