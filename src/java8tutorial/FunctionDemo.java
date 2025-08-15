package java8tutorial;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    static class demo implements Function<String,Integer>{
        @Override
        public Integer apply(String s) {
            return s.length();
        }
    }
    public static void main(String[] args) {
        System.out.println("Implementing functional programming in Java");
        System.out.println("Using a Function interface with apply method");

        demo string= new demo();
        System.out.println(string.apply("Hello World!"));
        System.out.println("calling function interface with lambda expression");
        Function<String,Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello World!"));

        BiFunction<Integer,Integer,Integer> bifunction=(a,b)-> a+b;
        System.out.println("Using BiFunction to add two integers: " + bifunction.apply(5, 10));


    }
}
