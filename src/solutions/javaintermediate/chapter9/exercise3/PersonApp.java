package solutions.javaintermediate.chapter9.exercise3;

import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {new Person("Gunter", Person.Gender.MALE), new Person("Gunterina", Person.Gender.FEMALE)};
        Person[] personsFromStream = Stream.of(persons).toArray(Person[]::new);
        for (Person person : personsFromStream) {
            System.out.println(person);
        }
    }
}
