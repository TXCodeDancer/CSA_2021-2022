import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        // Create instance of class with no-argument constructor
        Cat myCat = new Cat();
        System.out.println();
        System.out.println("The default Cat is:");
        System.out.println(myCat);

        // Create instance of class with argument constructor
        Cat panda = new Cat("Panda", 16, "black and white");
        Cat rusty = new Cat("Rusty", 15, "orange tabby");
        Cat ben = new Cat("Ben", 18, "black and white");
        Cat bowie = new Cat("Bowie", 13, "white");

        // Create a list of my cats
        List<Cat> myCats = new ArrayList<>();
        myCats.add(panda);
        myCats.add(rusty);
        myCats.add(ben);
        myCats.add(bowie);

        outputMyCats(myCats);

        // Panda and Ben are now sleeping
        panda.sleeps();
        ben.sleeps();

        outputMyCats(myCats);

    }

    // Output information about each of my cats
    private static void outputMyCats(List<Cat> myCats)
    {
        System.out.println();
        System.out.println("My cats are:");
        for (Object cat : myCats)
        {
            System.out.println(cat);
        }
    }
}