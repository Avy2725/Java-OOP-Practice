import java.util.Scanner;

public class program1 {
static Scanner in = new Scanner(System.in);
// 	Write a method multiply that takes two integers and returns their product.
// Create a method isEven that checks if a number is even.
	
// Create a method
public int multiply () {

	System.out.println("Input An Int (A)");
	int a = in.nextInt();

	System.out.println("Input An Int (B)");
	int b = in.nextInt();

	int prod = a * b;
	System.out.println("Product: " + prod);
	return prod;
}

public void isEven () {
	System.out.println("Input An Int (C)");
	int c = in.nextInt();
	if (c % 2 == 0) {
		System.out.println(c + " Your Number is Even");
	} else {
		System.out.println(c + " is not an even number");
	} 
	}
}
