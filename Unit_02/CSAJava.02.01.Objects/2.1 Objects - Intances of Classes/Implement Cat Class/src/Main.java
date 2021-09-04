import java.util.ArrayList;
import java.util.List;

// This class will not be graded. Feel free to experiment creating and modifying Cat objects.
public class Main {
    public static void main(String[] args)
    {
        Cat myCat = new Cat();
        System.out.println();
        System.out.println("A default Cat is:");
        System.out.println(myCat);

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Some Name", 1, "some color"));

        System.out.println();
        System.out.println("My cats are:");
        for(Object cat : cats)
        {
            System.out.println(cat);
        }
    }
}
