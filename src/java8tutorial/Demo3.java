package java8tutorial;
/*
using an return type for the lambda expression
 */
public class Demo3 {
    static interface calculate {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("Implementing functional programming in Java");
        System.out.println("Using a calulate interface with add method");
        calculate addition = (a, b) -> (a + b);
        print(addition,5, 10);
        print(addition, 20, 30);
    }

    private static void print(calculate calc, int a, int b) {
        System.out.println("Result: " + calc.add(a, b));
    }
}

