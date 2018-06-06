package solutions.javaintermediate.chapter9.exercise4;

import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 13/03/2017.
 */
public class PersonAppShort {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Gunter", "EenAchternaam", Person.Gender.MALE, 27, 80, 170),
                new Person("Gunterina", "EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160),
                new Person("Steven", "NogEenAchternaam", Person.Gender.MALE, 35, 90, 175),
                new Person("Stevenina", "NogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180)
        };
        Stream<Person> personStream;
        System.out.println("Females:");
        personStream = Stream.of(persons);
        personStream.filter(p -> Person.Gender.FEMALE.equals(p.getGender()))
                .forEach(System.out::println);

        System.out.println("Older than 30:");
        personStream = Stream.of(persons);
        personStream.filter(p -> p.getAge() > 30)
                .forEach(System.out::println);

        System.out.println("Weight between 50 and 85:");
        personStream = Stream.of(persons);
        personStream.filter(p -> p.getWeight() > 50)
                .filter(p -> p.getWeight() < 85)
                .forEach(System.out::println);

        System.out.println("Older than 30 heavier than 80:");
        personStream = Stream.of(persons);
        personStream.filter(p -> p.getAge() > 30)
                .filter(p -> p.getWeight() > 80)
                .forEach(System.out::println);

        System.out.println("Ages:");
        personStream = Stream.of(persons);
        personStream.mapToInt(p -> p.getAge())
                .forEach(System.out::println);

        System.out.println("Names:");
        personStream = Stream.of(persons);
        personStream.map(p -> p.getFirstName() + " " + p.getLastName())
                .forEach(System.out::println);
    }
}
