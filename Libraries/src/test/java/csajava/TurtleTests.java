package csajava;
/*
 ** @package csajava
 ** @project MockTurtle
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/18/2021
 */

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TurtleTests
{
    @Test
    public void testDefaultConstructor()
    {
        World world = new World();
        Turtle turtle = new Turtle(world);
        assertEquals(world.getWidth() / 2, turtle.getXPosition());
        assertEquals(world.getHeight() / 2, turtle.getYPosition());
    }

    @Test
    public void testXYConstructor()
    {
        World world = new World();
        Turtle turtle = new Turtle(-1, -1, world);
        assertEquals(0, turtle.getXPosition());
        assertEquals(0, turtle.getYPosition());
    }

}
