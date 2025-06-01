import java.util.function.BiConsumer;

        public class Demo5 {
            public static void main(String[] args) {
                System.out.println("leanring about biconsumer in java functional programming");
                Demo4.Customer customer = new Demo4.Customer("dinesh", "1234567890");
                System.out.println("showing phno using BiConsumer interface");
                BiConsumer<Demo4.Customer, Boolean> showphno = (c, show) -> {
                    c.greetConsumer.accept(c);
                    System.out.println(show ? "Phone number: " + c.toString(): "Phone number: **********");
                };

                showphno.accept(customer, true);  // Shows phone number
                showphno.accept(customer, false); // Shows asterisks
            }
        }