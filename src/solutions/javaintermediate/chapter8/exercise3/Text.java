package solutions.javaintermediate.chapter8.exercise3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class Text {
    private String sentence;
    private Consumer<String> consumer;

    public Text(String sentence){
        this(sentence, System.out::println);
    }

    public Text(String sentence, Consumer<String> consumer){
        this.sentence = sentence;
        this.consumer = consumer;
    }



    public void printFilteredWords(Predicate<String> filter){
        for (String w : sentence.split(" ")) {
            if(filter.test(w)) {
                consumer.accept(w);
            }
        }
    }

    public void printProcessedWords(Function<String,String> processor){
        for (String w : sentence.split(" ")) {
            consumer.accept(processor.apply(w));
        }
    }

    public void printSum(Function<String,Double> parser){
        double sum = 0;
        for (String w: sentence.split(" ")){
            double parsedDouble;
            try{
                 parsedDouble = parser.apply(w);
            } catch (NumberFormatException ex){
                parsedDouble = 0;
            }
            sum += parsedDouble;
        }
        consumer.accept("" + sum);
    }
}
