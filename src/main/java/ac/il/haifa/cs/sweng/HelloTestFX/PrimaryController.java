/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

package ac.il.haifa.cs.sweng.HelloTestFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML // fx:id="textField"
    private TextField textField; // Value injected by FXMLLoader

    @FXML
    void sayHello(ActionEvent event) {
        textField.setText("Hello World");
    }

}
