import java.util.Scanner;

public class Election {

  static Scanner in = new Scanner(System.in);

  public int crrVoter = 1;

  public Candidate candi1 = new Candidate("Avy Cabanting", 0);
  public Candidate candi2 = new Candidate("Lexie Real", 0);
  public Candidate candi3 = new Candidate("Imman Lingad", 0);
  public Candidate candi4 = new Candidate("Austin Reyes", 0);
  public Candidate candi5 = new Candidate("Jared Maqkenzy", 0);

  public Candidate[] candidatesRos = {candi1, candi2, candi3, candi4, candi5};

  public void displayCandi() {
    System.out.println(candidatesRos.length);
		System.out.println("These are your Candidates:\n");
		for (int i = 0; i < candidatesRos.length; i++) {
			System.out.println(candidatesRos[i].getName());
		}
		System.out.println();
	}

  public int getVoters() {
    while(true) {
      System.out.println("Please enter the number of registered voters (1-10):");
      try {
          int totalVoters = Integer.parseInt(in.nextLine());
          if (totalVoters < 1 || totalVoters > 10) {
              System.out.println("Error: Only numbers between 1 and 10 are allowed.");
          } else {
              return totalVoters;
          }
      } catch (NumberFormatException e) {
          System.out.println("Error: Please enter a valid integer.");
          continue;
      }
  }
	}

  public void vote(int totalVoters) {
		System.out.println("Enter the name of the candidate you want to vote for");
		while (crrVoter <= totalVoters) {
			System.out.println("Who Will you vote for Voter Number: " + crrVoter);
			String candidate = in.nextLine();
			candidateIsValid(candidate);
		}
	}

  public void candidateIsValid(String candiName) {

		boolean candidateFound = false;
    for (int i = 0; i < candidatesRos.length; i++) {
      String candidate = candidatesRos[i].getName();
			if (candiName.toLowerCase().equals(candidate.toLowerCase().trim())) {
				candidatesRos[i].addVote();
				candidateFound = true;
				crrVoter++;
			}
    }
		if (candidateFound == false) {
			System.out.println("Candidate not found");
		}
	}
  
  public Candidate topCandi() {
    Candidate win = candidatesRos[0];
    for (int i = 0; i < candidatesRos.length; i++) {
      if (win.getVotes() < candidatesRos[i].getVotes()) {
        win = candidatesRos[i];
      }
    }

    for (int i = 0; i < candidatesRos.length; i++) {
      if (win.getVotes() == candidatesRos[i].getVotes() && win.getName() != candidatesRos[i].getName()) {
        return null;
      }
    }

		return win;
	}

  public void display(Candidate winner){
    for (int i = 0; i < candidatesRos.length; i++) {
      System.out.println(candidatesRos[i].getName() + ":\t" + candidatesRos[i].getVotes() + " Total Votes");
    }
    System.out.println("------------------------------------");
		if (winner == null) {
			System.out.println("There is a draw");
		} else {
			System.out.println("Overall Winner: " + winner.getName());
			System.out.println("Congratulations " + winner.getName() + "!");
		}
	}
	

  public static void main(String[] args) {
    Election elec = new Election();
    elec.displayCandi();
    int totalVoters = elec.getVoters();
    elec.vote(totalVoters);
    Candidate win = elec.topCandi();
    elec.display(win);
  }  

}
