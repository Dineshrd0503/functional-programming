package java8tutorial;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    static class demo implements Supplier<LocalDateTime>{
        @Override
        public LocalDateTime get() {
            return LocalDateTime.now();
        }
    }
    public static void main(String[] args) {
        System.out.println("Implementing functional programming in Java");
        System.out.println("Using a Supplier interface with get method");

        demo dateTimeSupplier = new demo();
        System.out.println(dateTimeSupplier.get());

        System.out.println("Calling Supplier interface with lambda expression");
        Supplier<LocalDateTime> supplier= ()-> LocalDateTime.now();
        System.out.println(supplier.get());


    }
}
