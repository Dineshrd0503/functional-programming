import java.util.function.Predicate;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("usng preduacte interface in java functional programming");
        System.out.println("taking a number and checking if it is even or not");
        int number = 4;
        Predicate<Integer> isven= n -> n % 2 == 0; // Predicate to check if a number is even
        System.out.println(isven.test(number)? "The number " + number + " is even." : "The number " + number + " is odd.");
        Predicate<Integer> greaterthan10=n -> n > 10;
        System.out.println("now using toe predicactes at once");
        System.out.println("cgecking if number 12 is evena nd gretaer than 10 "+isven.and(greaterthan10).test(12));// Predicate to check if a number is greater than 10
        System.out.println("checking if number is greater than 10: " + greaterthan10.test(number));
    }
}
