import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    String expected = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";

    String actual = "";
    for (int i = 0; i < 100; i++)
    {
      if (Prime.isPrime(i))
      {
        actual += i + " ";
      }
    }

    Assert.assertTrue(expected.equals(actual));
  }
}