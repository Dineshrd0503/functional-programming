package java8tutorial;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String s=null;
        System.out.println("handling null pointer exception");
        Optional<String> optional=Optional.ofNullable(s);
        Optional<Integer> opt=optional.map(String::length);
        System.out.println(opt);
        System.out.println("returving value using getmethod");
//        System.out.println(opt.get());
        System.out.println("using the isPresent method");
        System.out.println(opt.isPresent()? opt.get():"value not present");
        String ans=optional.orElseGet(() ->"value not present");
        System.out.println(ans);

        System.out.println("using orElseThorw");
        Optional<String> optional1= optional.orElseThrow(() -> new IllegalArgumentException("value not present")).describeConstable();
        System.out.println(optional1);
    }
}
