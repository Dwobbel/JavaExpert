package solutions.javabasics.chapter5.ex17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class Ex17_for_5 {
    public static void main(String[] args) {
        for(int i = -10; i <= 10; i++){
            String result;
            if(i > 0){
                //System.out.println("+" + i);
                result = "+" + i;
            } else {
                //System.out.println(i);
                result = "" + i;
            }
            System.out.println(result);
        }
    }
}
