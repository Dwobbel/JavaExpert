package solutions.javaintermediate.chapter8.exercise1;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class Text {
    private String sentence;

    public Text(String sentence){
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter){
        for (String w : sentence.split(" ")) {
            if(filter.isValid(w)) {
                System.out.println(w);
            }
        }
    }
}
