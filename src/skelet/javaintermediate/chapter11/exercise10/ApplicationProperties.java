package skelet.javaintermediate.chapter11.exercise10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by JonathanSyntra on 19/04/2017.
 */
public class ApplicationProperties {
    private String fileName;
    private Properties props = new Properties();
    private final String X = "x";
    private final String Y = "y";
    private final String WIDTH = "width";
    private final String HEIGHT = "height";

    public ApplicationProperties(String fileName){
        this.fileName = fileName;
    }

    public int getX() {
        return Integer.parseInt(props.getProperty(X,"200"));
    }

    public void setX(int x) {
    props.setProperty(X, String.valueOf(x));
    }

    public int getY() {
        return Integer.parseInt(props.getProperty(Y, "200"));
    }

    public void setY(int y) {
        props.setProperty(Y, String.valueOf(y));
    }

    public int getWidth() {
        return Integer.parseInt(props.getProperty(WIDTH,"500"));
    }

    public void setWidth(int width) {
        props.setProperty(WIDTH, String.valueOf(width));

    }

    public int getHeight() {
        return Integer.parseInt(props.getProperty(HEIGHT, "500"));
    }

    public void setHeight(int height) {
        props.setProperty(HEIGHT, String.valueOf(height));
    }

    public void load() throws IOException {
        try (FileInputStream in = new FileInputStream(fileName)) {
            props.loadFromXML(in);
        }
    }

    public void store() throws IOException {
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            props.storeToXML(out, "meuh");
        }

    }
}