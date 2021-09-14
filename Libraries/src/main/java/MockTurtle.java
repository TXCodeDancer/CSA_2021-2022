import java.awt.*;

/**
 * The type Mock turtle.
 */
public class MockTurtle
{
    private Color bodyColor = Color.GREEN;
    private Color shellColor = Color.YELLOW;
    private int width = 15;
    private int height = 18;
    private int xPosition;
    private int yPosition;
    private World world;
    private double heading = 90; // degrees angle

    /**
     * Instantiates a new Mock turtle.
     *
     * @param world the world
     */
    public MockTurtle(World world)
    {
        this(world.getWidth()/2, world.getHeight()/2, world);
    }

    /**
     * Instantiates a new Mock turtle.
     *
     * @param x     the x
     * @param y     the y
     * @param world the world
     */
    public MockTurtle(int x, int y, World world)
    {
        this.world = world;
        setXYPosition(x, y);
    }

    private void setXYPosition(int x, int y)
    {
        if(x < 0) x = 0;
        else if (x > world.getWidth())
        {
            x = world.getWidth();
        }
        if(y < 0) y = 0;
        else if (y > world.getHeight())
        {
            y = world.getHeight();
        }
        xPosition = x;
        yPosition = y;
    }

    /**
     * Turn right.
     */
    public void turnRight()
    {
        turn(90);
    }

    /**
     * Turn left.
     */
    public void turnLeft()
    {
        turn(-90);
    }

    /**
     * Turn.
     *
     * @param degrees the degrees
     */
    public void turn(double degrees)
    {
        heading -= degrees;
        heading = normalizeAngle(heading);
    }

    private double normalizeAngle(double angle)
    {
        if(angle == 360)
            angle = 0;
        while(angle > 360)
            angle -=360;
        while(angle < 0)
            angle += 360;

        return angle;
    }

    /**
     * Forward.
     */
    public void forward()
    {
        forward(100);
    }

    /**
     * Forward.
     *
     * @param distance the distance
     */
    public void forward(int distance)
    {
        xPosition += xDistance(distance);
        yPosition += yDistance(distance);
    }

    private int xDistance(double distance)
    {
        double radians = Math.toRadians(heading);
        double cosine = Math.cos(radians);
        double xDistance = distance * cosine;

        if(xDistance > 0) xDistance += 0.5;
        else xDistance -= 0.5;
        return (int)xDistance;
    }

    private int yDistance(double distance)
    {
        double radians = Math.toRadians(heading);
        double sine = Math.sin(radians);
        double yDistance =  distance * sine;

        if(yDistance > 0) yDistance += 0.5;
        else yDistance -= 0.5;
        return (int)yDistance;
    }

    /**
     * Gets distance.
     *
     * @param x the x
     * @param y the y
     * @return the distance
     */
    public double getDistance(int x, int y)
    {
        double distance = Math.sqrt((x - xPosition)*(x - xPosition) + (y - yPosition)*(y - yPosition));
        return distance;
    }

    /**
     * Sets color.
     *
     * @param body  the body
     * @param shell the shell
     */
    public void setColor(Color body, Color shell)
    {
        bodyColor = body;
        shellColor = shell;
    }

    /**
     * Move to.
     *
     * @param x the x
     * @param y the y
     */
    public void moveTo(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }

    @Override
    public String toString()
    {
        return "MockTurtle{" +
                "bodyColor=" + bodyColor +
                ", shellColor=" + shellColor +
                ", width=" + width +
                ", height=" + height +
                ", xpos=" + xPosition +
                ", ypos=" + yPosition +
                '}';
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public int getxPosition()
    {
        return xPosition;
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public int getyPosition()
    {
        return yPosition;
    }

    /**
     * Gets heading.
     *
     * @return the heading
     */
    public double getHeading()
    {
        return heading;
    }
}