
class Employeee {
  public String name;
  public double salary;

  public Employeee(String name, double salary) {
      this.name = name;
      this.salary = salary;
  }

  public String getDetails() {
      return name + " " + salary;
  }
}

class Manager extends Employeee {
  public String department;

  public Manager(String name, double salary, String department) {
      super(name, salary);
      this.department = department;
  }

  public String getDetails() {
      return super.getDetails() + " " + department;
  }
}

class Director extends Manager {
  public double carAllowance;

  public Director(String name, double salary, String department, double carAllowance) {
      super(name, salary, department);
      this.carAllowance = carAllowance;
  }

  public double increaseAllow() {
      return carAllowance + 1000;
  }
  
}