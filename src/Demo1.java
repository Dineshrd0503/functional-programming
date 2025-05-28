import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("implementing fucntional programming in java");
        System.out.println("using a person class");
        System.out.println("adding perosns ot alist of perons type");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));
        System.out.println("counting persons in the list using imperative programming");
        int count = 0;
        for (Person person : persons) {
            count++;
        }
        System.out.println("Count of persons: " + count);

        System.out.println("now using the functional programming style to count persons");
        long functionalCount = persons.stream().count();
        System.out.println("Count of persons using functional programming: " + functionalCount);
        System.out.println("displaying persons with age greater than 25 in the list");
        persons.stream().
                filter(person -> person.age>25)
                .forEach(System.out::println);
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }
}