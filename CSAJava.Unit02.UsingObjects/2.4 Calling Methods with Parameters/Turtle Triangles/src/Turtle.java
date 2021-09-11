import java.awt.*;

public class Turtle
{
    private String name;
    private Color bodyColor;
    private int width = 15;
    private int height = 18;
    private int xpos = 0;
    private int ypos = 0;

    public Turtle(World world){}

    @Override
    public String toString()
    {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", bodyColor=" + bodyColor +
                ", width=" + width +
                ", height=" + height +
                ", xpos=" + xpos +
                ", ypos=" + ypos +
                '}';
    }
}
