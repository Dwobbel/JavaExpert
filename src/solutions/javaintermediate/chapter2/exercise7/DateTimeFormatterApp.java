package solutions.javaintermediate.chapter2.exercise7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 5/02/2017.
 */
public class DateTimeFormatterApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Geef een datum in (DD/MM/YYYY):");
        String inputDate = keyboard.next();

        LocalDate formattedDate = LocalDate.parse(inputDate, myFormatter);
        System.out.format("%1$tY-%1$tm-%1$td",formattedDate);
    }
}
