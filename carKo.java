public class carKo {

  // class var, shared by all objects
  public static int numberOfWheels = 4;
  // fields, properties and attributes that may deffer per class
  private String brand;
  private int CGear;
  private int speed;


  // constructor
  public carKo (String brand,int CGear, int speed) 
  {// this = assgigns it to the paramiter ex bathrooms to bathrooms
    this.brand = brand;
    this.CGear = CGear;
    this.speed = speed;
  }

  // in carKo the methods below are instance methods that can be used by objects within the class
  // global funcations/methods that can be used by any new Object, house1 & house2
  public void accelerate() {
    speed+=10;
    System.out.println("The car accelerates to " + speed + "km/h");
  }

  public void brake() {
    speed = 0;
    System.out.println("The car stopped");
  }

  public void reverse() {
    if (CGear == -1) {
      System.out.println("The Car is in reverse");
    } else {
      System.out.println("Switch to reverse gear");
    }
  }

  public String getBrand() {
    return brand;
  }
  public int getCGear() {
    return CGear;
  }
  public int getSeed() {
    return speed;
  }

  public static void main(String[] args) {
    //  objects are anything that is real
    //  classes are blue-prins of an object

    //  Data abstraction 
    //  Encapsulation
    //  Modularity
    //  Polymorphism, and inheritance

    carKo car1 = new carKo("Nissan", 1, 1);
    car1.accelerate();
    System.out.println("The brand of car1 is " + car1.getBrand());
    System.out.println("The CGear of car1 is " + car1.getCGear());
    System.out.println("The speed of car1 is " + car1.getSeed());
    car1.brake();
    System.out.println("The speed of car1 is " + car1.getSeed());

    System.out.println("Number of Wheels " + carKo.numberOfWheels);
  }
}

