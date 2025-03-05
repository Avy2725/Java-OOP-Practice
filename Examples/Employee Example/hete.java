// Creating a Heterogeneous Array in Java
// A heterogeneous array can store elements of different types using Object class
public class hete {
  public static void main(String[] args) {
    // Creating an array of Object type
    Employeee heterogeneousArray[] = new Employeee[5];
    
    // Storing different types of elements in the array
    heterogeneousArray[0] = new Employeee("John", 50000);
    heterogeneousArray[1] = new Employeee("Anne", 60000);
    heterogeneousArray[2] = new Manager("David", 75000, "HR");
    heterogeneousArray[3] = new Manager("Sophia", 80000, "Finance");
    heterogeneousArray[4] = new Director("Michael", 100000, "Marketing", 5000);



    // Iterating through the array and printing the elements
    for (int i = 0; i < heterogeneousArray.length; i++) {
      System.out.println(heterogeneousArray[i].getDetails());
    }
  }
}
