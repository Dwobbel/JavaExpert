package skelet.javaintermediate.chapter11.exercise2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileWriterApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise2/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        createFileIfNeeded(PATH);

        //Create the FileWriter and write text to an existing file, don't forget to close the stream!
        try (FileWriter file = new FileWriter(PATH)) {
            file.write("Dit is een test");
            file.write(System.lineSeparator());
            file.append("toegevoegd");
            System.out.println("done");
        } catch (IOException ex) {
            System.out.println("oei, da was nie goed");
            System.out.println(ex.getMessage());
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
