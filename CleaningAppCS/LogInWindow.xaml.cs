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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CleaningAppCS
{
    /// <summary>
    /// Interaction logic for LogInWindow.xaml
    /// </summary>
    public partial class LogInWindow : Window
    {
        Methods method = new Methods();

        public LogInWindow()
        {
            InitializeComponent();
        }
        private void FeedbackMenu(object sender, RoutedEventArgs e)
        {
            method.FeedbackMethod();
        }

        private void AboutMenu(object sender, RoutedEventArgs e)
        {
            method.AboutMethod();
        }

        private void HelpMenu(object sender, RoutedEventArgs e)
        {
            method.HelpMethod();
        }

        private void LoginButton(object sender, RoutedEventArgs e)
        {
            switch (profiles.SelectedIndex)
            {
                case 0:
                    MessageBox.Show("Option not available");
                    break;
                case 1:
                    CirculationWindow win1 = new CirculationWindow();
                    win1.Show();
                    this.Close();
                    break;
            }
        }
    }
}
