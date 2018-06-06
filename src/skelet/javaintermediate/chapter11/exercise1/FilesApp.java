package skelet.javaintermediate.chapter11.exercise1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JonathanSyntra on 13/04/2017.
 */
public class FilesApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise1/";
        final String FILE1_NAME = "file.txt";
        final String FILE2_NAME = "file_copy.txt";
        final String FILE1_RENAME = "renamedFile.txt";
        final String PATH1 = DIRECTORY_PATH + FILE1_NAME;
        final String PATH2 = DIRECTORY_PATH + FILE2_NAME;
        final String PATH1_RENAME = DIRECTORY_PATH + FILE1_RENAME;

        //Define path
        try {
            Path path1 = Paths.get(PATH1);
            Path dirpath = Paths.get(DIRECTORY_PATH);
            //Create directory
            if (Files.notExists(dirpath)) {
                Files.createDirectories(path1.getParent());
                System.out.println("path aangemaakt");
            } else {
                System.out.println("Path bestond al");
            }
            //Create file if it not exists
            if (Files.notExists(path1)) {
                Files.createFile(path1);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            //Write lines of text to file
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("world");
            Files.write(path1, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            //Retrieve attributes of file
            DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);

            System.out.println("Size: " + attrs.size());
            System.out.println("Creation time: " + attrs.creationTime());
            System.out.println("Last access time: " + attrs.lastModifiedTime());
            System.out.println("Last modified time: " + attrs.lastModifiedTime());
            System.out.println("Archive: " + attrs.isArchive());
            System.out.println("Hidden: " + attrs.isHidden());
            System.out.println("Read only: " + attrs.isReadOnly());

            //Retrieve owner name

            System.out.println("Owner name: " + Files.getOwner(path1));

            //Read lines
            Files.lines(path1).forEach(System.out::println);

            //Copy file
            Path path2 = Paths.get(PATH2);
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);

            //Rename file
            Path prename = Paths.get(PATH1_RENAME);
            Files.move(path1, prename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
