package cleaningapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Jesus
 */
public class menuControls {

    Methods method = new Methods();

    MenuBar menuBar() {
        final Menu helpMenu = new Menu("Help");

        MenuItem about = new MenuItem("About");
        MenuItem help = new MenuItem("Help");
        MenuItem feedback = new MenuItem("Feedback");

        help.setOnAction((ActionEvent event) -> {
            method.Help();
        });
        feedback.setOnAction((ActionEvent event) -> {
            method.Feedback();
        });
        about.setOnAction((ActionEvent event) -> {
            method.about();
        });

        helpMenu.getItems().addAll(help, about, feedback);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(helpMenu);
        return menuBar;
    }
}
