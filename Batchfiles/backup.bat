@echo off
echo Backing up computer
set dt=%date:~7,2%-%date:~4,2%-%date:~10,4%
timeout /t 5
C:\CleanerUTRGV\Dependencies\7za a -tzip C:\Users\%username%\Desktop\Backup_%dt%.zip -r0 C:\Users\%username%\*.txt C:\Users\%username%\*.pdf C:\Users\%username%\*.docx C:\Users\%username%\*.pptx C:\Users\%username%\*.ppt C:\Users\%username%\*.xlsx C:\Users\%username%\*.xls C:\Users\%username%\*.doc 
echo Backup done
echo This window closes in 5 seconds
ping -n 2 127.0.0.1>nul
echo This window closes in 4 seconds
ping -n 2 127.0.0.1>nul
echo This window closes in 3 seconds
ping -n 2 127.0.0.1>nul
echo This window closes in 2 seconds
ping -n 2 127.0.0.1>nul
echo This window closes in 1 seconds
ping -n 2 127.0.0.1>nul
