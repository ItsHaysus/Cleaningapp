using CleaningAppCSharp;
using System;
using System.Collections.Generic;
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

namespace CleaningAppCS
{
    /// <summary>
    /// Interaction logic for CirculationWindow.xaml
    /// </summary>
    public partial class CirculationWindow : Window
    {
        Methods method = new Methods();

        public CirculationWindow()
        {
            InitializeComponent();
        }
        private void Backkupbtn(object sender, RoutedEventArgs e)
        {
            method.Backupmethod();
        }

        private void FeedbackMenu(object sender, RoutedEventArgs e)
        {
            method.FeedbackMethod();
        }

        private void HelpMenu(object sender, RoutedEventArgs e)
        {
            method.HelpMethod();
        }

        private void AboutMenu(object sender, RoutedEventArgs e)
        {
            method.AboutMethod();
        }

        private void DiskCleanerButton(object sender, RoutedEventArgs e)
        {
            method.DiskCleanerMethod();
        }

        private void CCleanerMethod(object sender, RoutedEventArgs e)
        {
            method.CCleanerMethod();
        }

        private void DefragButton(object sender, RoutedEventArgs e)
        {
            method.DefragMethod();
        }

        private void DeleteOldFilesButton(object sender, RoutedEventArgs e)
        {
            method.DeleteOldMethods();
        }

        private void LogOutMenu(object sender, RoutedEventArgs e)
        {
              LogInWindow main = new LogInWindow();
            try
            {
                MessageBoxResult messageBoxResult = MessageBox.Show("Would you like to change profiles?",
                    "Log out",
                    MessageBoxButton.YesNo,
                    MessageBoxImage.Asterisk);
                if (messageBoxResult.ToString() == "Yes")
                {
                    main.Show();
                    this.Close();
                }
            }
            catch (Exception)
            {
                MessageBox.Show("Problem Sigining out");
            }
        }
    }
}
