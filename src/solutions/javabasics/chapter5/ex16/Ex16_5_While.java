package solutions.javabasics.chapter5.ex16;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class Ex16_5_While {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een getal tussen 0 en 10: ");
        int number = keyboard.nextInt();
        while (number < 0 || number > 10){
            System.out.println("Foutief getal! Geef een ander getal: ");
            number = keyboard.nextInt();
        }

        System.out.println("Jouw getal is " + number);
    }
}
