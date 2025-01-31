public class carKo {
  // fields, properties and attributes
  private String brand;
  private int CGeer;
  private int speed;


  // constructor
  public carKo (String brand,int CGeer, int speed) 
  {// this = assgigns it to the paramiter ex bathrooms to bathrooms
    this.brand = brand;
    this.CGeer = CGeer;
    this.speed = speed;
  }

  // global funcations/methods that can be used by any new Object, house1 & house2
  public void accelerate() {
    speed+=10;
    System.out.println("The car accelerates to " + speed + "km/h");
  }

  public void brake() {
    speed = 0;
    System.out.println("the car stopped");
  }

  public static void main(String[] args) {
    //  objects are anything that is real
    //  classes are blue-prins of an object

    //  Data abstraction 
    //  Encapsulation
    //  Modularity
    //  Polymorphism, and inheritance


  }
}

