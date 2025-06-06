
//You need to use lambda expression to print "Hello".
//You need to complete the function helperFunction that does not take any argument. This function expects an object of Hello as a return type. Hello is an interface that has the member function sayHello. Your helperFunction uses lambda expression to implement the sayHello within helperFunction itself. Then you return the object. The driver code will call the sayHello method using the returned object.
//
//Lambda Expression :- https://www.geeksforgeeks.org/lambda-expressions-java-8/
//
//Example:
//
//Input: No Input
//Output: Hello

public class Pratice1 {
    interface Hello {
        void sayHello();
    }
    public static Hello helperFunction() {
        // Your code here
        return ()-> System.out.println("Hello");

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
    }
    public static void main(String[] args) {
        System.out.println("Using lambda expression in Java functional programming");
        System.out.println("Creating a Hello object using a helper function");
        Hello hello = helperFunction();
        System.out.println("Calling the sayHello method on the Hello object");
        hello.sayHello();
    }
}

