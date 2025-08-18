package java8tutorial;

import java.util.function.Function;

public class MethodReferenceForAMethodInAClass {
    public static void main(String[] args) {
        System.out.println("consider converting a string to lowercase");
        System.out.println("using normal function call: " + convertToLowerCase("HELLO WORLD"));
        System.out.println("now using lambda");
        Function<String, String> function = (s) -> s.toLowerCase();
        System.out.println(function.apply("HELLO WORLD"));
        System.out.println("using the method reference with lambda");
        Function<String, String> function2 = MethodReferenceForAMethodInAClass::convertToLowerCase;
        System.out.println(function2.apply("hello"));
        System.out.println("now using method referecne with class name");
        Function<String, String> function3 = String::toLowerCase;
        System.out.println(function3.apply("HELLO WORLD"));
    }

    static String convertToLowerCase(String s) {
        return s.toLowerCase();
    }
}

