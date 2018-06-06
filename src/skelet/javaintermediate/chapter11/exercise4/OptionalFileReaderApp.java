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
public class OptionalFileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise4/";
        final String FILE_NAME = "file.txt";

        try(FileReader fileReader = new FileReader(DIRECTORY_PATH + FILE_NAME)){
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
