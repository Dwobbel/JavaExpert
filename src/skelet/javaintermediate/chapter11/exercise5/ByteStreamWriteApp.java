package skelet.javaintermediate.chapter11.exercise5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class ByteStreamWriteApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise5/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        createFileIfNeeded(PATH);

        //Write encrypted text to a file. Hint: use the following classes in the correct sequence (PrintStream FileOutputStream DeflaterOutputStream)
        try(PrintStream printStream = new PrintStream(new DeflaterOutputStream(new FileOutputStream(PATH)))) {
        printStream.write("Hello dinge".getBytes());
        }
        catch (IOException e) {
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
