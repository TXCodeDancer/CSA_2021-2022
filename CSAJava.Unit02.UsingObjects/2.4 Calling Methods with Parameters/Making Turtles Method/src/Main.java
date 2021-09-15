import java.awt.*;

public class Main {
    public static void main(String[] args) {
        World world = new World();

        // Call makingTurtles with starting position: x = 50; y = 75; and colors: Body = blue; Shell = red
        int x = 50;
        int y = 75;
        Color body = Color.blue;
        Color shell = Color.red;
        MockTurtle turtle =  makeTurtle(world, x, y, body, shell);  // makeTurtle(...) must be implemented below
        System.out.println(turtle);

        // Using the method you implement below:
        // Make a new turtle with starting position: x = 25; y = 0; and colors: Body = green; Shell = yellow
        x = 25;
        y = 0;
        body = Color.green;
        shell = Color.yellow;
        MockTurtle turtleNew =  makeTurtle(world, x, y, body, shell);
        // Print turtle information to console.
        System.out.println(turtleNew);

    }

    public static MockTurtle makeTurtle(World world, int x, int y, Color body, Color shell)
    {
        // Implement method body to create a new turtle at position x, y with body/shell colors
        MockTurtle turtle = new MockTurtle(x, y, world);
        turtle.setColor(body, shell);
        return turtle;
    }
}