package skelet.javaintermediate.chapter10.exercise10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JonathanSyntra on 29/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        List<Person> personCollection = new ArrayList<>();

        personCollection.add(
                new Person("Gunter","aEenAchternaam", Person.Gender.MALE, 27, 80, 170));
        personCollection.add(
                new Person("Gunterina","cEenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Gunterina","gEenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Gunterina","gEenAndereAchternaam", Person.Gender.FEMALE, 23, 56, 160));
        personCollection.add(
                new Person("Steven","bNogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Steven","eNogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Stevenina","fNogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180));

        //Perform stream magic here

        List<Person> list = personCollection.stream()
                .filter(s -> Person.Gender.FEMALE.equals(s.getGender()))
                .filter(s -> s.getAge() > 20)
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        //Print out the newly acquired list
        list.forEach(System.out::println);

    }
}
