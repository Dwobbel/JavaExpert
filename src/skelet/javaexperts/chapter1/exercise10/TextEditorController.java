package skelet.javaexperts.chapter1.exercise10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 9/05/2017.
 */
public class TextEditorController {
    @FXML
    private Pane pane;

    @FXML
    private TextArea textArea;

    @FXML
    private Alert aboutAlert;

    @FXML
    private FileChooser filechooser;

    @FXML
    private Alert alert;

    @FXML
    private void initialize() {
    alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("OEIOEI");
    alert.setHeaderText("SUM TING WONG");
    }

    @FXML
    private void showAbout(ActionEvent ae) {
        aboutAlert.showAndWait();
    }

    @FXML
    private void exit(ActionEvent ev) {
        System.exit(0);
    }

    @FXML
    private void showFileChooser(ActionEvent ev) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Kies een file");
        File file = fileChooser.showOpenDialog(pane.getScene().getWindow());

        if(file != null){
            try(FileReader fr = new FileReader(file);
            BufferedReader lezer = new BufferedReader(fr)){
                String line;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @FXML
    private void Save(ActionEvent ev) {
        FileChooser filechooser = new FileChooser();
        File file = filechooser.showSaveDialog(pane.getScene().getWindow());

        try (BufferedWriter schrijver = Files.newBufferedWriter(file.toPath())) {
            schrijver.write(textArea.getText());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
