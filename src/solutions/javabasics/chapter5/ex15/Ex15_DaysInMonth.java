package solutions.javabasics.chapter5.ex15;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class Ex15_DaysInMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een maand?");
        int month = keyboard.nextInt();
        int days;
        switch(month){
            default: days = 0   ;break;
            case 2:  days = 28  ;break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30  ;break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 30;
        }

        if(days == 0){
            System.out.println("Dit is een onbekende maand!");
        } else {
            System.out.println("Er zitten " + days + " dagen in deze maand.");
        }
    }
}
