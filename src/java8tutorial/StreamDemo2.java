package java8tutorial;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        System.out.println("Stream Demo 2");
        Stream<Integer> arr = Stream.of(23,224,723,73,3,31);
        System.out.println("finding the min value using stream");
        System.out.println(arr.min(Comparator.comparing(Integer::valueOf)));
        BiFunction<Integer,Integer,Float> add=(a,b)->(float)a+b;
        System.out.println(add.apply(20,30));
        BiPredicate<String,String> compare=(s1,s2)-> s1.equals(s2);
        System.out.println(compare.test("hello","hu"));
        BiConsumer<Integer,Integer> print=(a,b)-> System.out.println("sum is "+(a+b));
        print.accept(20,30);
        
}
    }
