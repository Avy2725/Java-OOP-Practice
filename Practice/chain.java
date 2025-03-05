public class chain {

  class A {
        A() {
            System.out.println("a");
        }
  }

  class B extends A {
        B() {
            System.out.println("b");
        }
  }

  class C extends B {
        C() {
            System.out.println("c");
        }
  }

  public static void main(String[] args) {
        chain C = new chain();
        C c = C.new C();
  }
}
