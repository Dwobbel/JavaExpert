package solutions.javaintermediate.chapter8.exercise3;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextApp {
    public static void main(String[] args) {
        Text text = new Text("Hello this is an example of a sentence containing words");

        System.out.println("*** Word contains 'a' and 'e' ***");
        Predicate<String> predicate1 = s -> s.contains("a");
        Predicate<String> predicate2 = s -> s.contains("e");
        Predicate<String> predicate3 = predicate1.and(predicate2);

        text.printFilteredWords(predicate3);

        System.out.println("*** Word uppercase reversed ***");
        Function<String,String> function1 = String::toUpperCase;
        Function<String,String> function2 = TextUtil::reverse;
        Function<String,String> function3 = function1.andThen(function2);

        text.printProcessedWords(function3);
    }
}