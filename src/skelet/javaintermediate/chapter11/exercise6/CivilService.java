package skelet.javaintermediate.chapter11.exercise6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import static skelet.javaintermediate.chapter11.exercise6.Maternity.PATH;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class CivilService {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH))){

         Person persoon = (Person) in.readObject();
            System.out.println(persoon.getFirstname() + " " + persoon.getLastname());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
