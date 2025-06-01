import java.util.function.Consumer;

public class Demo4 {
    static class Customer{
        private final String name;
        private final String phno;

        public Customer(String name, String phno) {
            this.name = name;
            this.phno = phno;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "phno='" + phno + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        void greet(Customer customer) {
            System.out.println("Hello,"+customer.name+" welcome to the customer service!");
        }
        Consumer<Customer> greetConsumer = this::greet; // Method reference to the greet method
    }
    public static void main(String[] args) {
        System.out.println("using method reference in java functional programming");
        System.out.println("creating a customer object");
        Customer customer = new Customer("dinesh", "1234567890");
        System.out.println("gerring coustomer using greet method");
        // Using method reference to call the greet method
        customer.greet(customer);
        System.out.println("now using the Consumer interface to greet the customer");
        System.out.println("using the greetConsumer to greet the customer");
        customer.greetConsumer.accept(customer);


    }
}
