public class convert {

  public static void main(String[] args) {
    // Autoboxing: converting primitive type to reference type
    int primitiveInt = 5;
    Integer referenceInt = primitiveInt; // Autoboxing

    System.out.println("Primitive int: " + primitiveInt);
    System.out.println("Reference Integer: " + referenceInt);

    // Unboxing: converting reference type to primitive type
    Integer anotherReferenceInt = new Integer(10);
    int anotherPrimitiveInt = anotherReferenceInt; // Unboxing

    System.out.println("Another Reference Integer: " + anotherReferenceInt);
    System.out.println("Another Primitive int: " + anotherPrimitiveInt);
  }
}
