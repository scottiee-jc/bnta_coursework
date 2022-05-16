package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", FEMALE)
        );

        //Imperative approach
        // defining every detail
        // females is an empty list
        List<Person> females = new ArrayList<>();

        //loop through 'people'
        // when the condition finds a person of gender female, this person is added to the list 'females'
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        // declarative approach
        // stream allows us to go into an abstract mode where we can tell it what we want
        // from the people list -> into an abstract mode of stream()
        // filtering action takes 'person' through the if statement to see if it equals a female
        // collect to a list (optional) .collect(Collectors.toList())
        // more concise ...
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

    }

    static class Person {

        private final String name;
        final Gender gender;

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
        MALE, FEMALE
    }

}
