package solutions.javaexperts.chapter1.exercise8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class DrawingApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(
                "Drawing.fxml"));
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Drawing");
        stage.setScene(scene);
        stage.show();
    }
}
