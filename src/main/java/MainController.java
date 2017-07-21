import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable{
    @FXML private BorderPane content;

    private Map<String,Parent> views = new HashMap<>();

    private void loadView(String name, String file) throws IOException{
        views.put(name,FXMLLoader.load(getClass().getClassLoader().getResource(file)));
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            loadView("");
        }
    }
}
