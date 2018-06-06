package solutions.javaintermediate.chapter3.exercise4;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public interface BmiApplication {
     static void bmiCalculation() {
        System.out.println("Enter your length (cm):");
        int length = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(length, weight);
        BmiUtility.printDiagnose(bmi);
    }
}
