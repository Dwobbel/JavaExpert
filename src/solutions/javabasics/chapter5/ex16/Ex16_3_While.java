package solutions.javabasics.chapter5.ex16;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class Ex16_3_While {
    public static void main(String[] args) {
        int number = 1;
        while(true){
            int product = number *= 5;
            if(!(product < 10000)){
                break;
            }
            System.out.println(product);
        }
    }
}
