import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClientsController {
    @FXML private TextField name;
    @FXML private TextField surname;
    @FXML private Label fullname;

    @FXML protected void get (ActionEvent event) {
        List<User> users = Database
    }
}
