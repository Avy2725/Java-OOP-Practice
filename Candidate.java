public class Candidate {
  // Candidate names and vote counts
  // 5 to 10
  private String canName;
  private int votes;

  // constructor
  public Candidate(String canName, int votes) {
    this.canName = canName.toLowerCase().trim();
    this.votes = votes;
  }

  public String getName() {
    return canName;
  }
  public int getVotes() {
    return votes;
  }

  public void addVote() {
    votes +=1;
  }


}
