/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleaningapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 * @version 2.4.5
 */
public class Main extends Application {
    
    @Override
    public void start(Stage logInStage) {
        menuControls menu = new menuControls();
        textFields text = new textFields();

        BorderPane logInMainPane = new BorderPane();
        logInMainPane.setTop(menu.menuBarLogIn());
        logInMainPane.setCenter(text.Loginui());

        Scene logScene = new Scene(logInMainPane, 550, 250);
        String css = this.getClass().getResource("style.css").toExternalForm();
        logScene.getStylesheets().add(css);
        
        logInStage.getIcons().add(new Image("file:icon.png"));
        logInStage.setTitle("Computer Maintenance");
        logInStage.setScene(logScene);
        logInStage.show();
        logInStage.sizeToScene();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
