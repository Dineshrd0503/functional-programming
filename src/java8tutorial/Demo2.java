package java8tutorial;
/*
passing the lambda expression as an argument to a method
 */
public class Demo2 {
    static interface Shape {
        void draw();
    }

    public static void main(String[] args) {
        System.out.println("Implementing functional programming in Java");
        System.out.println("Using a Shape interface with draw method");

        Shape rectangle = () -> System.out.println("Drawing a rectangle");
//        rectangle.draw();

        Shape circle = () -> System.out.println("Drawing a circle");
//        circle.draw();

        Shape triangle = () -> System.out.println("Drawing a triangle");
//        triangle.draw();
        print(rectangle);
        print(circle);
        print(triangle);
    }
    private static void print(Shape shape){
        shape.draw();


    }
}
