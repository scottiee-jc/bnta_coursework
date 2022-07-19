package streams;

import imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Jeoff", MALE),
                new Person("Scott", MALE),
                new Person("Dan", NON_BINARY),
                new Person("Jess", FEMALE),
                new Person("Jesus", NON_BINARY),
                new Person("Maddie", FEMALE)
        );


        // abstraction mode
        // map function does transformations
        // consumer takes an argument and produces nothing
        // mapping the list to return the genders present in the list
        // map every object to their gender
        // collect to a set
        // print out each
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        // map every object to their name
        // map every name to the int length of their name
        // print out each
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        // this is what each line in the stream is doing
        // 1: .map(person -> person.name)
        Function<Person, String> personStringFunction =
                person -> person.name;
        // 2: .mapToInt(String::length)
        ToIntFunction<String> length = String::length;
        // 3: .forEach(System.out::println);
        IntConsumer println = x -> System.out.println(x);


        // using predicates

        Predicate<Person> personPredicate =
                person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);

        //allMatch will check if every list item meets the criteria
        //anyMatch will check if ANY list item meets the criteria
        //noneMatch will check that the list DOESN'T contain any object that meets the criteria

        System.out.println(containsOnlyFemales);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, NON_BINARY
    }
}
