package cleaningapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 * @@version 2.4.5
 */
public final class LogInScene extends Application {

    buttonsCreator buttons = new buttonsCreator();
    menuControls menu = new menuControls();
    textFields text = new textFields();

    @Override
    public void start(Stage logInStage) {
        BorderPane logInMainPane = new BorderPane();
        logInMainPane.setTop(menu.menuBar());
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
