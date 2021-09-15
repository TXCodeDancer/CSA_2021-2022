import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  double epsilon = 0.000001d;

  @Test
  public void testSolution() {
    Fraction fraction = new Fraction(1, 3);
    double actual = fraction.getDecimal();
    double expected = 1.0/3.0;
    assertEquals(expected, actual, epsilon);
  }
}