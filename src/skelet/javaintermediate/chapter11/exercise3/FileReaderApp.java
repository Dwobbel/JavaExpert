package skelet.javaintermediate.chapter11.exercise3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise2/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        //Create the FileReader and read text from an existing file, don't forget to close the stream!
        try (FileReader file = new FileReader(PATH)) {
            int character;

            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
