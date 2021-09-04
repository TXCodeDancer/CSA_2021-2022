import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTests {
  @Test
  public void testDefault() {
    // put your test here
    Cat cat = new Cat();
    String actual = cat.toString();
    String expected = ", the -2147483648-year-old  cat, is not sleeping.";
    assertEquals(expected, actual);
  }

  @Test
  public void testParameterConstructor() {
    // put your test here
    Cat cat = new Cat("Ben", 18, "black and white");
    String actual = cat.toString();
    String expected = "Ben, the 18-year-old black and white cat, is not sleeping.";
    assertEquals(expected, actual);
  }

  @Test
  public void testIsSleeping() {
    // put your test here
    Cat cat = new Cat("Ben", 18, "black and white");
    cat.sleeps();
    String actual = cat.toString();
    String expected = "Ben, the 18-year-old black and white cat, is sleeping.";
    assertEquals(expected, actual);
  }
}