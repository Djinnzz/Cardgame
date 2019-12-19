/**
 * Main class (testing purpose)
 * */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main extends Application{

    public static void main(String[] args) {

        /**
         * Pre game testing-area
         * */

        _Test.testSetList(new Set_BASE());

        /**
         * Launch the Frame
         * */

        Application.launch(args);

    }

    @Override
    public void start(Stage stage) {

        try {

            // Create the FXMLLoader
            FXMLLoader loader = new FXMLLoader();
            // Path to the FXML File
            String fxmlDocPath = "scenePreMain.fxml";
            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

            // Create the Pane and all Details
            AnchorPane root = loader.load(fxmlStream);

            // Create the Scene
            Scene scene = new Scene(root);
            // Set the Scene to the Stage
            stage.setScene(scene);
            // Set the Title to the Stage
            stage.setTitle(_GameInformation.getGameName());
            // Display the Stage
            stage.show();

        } catch (FileNotFoundException e) {
            Error_MessageFrame.printMessage(1,"scenePreMain.fxml does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            Error_MessageFrame.printMessage(2,"cant load scenePreMain.fxml");
            e.printStackTrace();
        }


    }

}
