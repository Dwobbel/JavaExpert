package solutions.javaintermediate.chapter1.exercise1;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DayApp {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println("Name: " + day.name() + " Ordinal: " + day.ordinal() + " Weekday: " + day.isWeekday());
        }
    }
}
