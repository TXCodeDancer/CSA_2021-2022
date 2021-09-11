import java.awt.*;

public class Main {
    public static void main(String[] args) {
        World world = new World();

        // Call makingTurtles with starting position: x = 50; y = 75; and colors: Body = blue; Shell = red
        int x = 50;
        int y = 75;
        Color body = Color.blue;
        Color shell = Color.red;
        Turtle turtle =  makingTurtles(world, x, y, body, shell);
        System.out.println(turtle);

        // Make a new turtle with starting position: x = 25; y = 0; and colors: Body = green; Shell = yellow
        x = 25;
        y = 0;
        body = Color.green;
        shell = Color.yellow;
        Turtle turtleNew =  makingTurtles(world, x, y, body, shell);
        System.out.println(turtleNew);

    }

    public static Turtle makingTurtles(World world, int x, int y, Color body, Color shell)
    {
        Turtle turtle = new Turtle(x, y, world);
        turtle.setColor(body, shell);
        return turtle;
    }
}