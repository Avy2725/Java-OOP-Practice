public class houseKo {
  // fields, properties and attributes
  private int bedrooms;
  private int bathrooms;
  private String color;

  // constructor
  // constructor = is a method where you place all the initalization, if the properties of the created object
  public houseKo (int bedrooms, int bathrooms, String color) 
  {// this = assgigns it to the paramiter ex bathrooms to bathrooms
    this.bathrooms = bathrooms;
    this.bedrooms = bedrooms;
    this.color = color;
  }

  // global funcations/methods that can be used by any new Object, house1 & house2
  public void openDoor() {
    System.out.println("Door Is Open");
  }

  public void closeWindow() {
    System.out.println("Window Is Closed");
  }


  public int getBedrooms() {
    return bedrooms;
  }
  public int getBathroom() {
    return bathrooms;
  }
  public String getColor() {
    return color;
  }

  public static void main(String[] args) {
    //  objects are anything that is real
    //  classes are blue-prins of an object

    //  Data abstraction 
    //  Encapsulation
    //  Modularity
    //  Polymorphism, and inheritance

    houseKo house1 = new houseKo(3,2,"Blue");
    houseKo house2 = new houseKo(5,6,"Yellow");

    // uses getBedrooms function to access the new object val of bedrooms for house1
    System.out.println(house1.getBedrooms()); 

    System.out.println(house2.getBathroom());

    // running openDoor() function within house1 object
    house1.openDoor();
    house2.closeWindow();
  }
}

