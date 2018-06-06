package solutions.javabasics.chapter7.exercise2;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter String:");
            array[i] = keyboard.nextLine();
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}
