@echo off
@REM Silent install IntelliJ IDEA Edu
@REM Instructions: https://www.jetbrains.com/help/idea/installation-guide.html#silent
@REM Download: https://www.jetbrains.com/edu-products/download/download-thanks.html?platform=windows
echo Installing IntelliJ IDEA Edu
@REM ideaIE-2021.2.exe /S /CONFIG=c:\temp\silent.config /D=c:\IDE\IntelliJ IDEA Edu
ideaIE-2021.2.exe /S /CONFIG=c:\temp\silent.config /LOG=c:\JetBrains\IDEA\install.log /D=c:\IDE\IntelliJ IDEA Edu
echo Finished
