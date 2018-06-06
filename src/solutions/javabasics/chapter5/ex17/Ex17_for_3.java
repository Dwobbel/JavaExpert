package solutions.javabasics.chapter5.ex17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class Ex17_for_3 {
    public static void main(String[] args) {
        for(int i = 11; i < 100000; i *= 11){
            System.out.println(i);
        }
    }
}
