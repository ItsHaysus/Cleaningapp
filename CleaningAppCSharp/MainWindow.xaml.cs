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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CleaningAppCSharp
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {
            string command = "mailto:jesus.a.sanchez01@utrgv.edu?subject=Feedback";
            Process.Start(command);
        }

        private void MenuItem_Click_2(object sender, RoutedEventArgs e)
        {
            System.Reflection.Assembly assembly = System.Reflection.Assembly.GetExecutingAssembly();
            FileVersionInfo fvi = FileVersionInfo.GetVersionInfo(assembly.Location);
            string version = fvi.FileVersion;
            System.Windows.MessageBoxResult messageBoxResult = System.Windows.MessageBox.Show("Current version: " + version + "\nDo you want to check for a new version?", "Version", System.Windows.MessageBoxButton.YesNo, System.Windows.MessageBoxImage.Asterisk); if (messageBoxResult.ToString() == "Yes") { System.Diagnostics.Process.Start("https://itshaysus.github.io/Cleaningapp/"); }
        }

        private void MenuItem_Click_3(object sender, RoutedEventArgs e)
        {
            try
            {
                string fileName = "read.pdf";
                string path = System.IO.Path.Combine(Environment.CurrentDirectory, @"Webcontent\", fileName);
                System.Diagnostics.Process.Start(path);
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

            private void LogInButton_Click(object sender, RoutedEventArgs e)
        {
            switch (profiles.SelectedIndex)
            {
                case 0:
                    MessageBox.Show("Option not available");
                    break;
                case 1:
                    Window1 win1 = new Window1();
                    win1.Show();
                    this.Close();
                    break;
            }
        }
    }
}
