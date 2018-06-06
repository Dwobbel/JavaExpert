package solutions.javaintermediate.chapter8.exercise1;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);
}
