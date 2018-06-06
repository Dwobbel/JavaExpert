package solutions.javaintermediate.chapter10.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class WordApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a full sentence: ");
        String sentence = keyboard.nextLine();

        List<String> stringList = new ArrayList<>();
        String[] split = sentence.split(" ");
        for (String s : split) {
            stringList.add(s);
        }

        //List<String> strings = Arrays.asList(split);

        for (int i = stringList.size()-1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }

        System.out.println("Aantal woorden: " + stringList.size());
        String[] words = stringList.toArray(new String[stringList.size()]);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
