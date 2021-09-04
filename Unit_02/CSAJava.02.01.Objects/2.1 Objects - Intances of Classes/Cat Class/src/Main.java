import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Cat myCat = new Cat();
      System.out.println();
      System.out.println("A default Cat is:");
      System.out.println(myCat.toString());

      List<Cat> myCats = new ArrayList<Cat>();
      myCats.add(new Cat("Panda", 16, "Black and white"));
      myCats.add(new Cat("Rusty", 15, "Orange tabby"));
      myCats.add(new Cat("Ben", 18, "Black and white"));
      myCats.add(new Cat("Bowie", 13, "White"));

      System.out.println();
      System.out.println("My cats are:");
      for(Object cat : myCats)
      {
         System.out.println(cat.toString());
      }
   }
}