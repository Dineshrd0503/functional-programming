package java8tutorial;

import java.util.function.Consumer;

public class ConsumerDemo {
    static class demo implements Consumer<Integer> {
        @Override
        public void accept(Integer integer) {
            System.out.println("The value is: " + integer);
        }
    }

    public static void main(String[] args) {
        System.out.println("using consumer wih class");
        demo value=new demo();
       value.accept(10);

        System.out.println("using consumer with lambda expression");
        Consumer<Integer> consumer = val -> System.out.println("The value is: " + val);
        consumer.accept(20);
    }
}
