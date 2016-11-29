@echo off
:: BatchGotAdmin
:-------------------------------------
REM  --> Check for permissions
    IF "%PROCESSOR_ARCHITECTURE%" EQU "amd64" (
>nul 2>&1 "%SYSTEMROOT%\SysWOW64\cacls.exe" "%SYSTEMROOT%\SysWOW64\config\system"
) ELSE (
>nul 2>&1 "%SYSTEMROOT%\system32\cacls.exe" "%SYSTEMROOT%\system32\config\system"
)

REM --> If error flag set, we do not have admin.
if '%errorlevel%' NEQ '0' (
    echo Requesting administrative privileges...
    goto UACPrompt
) else ( goto gotAdmin )

:UACPrompt
    echo Set UAC = CreateObject^("Shell.Application"^) > "%temp%\getadmin.vbs"
    set params = %*:"=""
    echo UAC.ShellExecute "cmd.exe", "/c ""%~s0"" %params%", "", "runas", 1 >> "%temp%\getadmin.vbs"

    "%temp%\getadmin.vbs"
    del "%temp%\getadmin.vbs"
    exit /B

:gotAdmin
    pushd "%CD%"
    CD /D "%~dp0"
:----------------------------------------
echo Initiating Defragmentation(Requires Admininstrator rights)
timeout /t 5
defrag /C /H /V
echo Defragmentation is done
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
