package solutions.javabasics.chapter7.exercise5;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Statistics {
    public static int average(int... values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total/values.length;
    }

    public static int min(int... values){
        int min = values[0];
        for (int value : values) {
            min = min < value ? min : value;
        }
        return min;
    }

    public static int max(int... values){
        int max = values[0];
        for (int value : values) {
            max = max > value ? max : value;
        }
        return max;
    }


}
