package solutions.javabasics.chapter4;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 2/10/2016.
 */
public class Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        if(age >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        keyboard.close();
    }
}
