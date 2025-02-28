// Superclass
class Animal {
  // Constructor of the superclass
  public Animal() {
    System.out.println("An animal is created.");
  }

  // Method in the superclass
  public void eat() {
    System.out.println("This animal eats food.");
  }
}

// Derived class
class Dog extends Animal {
  // Constructor of the derived class
  public Dog() {
    // Call the constructor of the superclass
    super();
    System.out.println("A dog is created.");
  }

  @Override
  public void eat() {
    System.out.println("The dog eats dog food.");
  }

  // Method in the derived class
  public void bark() {
    System.out.println("The dog barks.");
  }
}

// Another derived class
class Cat extends Animal {
  // Constructor of the derived class
  public Cat() {
    // Call the constructor of the superclass
    super();
    System.out.println("A cat is created.");
  }

  @Override
  public void eat() {
    System.out.println("The cat eats cat food.");
  }

  // Method in the derived class
  public void meow() {
    System.out.println("The cat meows.");
  }
}

// Chain inheritance example
class Puppy extends Dog {
  // Constructor of the derived class
  public Puppy() {
    // Call the constructor of the superclass
    super();
    System.out.println("A puppy is created.");
  }

  // Method in the derived class
  public void weep() {
    System.out.println("The puppy weeps.");
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
