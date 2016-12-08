/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.beans.value.ObservableValue;

/**
 *
 * @author Jesus
 * @version 2.0.0
 */
public class Controller {

    View view;
    Methods methods = new Methods();
    popUps pops = new popUps();

    public Controller(View view) {
        this.view = view;
        setMethods();
    }

    void setMethods() {
        view.logInOptions.getSelectionModel().selectedItemProperty().addListener((ObservableValue ov, Object t, Object t1) -> {
            view.Login.setOnAction((event) -> {
                switch (t1.toString()) {
                    case "Circulation":
                        view.updateToCirculation();
                        break;
                    case "Staff":
                        pops.notSupported();
                        break;
                }
            });
        });
        view.BakcupFiles.setOnAction((event)->
        {
            methods.backupFiles();
        });
        view.CleanOldFiles.setOnAction((event)->
        {
            methods.cleanOldFiles();
        });
        view.CleanOldfilesWithCCleaner.setOnAction((event)->
        {
            methods.cleanWithCCleaner();
        });
        view.CleanTempfiles.setOnAction((event)->
        {
            methods.cleanTempFiles();
        });
        view.DefragDisk.setOnAction((event)->
        {
            methods.defragDisk();
        });
        view.about.setOnAction((event)->
        {
            methods.about();
        });
        view.feedback.setOnAction((event)->
        {
            methods.Feedback();
        });
        view.help.setOnAction((event)->
        {
            methods.Help();
        });
    }

}
