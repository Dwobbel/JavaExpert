package solutions.javabasics.chapter5;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class Ex12_PriorityApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = ++a * b-- + b < 2 ? --a : ++b;
        System.out.println("Result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /**
         * 1st: ++a             =>  a = 2   b = 2
         * 2nd: *               =>  a = 1   b = 2
         * 3rd: b--             =>  a = 1   b = 2
         * 4th: +               =>  a = 1   b = 2
         * 5th: < ? :
         */
        /*System.out.println("a= " + ++a + " en a= " + a++ + " en a= " + a);*/
        /*System.out.println(++a + a++ + a);*/
    }
}
