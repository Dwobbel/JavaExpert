package solutions.javaintermediate.chapter2.exercise3;

import java.time.DayOfWeek;
import java.time.Instant;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een dag in week (1-7):");
        int dayOfTheWeek = keyboard.nextInt();
        DayOfWeek inputtedDay = DayOfWeek.of(dayOfTheWeek);
        System.out.println("Hoeveel dagen wil je hierbij optellen?");
        int amountOfDaysToAdd = keyboard.nextInt();
        System.out.println(inputtedDay.plus(amountOfDaysToAdd));
    }
}
