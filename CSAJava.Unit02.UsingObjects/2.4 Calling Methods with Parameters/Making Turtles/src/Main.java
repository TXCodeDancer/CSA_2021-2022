import java.awt.*;

public class Main {
   public static void main(String[] args) {
      World world = new World();

      // Create a default turtle
      Turtle turtle = new Turtle(world);
      // Print turtle parameters
      System.out.println(turtle);

      // Create a turtle with a starting position: x = 50; y = 75. Print its information
      Turtle turtleXY = new Turtle(50, 75, world);
      System.out.println(turtleXY);

      // Change its colors: Body = blue; Shell = red. Print its information
      turtleXY.setColor(Color.blue, Color.red);
      System.out.println(turtleXY);
   }
}