package csa.java.turtle;
/*
 ** @package csa.java
 ** @project MockTurtle
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/18/2021
 */

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TurtleTests
{
    @Test
    public void testWorldConstructor()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(world.getWidth() / 2, turtle.getXPosition());
        assertEquals(world.getHeight() / 2, turtle.getYPosition());
    }

    @Test
    public void testXYWorldConstructor()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world.getWidth() / 2, world.getHeight() / 2, world);
        assertEquals(world.getWidth() / 2, turtle.getXPosition());
        assertEquals(world.getHeight() / 2, turtle.getYPosition());
    }
}
