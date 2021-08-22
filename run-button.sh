clear
cd "Unit_01.3"
printf "Compiling..."
javac -verbose *.java

if [ $? == 0 ] 
then
    clear
    java Main
else
    printf "\n\n\nError - Exit code $?"
fi
