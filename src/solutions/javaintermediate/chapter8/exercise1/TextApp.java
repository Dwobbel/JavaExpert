package solutions.javaintermediate.chapter8.exercise1;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextApp {
    public static void main(String[] args) {
        Text text = new Text("Hello this is an example of a sentence containing words");

        System.out.println("*** Words containing 'e' ***");
        text.printFilteredWords(s -> s.contains("e"));

        System.out.println("*** Long words ***");
        text.printFilteredWords(s -> s.length() > 4);

        System.out.println("*** Words starting with 'a' ***");
        text.printFilteredWords(s -> s.startsWith("a"));

        System.out.println("*** Words with second letter 'e' ***");
        text.printFilteredWords(s -> s.length() > 1 && 'e' == s.charAt(1));

        System.out.println("*** Contains the letter 'e' twice ***");
        text.printFilteredWords(s -> {
            int eCount = 0;
            for (char c : s.toCharArray()) {
                if('e' == c) {
                    eCount++;
                }
            }
            return eCount == 2;
        });
    }
}