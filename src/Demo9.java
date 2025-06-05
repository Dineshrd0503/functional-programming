import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {
    enum Gender{
        MALE,FEMALE,OTHER
    }
    static class Person {
        String name;
        Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender=gender;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', gender=" + gender+ '}';
        }
    }
    public static void main(String[] args) {
        System.out.println("using enum in java functional programming");
        System.out.println("creating a person class with nameand gender");
        List<Person> persons = List.of(
                new Person("Alice",Gender.FEMALE),
                new Person("Bob",Gender.MALE),
                new Person("snadhya",Gender.FEMALE));
        System.out.println("displaying the genfers using java stream");
        persons.stream()
                .map(p -> p.gender)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("displaying the length of each name");
        persons.stream().
                map( p -> p.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("dipalying name and length");
        persons.stream()
                .map(p -> p.name + " has length " + p.name.length())
                .forEach(System.out::println);


    }
}
