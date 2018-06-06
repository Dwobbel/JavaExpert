package solutions.javabasics.chapter5;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class Ex13_CodeBlocks {
    static String hello = "wut?";
    public static void main(String[] args) {
            String hello = "Bye!";
        {
            System.out.println(hello);
        }
        newF();
    }

    public static void newF(){
        System.out.println(hello);
    }
}
