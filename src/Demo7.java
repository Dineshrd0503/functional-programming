import java.util.function.BiPredicate;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("using bi predicate in java functional programming");
        System.out.println("checking if two strings are equal or not");
        BiPredicate<String, String> areEqual = (s1, s2) -> s1.equals(s2);
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "world";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" equal? " + areEqual.test(str1, str2));
    }
}
