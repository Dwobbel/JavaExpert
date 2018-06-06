package solutions.javabasics.chapter5.ex16;

/**
 * Created by JonathanSyntra on 17/10/2016.
 */
public class Ex16_2_While {
    public static void main(String[] args) {
        int number = 0;
        /*while (number + 3 < 50){
            System.out.println(number += 3);
        }*/
        int result = 3;
        do {
            System.out.println(result);
            result += 3;
        } while(result < 50);
    }
}
