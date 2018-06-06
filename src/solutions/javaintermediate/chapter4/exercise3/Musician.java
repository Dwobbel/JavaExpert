package solutions.javaintermediate.chapter4.exercise3;

/**
 * Created by JonathanSyntra on 12/02/2017.
 */
public class Musician {
    public void play(){
        new Instrument(){
            @Override
            public void makeNoise() {
                System.out.println("Beep bop Beep bop");
            }
        }.makeNoise();
    }
}
