package cleaningapp2.pkg0;

import MVC.Controller;
import MVC.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 */
public class CleaningApp20 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        View root = new View();
        Controller controller = new Controller(root);
        
        Scene logScene = new Scene(root, 700, 400);
        String css = this.getClass().getResource("style.css").toExternalForm();
        logScene.getStylesheets().add(css);
        
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.setTitle("Computer Maintenance");
        primaryStage.setScene(logScene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
