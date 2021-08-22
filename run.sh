clear
cd "Unit_01.3"
printf "Compiling...\n"
javac *.java

if [ $? == 0 ] 
then
    clear
    java Main
else
    printf "\n\n\nError - Exit code $?"
fi
