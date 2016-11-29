package cleaningapp;

import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 *
 * @author Jesus Contains all the textfields and the textfields panes
 */
public class textFields {
    
    buttonsCreator buttons = new buttonsCreator();

    public Text README() {
        Text readme = new Text();
        readme.setText("Please select an option:"
                + "\nBackup files: backs up files with the supported extentions."
                + "\nClean using CCleaner: Runs CCleaner in auto mode."
                + "\nDelete old files: Deletes files with the supported extentions and older than 730 days."
                + "\nClean using Disk Cleaup: Uses Disk Cleanup to run the default Window's clean utility."
                + "\nDegragment disk: Defragments C: drive. Requires administrator rights and takes hours.");

        return readme;
    }

    public Text Title() {
        Text title = new Text("UTRGV Cleaning Tool");
        title.setId("titleBanner");
        return title;
    }

    StackPane bannerPane() {
        StackPane bannerPane = new StackPane();
        bannerPane.setAlignment(Pos.CENTER);
        bannerPane.getChildren().add(Title());

        return bannerPane;
    }

    BorderPane ui() {
        BorderPane UI = new BorderPane();
        BorderPane.setAlignment(UI,Pos.CENTER);
        UI.setTop(bannerPane());
        UI.setCenter(README());
        
        return UI;
    }
    BorderPane Loginui() {
        BorderPane loginUI = new BorderPane();
        loginUI.setTop(bannerPane());
        loginUI.setCenter(buttons.logInButtonPane());
        return loginUI;
    }
}
