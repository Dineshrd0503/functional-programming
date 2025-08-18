package java8tutorial;

import java.util.function.BiFunction;

public class MethodReferencesForStaticMethod {
    public static void main(String[] args) {
        System.out.println("using noralfucntion call to addition method: " + addition(10, 20));
        System.out.println("now using lambda");
        BiFunction<Integer,Integer,Integer> biFunction = (a, b) -> addition(a, b);
        System.out.println(biFunction.apply(10, 20));
        System.out.println("noe using method reference with lambda");
        BiFunction<Integer, Integer, Integer> biFunction2 = MethodReferencesForStaticMethod::addition;
        System.out.println(biFunction2.apply(20, 20));
    }
    static int addition(int a, int b) {
        return a + b;
    }
}
