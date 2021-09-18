package csajava;
/*
 ** @package csajava
 ** @project MockTurtle
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/18/2021
 */

/**
 * The type Turtle.
 */
public class Turtle extends MockTurtle
{
    /**
     * Instantiates a new Turtle.
     *
     * @param world the world
     */
    public Turtle(World world)
    {
        super(world);
    }

    /**
     * Instantiates a new Turtle.
     *
     * @param xPosition the x position
     * @param yPosition the y position
     * @param world     the world
     */
    public Turtle(int xPosition, int yPosition, World world)
    {
        super(xPosition, yPosition, world);
    }
}
