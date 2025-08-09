package java8tutorial;

public class Demo1 {
    static interface shape{
        void draw();

    }
    public static void main(String[] args) {
        System.out.println("implementing functional programming in java");
        System.out.println("using a shape interface with draw method");
       shape rectangle =() -> System.out.println("Drawing a rectangle");
       rectangle.draw();
       shape circle = () -> System.out.println("Drawing a circle");
         circle.draw();
         shape triangle = () -> System.out.println("Drawing a triangle");
            triangle.draw();
    }
}
