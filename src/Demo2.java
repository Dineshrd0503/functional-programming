import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("using predicate to filter persons");
        Demo1.Person person=new Demo1.Person("Default",0);
        System.out.println("finding persons with age greater than 25");
        Predicate<Demo1.Person> isage= p -> p.age > 25;
        System.out.println("displaying persons with age greater than 25 in the list");
        List<Demo1.Person> persons = new ArrayList<>();
        persons.add(new Demo1.Person("Alice", 30));
        persons.add(new Demo1.Person("Bob", 25));
        persons.add(new Demo1.Person("Charlie", 35));
        persons.stream()
                .filter(isage)
                .forEach(System.out::println);
        function();
    }
    public static void function() {
        System.out.println("now implemet Fucntion in java fcntional programing");
        System.out.println("add 1 by 1");
        int a=1;
        Function<Integer,Integer> result=n->n+1;
        System.out.println("result of function is: " + result.apply(a));
    }
}
