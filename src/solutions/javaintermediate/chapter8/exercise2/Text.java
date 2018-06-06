package solutions.javaintermediate.chapter8.exercise2;

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

    public void printProcessedWords(WordProcessor processor){
        for (String w : sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    public void printSum(NumberParser parser){
        double sum = 0;
        for (String w: sentence.split(" ")){
            double parsedDouble;
            try{
                 parsedDouble = parser.parse(w);
            } catch (NumberFormatException ex){
                parsedDouble = 0;
            }
            sum += parsedDouble;
        }
        System.out.println(sum);
    }
}
