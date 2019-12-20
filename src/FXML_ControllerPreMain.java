import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_ControllerPreMain implements Initializable {

    /**
     * setting up the button on PreMain screen
     * */

    public Button buttonPreMain;

    public void launchGame(){
        _SceneLoader.loadSceneMain();
    }

    /**
     * setting up the textfield in the lower right
     * */

    public TextArea versionNumber;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        versionNumber.setText(_GameInformation.getGameVersion());
        versionNumber.setEditable(false);
    }
}
