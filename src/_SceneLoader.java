/**
 * Manages the GUI and switches between different scenes
 * */

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class _SceneLoader {

    static Stage mainStage;

    /**
     * scene @ the start of the game
     * */

    public static void loadScenePreMain(Stage stage){

        try {

            mainStage = stage;

            // Create the FXMLLoader
            FXMLLoader loader = new FXMLLoader();
            // Path to the FXML File
            String fxmlDocPath = "scenePreMain.fxml";
            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);


            // Create the Pane and all Details
            AnchorPane root = loader.load(fxmlStream);
            // Create the Scene
            Scene scenePreMain = new Scene(root);


            // Set the Scene to the Stage
            mainStage.setScene(scenePreMain);
            // Set the Title to the Stage
            mainStage.setTitle(_GameInformation.getGameName());
            // Display the Stage
            mainStage.show();

        } catch (FileNotFoundException e) {
            _Error_MessageFrame.printMessage(1,"scenePreMain.fxml does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            _Error_MessageFrame.printMessage(2,"cant load scenePreMain.fxml");
            e.printStackTrace();
        }
    }

    /**
     * Main menu scene
     * */

    public static void loadSceneMain(){

        try {

            // Create the FXMLLoader
            FXMLLoader loader = new FXMLLoader();
            // Path to the FXML File
            String fxmlDocPath = "sceneMain.fxml";
            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);


            // Create the Pane and all Details
            AnchorPane root = loader.load(fxmlStream);
            // Create the Scene
            Scene sceneMain = new Scene(root);


            // Set the Scene to the Stage
            mainStage.setScene(sceneMain);
            // Set the Title to the Stage
            mainStage.setTitle(_GameInformation.getGameName());
            // Display the Stage
            mainStage.show();

        } catch (FileNotFoundException e) {
            _Error_MessageFrame.printMessage(1,"scenePreMain.fxml does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            _Error_MessageFrame.printMessage(2,"cant load scenePreMain.fxml");
            e.printStackTrace();
        }

    }

}
