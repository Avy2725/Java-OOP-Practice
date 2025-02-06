enum Level {
  LOW,
  MEDIUM,
  HIGH
}

class LevelPrinter {
  private final Level level;

  public LevelPrinter(Level level) {
    this.level = level;
  }

  public void printLevel() {
    System.out.println(level);
  }
}

public class refType {
  public static void main(String[] args) {
    LevelPrinter levelPrinter = new LevelPrinter(Level.MEDIUM);
    levelPrinter.printLevel();

    // Create a String object with an initial value.
String originalString = "Hello";

// Assign it to another variable.
String newString = originalString;

// Change the content of the referenced string after assignment.
newString = "World";

// Output will be "World"
System.out.println(newString);

// Create a String array with initial values.
String[] words = {"Java", "is", "fun"};

// Assign it to another variable.
String[] newWords = words;

// Change the elements of the referenced array after assignment.
newWords[1] = "Cool";

// Output will be "Cool"
System.out.println(newWords[1]);

// Enumeration
// Annotations 
  }
}
