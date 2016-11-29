package cleaningapp;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Jesus
 * 
 */
public class CirculationScene {

    public Scene circulationScene() {
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
        
        return circulationScene;
    }
}