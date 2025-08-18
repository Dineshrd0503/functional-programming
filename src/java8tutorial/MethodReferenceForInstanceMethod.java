package java8tutorial;

public class MethodReferenceForInstanceMethod {
    static interface wish{
        String greet(String s);
    }
    public static void main(String[] args) {
        MethodReferenceForInstanceMethod instance = new MethodReferenceForInstanceMethod();
        System.out.println("Using normal function call to display method: " + instance.display("World"));
        System.out.println("Now using lambda");
        wish w = (s) -> "Hello " + s;
        w.greet("World");
        System.out.println("Now using method reference with lambda");
        wish w2 = instance::display;
        System.out.println(w2.greet("World"));




    }
    public String display(String s) {
        return "Hello " + s;
    }
}
