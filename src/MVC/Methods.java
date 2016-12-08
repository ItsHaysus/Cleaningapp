package MVC;

import java.awt.Desktop;
import static java.awt.Desktop.getDesktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 */
public class Methods {

    String filePath = new File("").getAbsolutePath();
    Stage logInStage = new Stage();
    Stage CirculationStage = new Stage();
    popUps pops = new popUps();
    View view = new View();

    void backupFiles() {
        String Backupcommand = "cmd /c start " + filePath.concat("\\Batchfiles\\backup.bat");
        try {
            Runtime.getRuntime().exec(Backupcommand);
        } catch (IOException ex) {
        }
    }

    void cleanOldFiles() {
        String cleanCommand = "cmd /c start " + filePath.concat("\\Batchfiles\\Deleteoldfiles.bat");
        try {
            Runtime.getRuntime().exec(cleanCommand);
        } catch (IOException ex) {
        }
    }

    void cleanWithCCleaner() {
        try {
            String CCleanerCommand = "cmd /c start " + filePath.concat("\\Dependencies\\ccleaner /auto");
            Process child = Runtime.getRuntime().exec(CCleanerCommand);
            pops.CCleanerSuccessful();
        } catch (IOException e) {

        }
    }

    void defragDisk() {
        try {
            String defragDisk = "cmd /c start " + filePath.concat("\\Batchfiles\\defrag.bat");
            // Execute command
            Process child = Runtime.getRuntime().exec(defragDisk);
            System.out.println(defragDisk);
        } catch (IOException e) {

        }
    }

    void cleanTempFiles() {
        try {
            String cleamTemp = "cmd /c start Cleanmgr /sagerun:1";
            Process child = Runtime.getRuntime().exec(cleamTemp);
        } catch (IOException e) {
        }
    }

    void Help() {
        try {
            String findHelp = filePath.concat("\\Webcontent\\read.pdf");
            File file = new File(findHelp);
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    pops.notSupported();
                }
            }

        } catch (IOException ex) {
        }
    }

    void Feedback() {
        Desktop desktop = getDesktop();
        String feedback = "mailto:jesus.a.sanchez01@utrgv.edu?cc=ezequiel.melgoza@utrgv.edu&subject=Feedback";
        URI uri = URI.create(feedback);
        try {
            desktop.mail(uri);
        } catch (IOException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void changeToCirculation() {
        view.updateToCirculation();
    }

    void changeToStaff() {
        pops.notSupported();
    }

    void about() {
        pops.About();
    }

}
