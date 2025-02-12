import java.util.Scanner;

public class StringOperations {
  static Scanner in = new Scanner(System.in);
  public boolean isPalindrome(String str) {
    String reversedStr = new StringBuilder(str).reverse().toString();
    return str.equals(reversedStr);
    }
  
    public int countVowels(String str) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (char c : str.toCharArray()) {
      if (vowels.indexOf(c) != -1) {
      count++;
      }
    }
    return count;
    }
  
    public String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
    }
      public static void main(String[] args) {
        StringOperations so = new StringOperations();
        System.out.println("Enter a string: ");
        String str = in.nextLine().trim().toLowerCase();
        System.out.println("The string is a palindrome: " + so.isPalindrome(str));
        System.out.println("The number of vowels in the string is: " + so.countVowels(str));
        System.out.println("The reverse of the string is: " + so.reverseString(str));
    
  }
}
