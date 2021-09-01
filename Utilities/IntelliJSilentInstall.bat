@echo off
@REM Silent install IntelliJ IDEA Community
@REM Instructions: https://www.jetbrains.com/help/idea/installation-guide.html#silent
@REM Download: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC
echo Installing IntelliJ IDEA Community
ideaIC-2021.2.1.exe /S /CONFIG=c:\temp\silent.config /D=c:\JetBrains\IDE\IntelliJ IDEA Edu
@REM ideaIC-2021.2.1.exe /S /CONFIG=c:\temp\silent.config /LOG=c:\JetBrains\IDEA\install.log /D=c:\JetBrains\IDE\IntelliJ IDEA Edu
echo IntelliJ installation complete
