using System.Windows;

namespace CleaningAppCSharp
{
    public partial class MainWindow : Window
    {
        Methods method = new Methods();

        public MainWindow()
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
            Window1 win1 = new Window1();
            switch (profiles.SelectedIndex)
            {
                case 0:
                    MessageBox.Show("Option not available");
                    break;
                case 1:
                    win1.Show();
                    this.Close();
                    break;
            }
        }
    }
}
