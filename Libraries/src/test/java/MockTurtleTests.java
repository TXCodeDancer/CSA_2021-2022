import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MockTurtleTests
{
    @Test
    public void testSetXYPositionNeg()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(-1, -1, world);
        assertEquals(0, turtle.getxPosition());
        assertEquals(0, turtle.getyPosition());
    }

    @Test
    public void testSetXYPositionTooBig()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world.getWidth() + 10, world.getHeight() + 10, world);
        assertEquals(world.getWidth(), turtle.getxPosition());
        assertEquals(world.getHeight(), turtle.getyPosition());
    }

    @Test
    public void testSetXYPositionMidRange()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world.getWidth() / 2, world.getHeight() / 2, world);
        assertEquals(world.getWidth() / 2, turtle.getxPosition());
        assertEquals(world.getHeight() / 2, turtle.getyPosition());
    }

    @Test
    public void testSetXYPositionDefault()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(world.getWidth() / 2, turtle.getxPosition());
        assertEquals(world.getHeight() / 2, turtle.getyPosition());
    }

    @Test
    public void testHeadingTurnRight()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading());

        turtle.turnRight();
        assertEquals(0, turtle.getHeading());
    }

    @Test
    public void testHeadingTurnLeft()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading());

        turtle.turnLeft();
        assertEquals(180, turtle.getHeading());
    }

    @Test
    public void testHeadingTurn()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        assertEquals(90, turtle.getHeading());

        turtle.turn(45);
        assertEquals(45, turtle.getHeading());

        turtle.turn(-55);
        assertEquals(100, turtle.getHeading());

        turtle.turn(120);
        assertEquals(340, turtle.getHeading());

        turtle.turn(720);
        assertEquals(340, turtle.getHeading());

        turtle.turn(-30);
        assertEquals(10, turtle.getHeading());

        turtle.turn(-720);
        assertEquals(10, turtle.getHeading());
    }

    @Test
    public void testPositionForward()
    {
        World world = new World();
        MockTurtle turtle = new MockTurtle(world);
        int xExpected = turtle.getxPosition();
        int yExpected = turtle.getyPosition();
        assertEquals(90, turtle.getHeading());

        turtle.forward();
        yExpected += 100;
        assertEquals(xExpected, turtle.getxPosition());
        assertEquals(yExpected, turtle.getyPosition());

        turtle.turnRight();
        turtle.forward();
        xExpected += 100;
        assertEquals(xExpected, turtle.getxPosition());
        assertEquals(yExpected, turtle.getyPosition());

        turtle.turn(30);
        turtle.forward();
        xExpected += 87;
        yExpected -= 50;
        assertEquals(xExpected, turtle.getxPosition());
        assertEquals(yExpected, turtle.getyPosition());


    }
}
