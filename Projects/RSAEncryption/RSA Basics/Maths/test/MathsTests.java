import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathsTests {
  @Test
  public void testIsPrime() {
    List<Integer> notPrimeList = new ArrayList<Integer>(Arrays.asList(-1, 0, 1, 4, 21));
    for (int i : notPrimeList)
    {
      assertFalse(Maths.isPrime(i));
    }

    List<Integer> primeList = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 97));
    for (int i : primeList)
    {
      assertTrue(Maths.isPrime(i));
    }
  }
}