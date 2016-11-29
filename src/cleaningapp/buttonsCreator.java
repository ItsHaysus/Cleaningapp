package cleaningapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Jesus Contains all the button creations and button panes
 */
public class buttonsCreator {

    Methods btnMeth = new Methods();

    Button backupfiles() {
        Button BakcupFiles = new Button("Backup Files");

        BakcupFiles.setOnAction((ActionEvent event) -> {
            btnMeth.backupFiles();
        });
        return BakcupFiles;
    }

    Button CleanOldFiles() {
        Button CleanOldFiles = new Button("Delete Old Files");
        CleanOldFiles.setOnAction((ActionEvent event) -> {
            btnMeth.cleanOldFiles();
        });

        return CleanOldFiles;
    }

    Button Cleanfileswithccleaner() {
        Button CleanOldfilesWithCCleaner = new Button("Clean Using CCleaner");
        CleanOldfilesWithCCleaner.setOnAction((ActionEvent event) -> {
            btnMeth.cleanWithCCleaner();
        });
        return CleanOldfilesWithCCleaner;
    }

    Button defragdisk() {
        Button DefragDisk = new Button("Defragment Disk");

        DefragDisk.setOnAction((ActionEvent event) -> {
            btnMeth.defragDisk();
        });
        return DefragDisk;
    }

    Button cleantempfiles() {
        Button CleanTempfiles = new Button("Clean Using Disk Cleanup");

        CleanTempfiles.setOnAction((ActionEvent event) -> {
            btnMeth.cleanTempFiles();
        });
        return CleanTempfiles;
    }

    GridPane buttonPane() {
        GridPane ButtonPane = new GridPane();
        ButtonPane.setHgap(10);
        ButtonPane.setVgap(10);
        ButtonPane.setAlignment(Pos.CENTER);
        ButtonPane.add(backupfiles(), 0, 0);
        ButtonPane.add(Cleanfileswithccleaner(), 1, 0);
        ButtonPane.add(CleanOldFiles(), 2, 0);
        ButtonPane.add(cleantempfiles(), 3, 0);
        ButtonPane.add(defragdisk(), 4, 0);
        return ButtonPane;

    }
}