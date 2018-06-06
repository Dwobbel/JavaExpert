package skelet.javaintermediate.chapter10.exercise4;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class TreeSetApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /** Check if correct collection is used **/
        Collection<String> words = new TreeSet<>();

        /** Ask for words **/
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a word:");
            words.add(keyboard.next());
        }

        /** print all the words **/


        /** print the first and the last word **/
        System.out.println("First word:");
        System.out.println(/** **/);
        System.out.println("Last word:");
        System.out.println(/** **/);
    }
}
