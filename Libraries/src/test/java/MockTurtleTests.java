import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class MockTurtleTests
{
    final double EPSILON = 0.00001;

    @Test
    public void testSetXYPositionNeg()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(-1, -1, world);
        assertEquals(0, turtle.getXPosition());
        assertEquals(0, turtle.getYPosition());
    }

    @Test
    public void testSetXYPositionTooBig()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world.getWidth() + 10, world.getHeight() + 10, world);
        assertEquals(world.getWidth(), turtle.getXPosition());
        assertEquals(world.getHeight(), turtle.getYPosition());
    }

    @Test
    public void testSetXYPositionMidRange()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world.getWidth() / 2, world.getHeight() / 2, world);
        assertEquals(world.getWidth() / 2, turtle.getXPosition());
        assertEquals(world.getHeight() / 2, turtle.getYPosition());
    }

    @Test
    public void testSetXYPositionDefault()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(world.getWidth() / 2, turtle.getXPosition());
        assertEquals(world.getHeight() / 2, turtle.getYPosition());
    }

    @Test
    public void testHeadingTurnRight()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading(), EPSILON);

        turtle.turnRight();
        assertEquals(0, turtle.getHeading(), EPSILON);
    }

    @Test
    public void testHeadingTurnLeft()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading(), EPSILON);

        turtle.turnLeft();
        assertEquals(180, turtle.getHeading(), EPSILON);
    }

    @Test
    public void testHeadingTurn()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading(), EPSILON);

        turtle.turn(45);
        assertEquals(45, turtle.getHeading(), EPSILON);

        turtle.turn(-55);
        assertEquals(100, turtle.getHeading(), EPSILON);

        turtle.turn(120);
        assertEquals(340, turtle.getHeading(), EPSILON);

        turtle.turn(720);
        assertEquals(340, turtle.getHeading(), EPSILON);

        turtle.turn(-30);
        assertEquals(10, turtle.getHeading(), EPSILON);

        turtle.turn(-720);
        assertEquals(10, turtle.getHeading(), EPSILON);
    }

    @Test
    public void testPositionForward()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        int xExpected = turtle.getXPosition();
        int yExpected = turtle.getYPosition();
        assertEquals(90, turtle.getHeading(), EPSILON);

        turtle.forward();
        yExpected += 100;
        assertEquals(xExpected, turtle.getXPosition());
        assertEquals(yExpected, turtle.getYPosition());

        turtle.turnRight();
        turtle.forward();
        xExpected += 100;
        assertEquals(xExpected, turtle.getXPosition());
        assertEquals(yExpected, turtle.getYPosition());

        turtle.turn(30);
        turtle.forward();
        xExpected += 87;
        yExpected -= 50;
        assertEquals(xExpected, turtle.getXPosition());
        assertEquals(yExpected, turtle.getYPosition());
    }

    @Test
    public void testGetDistance()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        int xPosition = turtle.getXPosition();
        int yPosition = turtle.getYPosition();

        double distanceExpected = Math.sqrt((xPosition * xPosition) + (yPosition * yPosition));
        double distanceActual = turtle.getDistance(0,0);
        assertEquals(distanceExpected, distanceActual, EPSILON);
    }

    @Test
    public void testMoveTo()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        int xPosition = turtle.getXPosition();
        int yPosition = turtle.getYPosition();

        int xPositionNew = xPosition + 10;
        int yPositionNew = yPosition + 10;

        assertNotEquals(xPosition, xPositionNew);
        assertNotEquals(yPosition, yPositionNew);

        turtle.moveTo(xPositionNew, yPositionNew);
        assertEquals(xPositionNew, turtle.getXPosition());
        assertEquals(yPositionNew, turtle.getYPosition());
    }

    @Test
    public void testSetColor()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        Color body = turtle.getBodyColor();
        Color shell = turtle.getShellColor();
        assertEquals(body, Color.GREEN);
        assertEquals(shell, Color.YELLOW);

        Color bodyNew = Color.BLUE;
        Color shellNew = Color.ORANGE;
        turtle.setColor(bodyNew, shellNew);
        assertEquals(bodyNew, Color.BLUE);
        assertEquals(shellNew, Color.ORANGE);


    }

}
