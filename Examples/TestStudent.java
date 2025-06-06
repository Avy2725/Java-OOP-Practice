public class TestStudent {
  public static void main(String args[]) {
    Student students[] = {
      new Student("Mathew", "BSCS", 10000.0F),
      new Student("Mark", "BSIT", 12000.0F),
      new PartialScholar("Luke", "BSIT", 12000.0F, 0.25F),
      new PartialScholar("John", "BSIT", 11000.0F, 0.5F)
    };

    float totalCollection = 0.0F;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString(i + 1) + "\n");
    }

    // compute total Collection value
    for (int i = 0; i < students.length; i++) {
      if (students[i] instanceof PartialScholar) {
        totalCollection += ((PartialScholar) students[i]).getPayableAmount();
      } else if (students[i] instanceof Student) {
        totalCollection += students[i].getTuitionFee();
      }
    }

    System.out.println("\nTotal Collectible Amount: " + totalCollection);
  }
}