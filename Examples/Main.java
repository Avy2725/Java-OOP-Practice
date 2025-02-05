import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public void surnames(){

		System.out.println("Input Name of Programmer 1: ");
		String name1 = in.nextLine();
		System.out.println("Input Name of Programmer 2: ");
		String name2 = in.nextLine();
		System.out.println("Input Name of Programmer 3: ");
		String name3 = in.nextLine();
	
		System.out.println("The programmers are: " + name1 + ", " + name2 + ", " + name3);

		System.out.println("Thank you!");
	
	
	}

public static void main(String[] args) {
	program1 call = new program1();
	call.multiply();
	call.isEven();

	Main call2 = new Main();
	call2.surnames();

in.close();
}

}
