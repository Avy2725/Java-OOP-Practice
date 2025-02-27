// Base class
class Animal {
  // Method in the base class
  public void eat() {
    System.out.println("This animal eats food.");
  }
}

// Derived class
class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("The dog eats dog food.");
  }

  // Method in the derived class you can also add variables
  public void bark() {
    System.out.println("The dog barks.");
  }
}

// Another derived class
class Cat extends Animal {
  @Override
  public void eat() {
    System.out.println("The dog eats dog food.");
  }

  // Method in the derived class
  public void meow() {
    System.out.println("The cat meows.");
  }
}


public class inheritance {
  public static void main(String[] args) {
    // Creating an object of the Dog class
    Dog dog = new Dog();
    dog.eat(); // Calling the inherited method
    dog.bark(); // Calling the method of the Dog class

    // Creating an object of the Cat class
    Cat cat = new Cat();
    cat.eat(); // Calling the inherited method
    cat.meow(); // Calling the method of the Cat class
  }
}
