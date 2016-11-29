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

    MenuBar menuBarLogIn() {
        final Menu helpMenu = new Menu("Menu");

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

    MenuBar menuBar() {
        final Menu helpMenu = new Menu("Menu");

        MenuItem about = new MenuItem("About");
        MenuItem help = new MenuItem("Help");
        MenuItem feedback = new MenuItem("Feedback");
        MenuItem logout = new MenuItem("logout");

        help.setOnAction((ActionEvent event) -> {
            method.Help();
        });
        feedback.setOnAction((ActionEvent event) -> {
            method.Feedback();
        });
        about.setOnAction((ActionEvent event) -> {
            method.about();
        });

        logout.setOnAction((ActionEvent event) -> {
            method.switchToLogin();
        });

        helpMenu.getItems().addAll(help, about, feedback,logout);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(helpMenu);
        return menuBar;
    }
}
