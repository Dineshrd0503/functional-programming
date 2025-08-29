package java8tutorial;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        System.out.println("Stream Demo 2");
        Stream<Integer> arr = Stream.of(23,224,723,73,3,31);
        System.out.println("finding the min value using stream");
        System.out.println(arr.min(Comparator.comparing(Integer::valueOf)));

}
    }
