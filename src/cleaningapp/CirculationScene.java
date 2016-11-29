package cleaningapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 *
 */
public class CirculationScene extends Application{

    @Override
    public void start(Stage primaryStage) {
        BorderPane circulationPane = new BorderPane();
        textFields textfield = new textFields();
        buttonsCreator btnCreator = new buttonsCreator();
        menuControls menu = new menuControls();

        circulationPane.setTop(menu.menuBar());
        circulationPane.setCenter(textfield.ui());
        circulationPane.setBottom(btnCreator.buttonPane());

        Scene circulationScene = new Scene(circulationPane, 700, 400);
        String css = this.getClass().getResource("style.css").toExternalForm();
        circulationScene.getStylesheets().add(css);
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.setTitle("Computer Maintenance");
        primaryStage.setScene(circulationScene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
