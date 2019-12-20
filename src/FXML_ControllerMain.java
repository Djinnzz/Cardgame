import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class for the Main menu
 * */

public class FXML_ControllerMain implements Initializable {

    /**
     * Content of the buttonlist on SceneMain
     * */

    @FXML
    Button buttonMainPlay;
    @FXML
    Button buttonMainCollection;
    @FXML
    Button buttonMainTestPlay;
    @FXML
    Button buttonMainSettings;
    @FXML
    Button buttonMainExit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void play(){


    }

    public void collection(){


    }

    public void testPlay(){


    }

    public void settings(){


    }

    public void exit(){

        System.exit(0);

    }
}
