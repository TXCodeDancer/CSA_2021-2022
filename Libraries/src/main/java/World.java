/**
 * The type World.
 */
public class World
{
    private int width = 640;
    private int height = 480;

    /**
     * Instantiates a new World.
     */
    public World() {}

    /**
     * Instantiates a new World.
     *
     * @param width  the width
     * @param height the height
     */
    public World(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight()
    {
        return height;
    }
}
