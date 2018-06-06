package solutions.javaintermediate.chapter10.exercise4;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class TreeSetApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NavigableSet<String> words = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a word:");
            words.add(keyboard.next());
        }

        words.stream().forEach(System.out::println);

        System.out.println("First word:");
        System.out.println(words.first());
        System.out.println("Last word:");
        System.out.println(words.last());
    }
}
