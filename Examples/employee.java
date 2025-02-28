

class  employee {
  public String  name  =  "";
  public double  salary;

  public employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
  }

  public String getDetails() {
      return name + " " + salary;
  }
}
