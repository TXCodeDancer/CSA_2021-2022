import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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

  @Test
  public void testGetPrimesUpTo() {
    List<Integer> primeList = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
    List<Integer> actual = Maths.getPrimes(20);

    assertEquals(primeList.size(), actual.size());

    for (int i = 0; i < primeList.size(); i++)
    {
      assertEquals(primeList.get(i), actual.get(i));
    }
  }

  @Test
  public void testGetPrimesBetween() {
    List<Integer> primeList = new ArrayList<Integer>(Arrays.asList(11, 13, 17, 19));
    List<Integer> actual = Maths.getPrimes(10, 20);

    assertEquals(primeList.size(), actual.size());

    for (int i = 0; i < primeList.size(); i++)
    {
      assertEquals(primeList.get(i), actual.get(i));
    }
  }

  @Test
  public void testGetPrimesBetweenInclusive() {
    List<Integer> primeList = new ArrayList<Integer>(Arrays.asList(11, 13, 17, 19));
    List<Integer> actual = Maths.getPrimes(11, 19);

    assertEquals(primeList.size(), actual.size());

    for (int i = 0; i < primeList.size(); i++)
    {
      assertEquals(primeList.get(i), actual.get(i));
    }
  }

  @Test
  public void testPowerMod() {
    int expected = 15267;
    int actual = Maths.powerMod(4224, 11, 16637);
    assertEquals(expected, actual);

    expected = 5234;
    actual = Maths.powerMod(5791, 197, 6673);
    assertEquals(expected, actual);
  }


}