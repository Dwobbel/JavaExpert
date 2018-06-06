package skelet.javaintermediate.chapter11.exercise4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileWriterApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise4/";
        final String FILE_NAME = "file.txt";

        final String PATH = DIRECTORY_PATH + FILE_NAME;

        createFileIfNeeded(PATH);
        Path path = Paths.get(PATH);

        try(BufferedWriter schrijver = Files.newBufferedWriter(path)){

            schrijver.write("Hello Diary,");
            schrijver.newLine();
            schrijver.write("today I learned about streams!");
            schrijver.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFileIfNeeded(final String PATH) {
        Path path = Paths.get(PATH);

        if(Files.notExists(path)) {
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
