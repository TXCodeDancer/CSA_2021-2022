import org.junit.Test;
import java.awt.*;
import static junit.framework.TestCase.assertTrue;

public class Tests {
  @Test
  public void testSolution() {
    World world = new World();
    int x = 50;
    int y = 75;
    Color body = Color.blue;
    Color shell = Color.red;
    Turtle expectedTurtle = new Turtle(x, y, world);
    expectedTurtle.setColor(body, shell);

    Turtle actualTurtle =  Main.makeTurtle(world, x, y, body, shell);

    String expected = expectedTurtle.toString();
    String actual = actualTurtle.toString();

    assertTrue(expected.equals(actual));
  }
}