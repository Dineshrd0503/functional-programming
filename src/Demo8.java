import java.util.function.Supplier;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println("using suuplier in java functional programming");
        System.out.println("supplier has no iput but returns avalue");
        Supplier<String> greet= () -> "Hello, World!";
        System.out.println("greeting message: " + greet.get());
    }
}
