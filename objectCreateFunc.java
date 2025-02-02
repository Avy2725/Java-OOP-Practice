import java.util.Scanner;

public class objectCreateFunc {
  static Scanner in = new Scanner(System.in);

  private String name;
  private int age;

  public static objectCreateFunc[] users;
  
  
    // constructor
    public objectCreateFunc(String name, int age ) {
      this.name = name.toLowerCase().trim();
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }
  
    public static int getUsers() {
      while(true) {
        System.out.println("Please enter the number of registered voters (1-10):");
        try {
            int totalUsers = Integer.parseInt(in.nextLine());
            if (totalUsers < 1 || totalUsers > 10) {
                System.out.println("Error: Only numbers between 1 and 10 are allowed.");
            } else {
                return totalUsers;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
    }
  
    public static void getUserInfo(int x) {
      for (int i = 0; i < x; i++) {
        System.out.println("Set Name");
        String useName = in.nextLine();
        System.out.println("Set Age");
        int useAge = in.nextInt();
        users[i] = (new objectCreateFunc(useName, useAge));
    }
  }

  public  static void displayUsers(int x) {
		System.out.println("These are your Candidates:\n");
		for (int i = 0; i < x; i++) {
			System.out.println(users[i].getName());
		}
		System.out.println();
	}
	

  // public void vote(int totalVoters) {
	// 	while (crrVoter <= totalVoters) {
	// 		System.out.println("Who Will you vote for Voter Number: " + crrVoter);
	// 		String candidate = in.nextLine();
	// 		candidateIsValid(candidate);
	// 	}
	// }

  // public int getVoters() {
  //   while(true) {
  //     System.out.println("Please enter the number of registered voters (1-10):");
  //     try {
  //         int totalVoters = Integer.parseInt(in.nextLine());
  //         if (totalVoters < 1 || totalVoters > 10) {
  //             System.out.println("Error: Only numbers between 1 and 10 are allowed.");
  //         } else {
  //             return totalVoters;
  //         }
  //     } catch (NumberFormatException e) {
  //         System.out.println("Error: Please enter a valid integer.");
  //         continue;
  //     }
  // }
	// }

  // public void candidateIsValid(String candiName) {

	// 	boolean candidateFound = false;
  //   for (int i = 0; i < candidatesRos.length; i++) {
  //     String candidate = candidatesRos[i].getName();
	// 		if (candiName.toLowerCase().equals(candidate.toLowerCase().trim())) {
	// 			candidatesRos[i].addVote();
	// 			candidateFound = true;
	// 			crrVoter++;
	// 		}
  //   }
	// 	if (candidateFound == false) {
	// 		System.out.println("Candidate not found");
	// 	}
	// }
  

  public static void main(String[] args) {
    int x = getUsers();
    getUserInfo(x);
    displayUsers(x);
  }  
}

