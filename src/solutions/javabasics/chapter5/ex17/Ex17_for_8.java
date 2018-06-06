package solutions.javabasics.chapter5.ex17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class Ex17_for_8 {
    public static void main(String[] args) {
        final int MAX = 1000;
        int count = 0;
        for(int i = 2; i < MAX; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("I have found " + count + " primes");
    }
}
