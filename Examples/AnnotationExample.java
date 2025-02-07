import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation, Annotation is for Documentation, it does not affect the code. :)

// @Target specifies where this annotation can be applied (e.g., methods, fields, etc.)
@Target(ElementType.METHOD)
// @Retention specifies how long annotations with the annotated type are to be retained
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
  String value();
}

// Example class using the custom annotation
public class AnnotationExample {

  // Apply the custom annotation to a method
  @MyCustomAnnotation(value = "This is a custom annotation example")
  public void annotatedMethod() {
    System.out.println("This method is annotated with MyCustomAnnotation.");
  }

  public static void main(String[] args) {
    AnnotationExample example = new AnnotationExample();
    example.annotatedMethod();

    // Use reflection to read the annotation
    if (example.getClass().getMethods()[0].isAnnotationPresent(MyCustomAnnotation.class)) {
      MyCustomAnnotation annotation = example.getClass().getMethods()[0].getAnnotation(MyCustomAnnotation.class);
      System.out.println("Annotation value: " + annotation.value());
    }
  }
}