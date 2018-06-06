package skelet.javaintermediate.chapter11.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise2/";
        final String FILE_NAME = "file.txt";
        Path path = Paths.get(DIRECTORY_PATH + FILE_NAME);

        try(BufferedReader reader = Files.newBufferedReader(path)){
            String lijn = null;
            while ((lijn = reader.readLine()) != null) {
                System.out.println(lijn);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
