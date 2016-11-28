using CleaningAppCS;
using System;
using System.Diagnostics;
using System.IO;
using System.Windows;

namespace CleaningAppCSharp
{

    class Methods
    {

        public void Backupmethod()
        {
            try
            {
                string fileName = "backup.bat";
                string path = Path.Combine(Environment.CurrentDirectory, @"Batchfiles\", fileName);
                Process.Start(path);

            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("File not found");
            }

        }

        public void FeedbackMethod()
        {
            try
            {
                string command = "mailto:jesus.a.sanchez01@utrgv.edu?subject=Feedback";
                Process.Start(command);
            }
            catch (Exception)
            {
                MessageBox.Show("Error sendinf feedback");
            }
        }

        public void HelpMethod()
        {
              try
            {
                string fileName = "read.pdf";
                string path = Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                Process.Start(path);
            }
            catch (FileNotFoundException)
            {
                Console.WriteLine("Not found");
            }
            catch (IOException)
            {
                Console.WriteLine("IO");
            }
    catch (System.ComponentModel.Win32Exception)
    {
        MessageBox.Show("File not found");
    }
}

        public void AboutMethod()
        {
            System.Reflection.Assembly assembly = System.Reflection.Assembly.GetExecutingAssembly();
            FileVersionInfo fvi = FileVersionInfo.GetVersionInfo(assembly.Location);
            string version = fvi.FileVersion;
            MessageBoxResult messageBoxResult = MessageBox.Show("Current version: " + version + "\nDo you want to check for a new version?",
                "Version",
               MessageBoxButton.YesNo,
                MessageBoxImage.Asterisk);
            if (messageBoxResult.ToString() == "Yes")
            {
                Process.Start("https://itshaysus.github.io/CleaningappinCSharp/");
            }
        }

        public void DiskCleanerMethod()
        {
            try
            {
                string command = "/C Cleanmgr /sagerun:1";
                Process.Start("CMD.exe", command);
            }
            catch (System.ComponentModel.Win32Exception)
            {
                MessageBox.Show("File not found");
            }
        }

        public void CCleanerMethod()
        {
            try
            {
                string fileName = "ccleaner /auto";
                string path = Path.Combine(Environment.CurrentDirectory, @"Dependencies\", fileName);
                string command = "/C " + path;
                Process.Start("CMD.exe", command);
                MessageBox.Show("CCleaner has started cleaning\nIt will take a few minutes depending on the ammount of junk files on the computer");
            }
            catch (IOException)
            {
                MessageBox.Show("CCleaner does not exist");
            }
            catch (System.ComponentModel.Win32Exception)
            {
                MessageBox.Show("File not found");
            }
        }

        public void DefragMethod()
        {
            try
            {
                string fileName = "defrag.bat";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                Process.Start(path);
            }
            catch (IOException)
            {

            }
        }

        public void DeleteOldMethods()
        {
            try
            {
                string fileName = "Deleteoldfiles.bat";
                string path = Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                Process.Start(path);
            }
            catch (IOException)
            {
                Console.WriteLine("IO");
            }
            catch (System.ComponentModel.Win32Exception)
            {
                MessageBox.Show("File not found");
            }
        }

        public void LogoutMethod()
        {
            LogInWindow main = new LogInWindow();
            CirculationWindow win1 = new CirculationWindow();

            try
            {
                MessageBoxResult messageBoxResult = MessageBox.Show("Would you like to change profiles?",
                    "Log out",
                    MessageBoxButton.YesNo,
                    MessageBoxImage.Asterisk);
                if (messageBoxResult.ToString() == "Yes")
                {
                    main.Show();
                    win1.Close();
                }
            }
            catch (Exception)
            {
                MessageBox.Show("Problem Sigining out");
            }
        }

    }

}
