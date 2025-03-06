class Student {
    private String name;
    private String course;
    private float tuitionFee;
    private int studentNumber;
    static int counter;

    public Student(String name, String course, float tuitionFee) {
        this.name = name;
        this.course = course;
        this.tuitionFee = tuitionFee;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    public String toString(int i) {
        studentNumber = i;
        return "Student # "+ studentNumber+ ": " + name + "is taking up " + course + " with a tuition fee of " + tuitionFee;
    }
  }  
  
  class PartialScholar extends Student {
    private float discountRate;
  
    public PartialScholar(String name, String course, float tuitionFee, float discountRate) {
        super(name, course, tuitionFee);
        this.discountRate = discountRate;
    }

    public float getPayableAmount() {
        return getTuitionFee() * (1 - discountRate);
    }
    @Override
    public String toString(int i) { 
        return super.toString(i) + "\n Discount Rate of: " + (int)(discountRate * 100) + "%" + "\n Net Payable Tuition Fee is: " + getPayableAmount();
    }
  }
  



