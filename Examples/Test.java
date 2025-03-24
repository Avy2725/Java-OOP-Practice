// class Parent {
//     void display() {
//         System.out.println("Parent class");
//     }
// }

// class Child extends Parent {
//     void display() {
//         System.out.println("Child class");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent obj = new Child();
//         obj.display();
//     }
// }

// Output: Child class


// class Parent {
//     Parent() {
//         System.out.println("Parent constructor");
//     }
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child constructor");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Child c = new Child();
//     }
// }
// Output: Parent constructor
//         Child constructor

// class Parent {
//     static void print() {
//         System.out.println("Static method in Parent");
//     }
// }

// class Child extends Parent {

//     static void print() {
//         System.out.println("Static method in Child");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.print();
//     }
// }

// Output: Static method in Parent

// class Parent {
//     void display() {
//         System.out.println("Parent class");
//     }
// }

// class Child extends Parent {
//     void display() {
//         System.out.println("Child class");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent obj = new Child();
//         Parent obj2 = obj;
//         obj2.display();
//     }
// }

// Output: Child class

// class Parent {
//     void message() {
//         System.out.println("Hello from Parent");
//     }
// }

// class Child1 extends Parent {
//     void message() {
//         System.out.println("Hello from Child1");
//     }
// }

// class Child2 extends Parent {
//     void message() {
//         System.out.println("Hello from Child2");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent p;
//         p = new Child1();
//         p.message();
//         p = new Child2();
//         p.message();
//     }
// }

// Output: Hello from Child1
//         Hello from Child2

// class Parent {
//     void display() {
//         System.out.println("Parent method");
//     }
// }

// class Child extends Parent {
// }

// public class Test {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.display();
//     }
// }

// Output: Parent method

// class Parent {
//     int number = 10;
// }

// class Child extends Parent {
//     int number = 20;
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         System.out.println(p.number);
//     }
// }

// Output: 10

// class Parent {
//     void show() {
//         System.out.println("Parent's show method");
//     }
// }

// class Child extends Parent {
//     void show() {
//         super.show();
//         System.out.println("Child's show method");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.show();
//     }
// }

// Output: Parent's show method
//         Child's show method

