
public class poly {
  // Base class
  static class Animal {
    public void sound() {
      System.out.println("Animal makes a sound");
    }
  }

  // Derived class
  static class Dog extends Animal {
    @Override
    public void sound() {
      System.out.println("Dog barks");
    }
  }

  // Another derived class
  static class Cat extends Animal {
    @Override
    public void sound() {
      System.out.println("Cat meows");
    }
  }

  public static void main(String[] args) {
    // Polymorphism in action
    Animal myAnimal = new Animal(); // Animal reference and object
    Animal myDog = new Dog(); // Animal reference but Dog object
    Animal myCat = new Cat(); // Animal reference but Cat object

    myAnimal.sound(); // Outputs: Animal makes a sound
    myDog.sound(); // Outputs: Dog barks
    myCat.sound(); // Outputs: Cat meows
  }
}


