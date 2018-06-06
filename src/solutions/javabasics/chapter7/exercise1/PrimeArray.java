package solutions.javabasics.chapter7.exercise1;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class PrimeArray {
    public static void main(String[] args) {
        final int MAX = 1000;
        int[] primes = new int[MAX/2];
        int count = 0;
        for(int i = 2; i < MAX; i++){
            boolean isPrime = true;
            for(int j = 2;j < MAX && isPrime; j++){
                if(i != j && i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primes[count++] = i;
            }
        }

        for (int prime : primes) {
            if (prime == 0){
                break;
            }
            System.out.println(prime);
        }
    }
}
