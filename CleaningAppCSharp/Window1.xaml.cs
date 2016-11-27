using System.Windows;

namespace CleaningAppCSharp
{

    public partial class Window1 : Window
    {
        Methods method = new Methods();

        public Window1()
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
            method.LogoutMethod();
        }
    }
}
