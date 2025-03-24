int[] numbers = {1, 2, 3};

try {
    System.out.println("Third element: " + numbers[3]);
} catch (IndexOutOfBoundsException e) {
    System.out.println("Error: Invalid array index.");
}