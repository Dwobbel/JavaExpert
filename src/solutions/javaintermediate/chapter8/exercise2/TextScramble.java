package solutions.javaintermediate.chapter8.exercise2;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextScramble {
    public String scramble(String w){
        w = w.replace('a','@');
        w = w.replace('e','€');
        w = w.replace('l','1');
        w = w.replace('o','0');
        return w;
    }
}
