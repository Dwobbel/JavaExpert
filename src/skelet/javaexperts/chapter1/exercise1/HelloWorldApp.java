package skelet.javaexperts.chapter1.exercise1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by JonathanSyntra on 22/04/2017.
 */
public class HelloWorldApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label helloLabel = new Label("Hello world");
        helloLabel.setLayoutX(20);
        helloLabel.setLayoutY(20);
        Group root = new Group(helloLabel);
        Scene scene = new Scene(root, 300, 100);
        primaryStage.setTitle("Hello world");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
