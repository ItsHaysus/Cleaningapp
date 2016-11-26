using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace CleaningAppCSharp
{
    /// <summary>
    /// Interaction logic for Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        public Window1()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                string fileName = "backup.bat";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Batchfiles\", fileName);
                Process.Start(path);

            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("Documents older than 90 days are not allowed.");
            }

        }

        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {
            string command = "mailto:jesus.a.sanchez01@utrgv.edu?subject=Feedback";
            Process.Start(command);
        }

        private void MenuItem_Click_3(object sender, RoutedEventArgs e)
        {
            try
            {
                string fileName = "read.pdf";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                Process.Start(path);
            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("Documents older than 90 days are not allowed.");
            }
            catch (IOException)
            {
                MessageBox.Show("Another user is already using this file.");
            }
        }

        private void MenuItem_Click_2(object sender, RoutedEventArgs e)
        {
            System.Reflection.Assembly assembly = System.Reflection.Assembly.GetExecutingAssembly();
            FileVersionInfo fvi = FileVersionInfo.GetVersionInfo(assembly.Location);
            string version = fvi.FileVersion;
            MessageBoxResult messageBoxResult = MessageBox.Show("Current version: " + version + "\nDo you want to check for a new version?", "Version", System.Windows.MessageBoxButton.YesNo, System.Windows.MessageBoxImage.Asterisk); if (messageBoxResult.ToString() == "Yes") { System.Diagnostics.Process.Start("https://itshaysus.github.io/Cleaningapp/"); }
        }

        private void button3_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                string command = "/C Cleanmgr /sagerun:1";
                Process.Start("CMD.exe", command);
            }
            catch (IOException)
            {
                MessageBox.Show("CCleaner does not exist");
            }
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                string fileName = "ccleaner /auto";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Dependencies\", fileName);
                string command = "/C " + path;
                Process.Start("CMD.exe", command);
                MessageBox.Show("CCleaner has started cleaning\nIt will take a few minutes depending on the ammount of junk files on the computer");
            }
            catch (IOException)
            {
                MessageBox.Show("CCleaner does not exist");
            }
        }

        private void button_Click(object sender, RoutedEventArgs e)
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

        private void button2_Click(object sender, RoutedEventArgs e)
        {
            
                 try
            {
                string fileName = "Deleteoldfiles.bat";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                Process.Start(path);
            }
            catch (IOException)
            {

            }

        }
    }
}
