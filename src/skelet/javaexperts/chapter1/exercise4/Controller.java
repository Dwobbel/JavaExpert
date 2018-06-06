package skelet.javaexperts.chapter1.exercise4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;


/**
 * Created by JonathanSyntra on 22/04/2017.
 */
public class Controller {
    private int count = 0;
    @FXML
    private Label label;

    @FXML
    private void buttonPressed(ActionEvent ev) {
           if (count <9) {
               count++;
               label.setText("Zoveel keer moogt ge nog duwen: " + (10-count));
           } else {
               System.exit(0);
           }


    }

    @FXML
    private void reset(ActionEvent reset) {
        if (count > 0) {
            count = 0;
            label.setText("Zoveel keer moogt ge nog duwen: " + (10 - count));
        }
    }

}
