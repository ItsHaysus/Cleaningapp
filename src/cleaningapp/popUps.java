package cleaningapp;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 */
public class popUps {

    Stage primaryStage = null;

    void CCleanerSuccessful() {

        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        BorderPane dialogVbox = new BorderPane();
        Text popupText = new Text("CCleaner started sucessfully \nStarting Cleanup");
        popupText.setId("popuptext");
        dialogVbox.setCenter(popupText);
        dialogVbox.setId("popupbox");
        Scene dialogScene = new Scene(dialogVbox, 200, 100);
        dialog.setScene(dialogScene);
        dialog.setTitle("Success!");
        dialog.getIcons().add(new Image("file:icon.png"));
        dialog.centerOnScreen();
        dialog.show();
    }

    void notSupported() {

        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        BorderPane dialogVbox = new BorderPane();
        Text popupText = new Text("Feature coming soon!");
        popupText.setId("popuptext");
        dialogVbox.setCenter(popupText);
        dialogVbox.setId("popupbox");
        Scene dialogScene = new Scene(dialogVbox, 200, 100);
        dialog.setScene(dialogScene);
        dialog.setTitle("Not yet!");
        dialog.getIcons().add(new Image("file:icon.png"));
        dialog.centerOnScreen();
        dialog.show();
    }

    void About() {

        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        BorderPane dialogVbox = new BorderPane();
        GridPane about = new GridPane();

        Text popupText = new Text("Current version is 2.4.6");
        popupText.setId("popuptext");

        Hyperlink link = new Hyperlink();
        link.setText("Download the latest version here");
        link.setOnAction((ActionEvent e) -> {
            try {
                Desktop.getDesktop().browse(new URI("https://itshaysus.github.io/Cleaningapp/"));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
        );
        about.setAlignment(Pos.CENTER);

        about.add(popupText,
                0, 0);
        about.add(link,
                0, 1);

        dialogVbox.setCenter(about);

        dialogVbox.setId("popupbox");
        Scene dialogScene = new Scene(dialogVbox, 200, 100);

        dialog.setScene(dialogScene);

        dialog.setTitle("About");
        dialog.getIcons().add(new Image("file:icon.png"));
        dialog.centerOnScreen();

        dialog.show();
    }

}
