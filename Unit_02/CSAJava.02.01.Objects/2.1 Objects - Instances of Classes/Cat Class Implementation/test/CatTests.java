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
    Cat cat = new Cat("Bowie", 13, "white");
    String actual = cat.toString();
    String expected = "Bowie, the 13-year-old white cat, is not sleeping.";
    assertEquals(expected, actual);
  }

  @Test
  public void testIsSleeping() {
    // put your test here
    Cat cat = new Cat("Bowie", 13, "white");
    cat.sleeps();
    String actual = cat.toString();
    String expected = "Bowie, the 13-year-old white cat, is sleeping.";
    assertEquals(expected, actual);
  }
}