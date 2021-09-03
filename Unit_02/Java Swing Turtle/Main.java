import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(400,400);
    Turtle yertle = new Turtle(world);
    // Add your own code in here 
    yertle.setColor(Color.blue);
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    
    world.setVisible(true);
  }
}
