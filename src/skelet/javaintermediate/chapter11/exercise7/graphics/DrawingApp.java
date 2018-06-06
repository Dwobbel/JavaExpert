package skelet.javaintermediate.chapter11.exercise7.graphics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {

    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javaintermediate/chapter11/exercise7/";
        final String FILE_EXTENSION = ".ser";
        final String FILENAME = "drawing";
        final String PATH = DIRECTORY_PATH + FILENAME + FILE_EXTENSION;

        createFileIfNeeded(PATH);

        Drawing drawing = new Drawing();

        for(int i = 0; i < 100; i++){
            try {
                drawing.addDrawable(new Circle(i));
            } catch (NegativeSizeException e) {
                e.printStackTrace();
            }
        }

        try {
            writeDrawingToFile(drawing, PATH);

            Drawing drawingFromFile = readDrawingFromFile(PATH);
            System.out.println(drawingFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void writeDrawingToFile(Drawing drawing, String path) throws IOException {
        /*write the drawing to the file */

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))){

            out.writeObject(drawing);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static Drawing readDrawingFromFile(String path) throws IOException, ClassNotFoundException {
        /*read the drawing from the file */
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))){

            Drawing tekening = (Drawing) in.readObject();
            return tekening;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
