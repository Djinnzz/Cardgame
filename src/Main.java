/**
 * Main class (testing purpose)
 * */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main extends Application{

    public static void main(String[] args) {

        /**
         * Launch the Frame
         * */

        Application.launch(args);

    }

    @Override
    public void start(Stage stage) {

        _SceneLoader.loadScenePreMain(stage);


    }

}
