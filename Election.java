import java.util.Scanner;

public class Election {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    Candidate candi1 = new Candidate("Avy Cabanting", 0);
    Candidate candi2 = new Candidate("Lexie Real", 0);
    Candidate candi3 = new Candidate("Imman Lingad", 0);
    Candidate candi4 = new Candidate("Austin Reyes", 0);
    Candidate candi5 = new Candidate("Jared Maqkenzy", 0);

    int totalVoters;

    System.out.println("How Many Will Vote? (1 - 10)");
    try {
        totalVoters = Integer.parseInt(in.nextLine());
        if (totalVoters < 1 || totalVoters > 10) {
            throw new IllegalArgumentException("Number of voters must be between 1 - 10.");
        }
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage() + " Is invalid Please enter 1 - 10");
        return;
    }


    System.out.println("------------------------------------");

    System.out.println("Welcome to the Candidate Voting System");
    System.out.println("Cadidates are: Avy Cabanting, Lexie Real, Imman Lingad, Austin Reyes, Jared Maqkenzy");


for (int votes = 1; votes <= totalVoters;) {
  System.out.println("------------------------------------");
  System.out.println("Who Will you vote for Voter Number: " + votes);
  String voteWho = in.nextLine().toLowerCase().trim();

  switch (voteWho) {
      case "avy cabanting":
      candi1.addVote();
      votes++;
          break;
      case "lexie real":   
      candi2.addVote();
      votes++;
          break;
      case "imman lingad":   
      candi3.addVote(); 
      votes++;
          break;
      case "austin reyes":   
      candi4.addVote(); 
      votes++;
          break;
      case "jared maqkenzy":
      candi5.addVote();
      votes++;
          break;
      default:
      System.out.println("Candidate Does Not Exist or Invalid Vote");
  }
}
    System.out.println("------------------------------------");
    System.out.println("Voting Has Stopped");
    System.out.println("The Candidate | " + candi1.getName() + "\t | Got " + candi1.getVotes() + " Total Votes");
    System.out.println("The Candidate | " + candi2.getName() + "\t | Got " + candi2.getVotes() + " Total Votes");
    System.out.println("The Candidate | " + candi3.getName() + "\t | Got " + candi3.getVotes() + " Total Votes");
    System.out.println("The Candidate | " + candi4.getName() + "\t | Got " + candi4.getVotes() + " Total Votes");
    System.out.println("The Candidate | " + candi5.getName() + "\t | Got " + candi5.getVotes() + " Total Votes");

    Candidate[] candidates = {candi1, candi2, candi3, candi4, candi5};
    Candidate winner = candidates[0];
    for (int i = 0; i < candidates.length; i++) {
      if (winner.getVotes() < candidates[i].getVotes()) {
        winner = candidates[i];
      }
    }
    System.out.println("The Winner is " + winner.getName());
  }  

}
