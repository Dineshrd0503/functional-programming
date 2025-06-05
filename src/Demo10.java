import javax.swing.text.html.Option;
import java.util.Optional;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("using optional in java functional programming");
        Object value=Optional.ofNullable(9)
                .orElseThrow(() ->new IllegalArgumentException("value cannot be null"));

        System.out.println(value);

        Optional.ofNullable("parkermj2002@gmail.com")
                .ifPresent(email -> System.out.println("Email is present: " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Email is present: " + email),
                        () -> System.out.println("Email is not present"));
    }
}
