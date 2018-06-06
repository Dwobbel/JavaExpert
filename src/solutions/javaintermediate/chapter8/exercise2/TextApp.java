package solutions.javaintermediate.chapter8.exercise2;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextApp {
    public static void main(String[] args) {
        Text text = new Text("Hello this is an example of a sentence containing 10 words 1 2 5");

        System.out.println("*** Reversed words ***");
        text.printProcessedWords(TextUtil::reverse);

        System.out.println("*** Scrambled words ***");
        TextScramble textScramble = new TextScramble();
        text.printProcessedWords(textScramble::scramble);

        System.out.println("*** Lower case words ***");
        text.printProcessedWords(String::toLowerCase);

        System.out.println("*** Count numbers ***");
        text.printSum(Double::new);
    }
}