package skelet.javaintermediate.chapter10.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by JonathanSyntra on 29/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        //Don't forget to create the Map (the list is used to make adding to the map easier)
        SortedMap<String,Person> personSortedMap = new TreeMap<>();

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

        //Add all the persons from the list to the Map
        for (Person person : personCollection) {
            personSortedMap.put(person.getLastName(),person);
        }

        //Print the contents of the Map
        for(String p: personSortedMap.keySet()){
            System.out.println(personSortedMap.get(p));
        }

        //Get a person with a proper keyword
        String key = "cEenAndereAchternaam";
        System.out.println(personSortedMap.get(key));

        //Print first and last value
        System.out.println(personSortedMap.get(personSortedMap.firstKey()));
        System.out.println(personSortedMap.get(personSortedMap.lastKey()));

    }
}