public class superExample extends Employeee {
    public String department;
    public superExample(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDetails() {
        return super.getDetails() + " " + department;
    }
    public static void main(String[] args) {
        superExample e = new superExample("John", 50000, "HR");
        System.out.println(e.getDetails());
    }
  
}
