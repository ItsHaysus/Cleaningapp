package cleaningapp;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Jesus
 *
 */
public class LogInScene {

    public Scene LoginScene() {
        menuControls menu = new menuControls();
        textFields text = new textFields();

        BorderPane logInMainPane = new BorderPane();
        logInMainPane.setTop(menu.menuBarLogIn());
        logInMainPane.setCenter(text.Loginui());

        Scene logScene = new Scene(logInMainPane, 550, 250);
        String css = this.getClass().getResource("style.css").toExternalForm();
        logScene.getStylesheets().add(css);

        return logScene;
    }
}
