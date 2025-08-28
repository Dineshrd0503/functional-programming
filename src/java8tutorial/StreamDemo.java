package java8tutorial;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "JavaScript", "C++", "Ruby");
        stream.forEach(System.out::println);
        Collection<String> c1 = Arrays.asList("java", "py", "ruby");
        Stream<String> stream1 = c1.stream();
        stream1.forEach(System.out::println);
        System.out.println("filtring products with price gratr than 20000");
        List<Integer> products = Arrays.asList(10000, 20000, 30000, 40000, 50000);
        List<Integer> output = products.stream().filter(p -> p > 20000).collect(Collectors.toList());
        output.forEach(System.out::println);

        System.out.println("soerting an strings in natural order");
        c1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("sorting strings in reverse order");
        c1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("prting in incerasing order by secnod letter of string");
        c1.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(1))) // Just add .reversed() here
                .forEach(System.out::println);
    }
}
