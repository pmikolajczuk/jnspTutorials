package pl.mikolaj.javafunctional.streams;

import pl.mikolaj.javafunctional.imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static pl.mikolaj.javafunctional.streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

//        people.stream()
//            .map(person -> person.name)
//            .mapToInt(String::length)
//            .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender));

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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
