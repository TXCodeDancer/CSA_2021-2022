import java.awt.*;

public class Turtle
{
    private Color bodyColor = Color.GREEN;
    private Color shellColor = Color.YELLOW;
    private int width = 15;
    private int height = 18;
    private int xpos = 0;
    private int ypos = 0;
    private World world;

    public Turtle(World world){}
    public Turtle(int x, int y, World world)
    {
        this.world = world;
        xpos = x;
        ypos = y;
    }

    void setColor(Color body, Color shell)
    {
        bodyColor = body;
        shellColor = shell;
    }

    @Override
    public String toString()
    {
        return "Turtle{" +
                "bodyColor=" + bodyColor +
                ", shellColor=" + shellColor +
                ", width=" + width +
                ", height=" + height +
                ", xpos=" + xpos +
                ", ypos=" + ypos +
                '}';
    }
}
