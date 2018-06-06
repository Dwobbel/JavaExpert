package solutions.javaintermediate.chapter5.exercise1;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 12/02/2017.
 */
public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numerator = Integer.parseInt(keyboard.nextLine());
        int denominator = Integer.parseInt(keyboard.nextLine());
        int division = numerator / denominator;
        System.out.println(numerator + "/" + denominator + "=" +division);
    }
}
