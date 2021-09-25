import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
   Assert.assertTrue(BooleanExpressions.isPositive(1));
    Assert.assertFalse(BooleanExpressions.isPositive(0));
    Assert.assertFalse(BooleanExpressions.isPositive(-1));

    Assert.assertFalse(BooleanExpressions.isNegative(1));
    Assert.assertFalse(BooleanExpressions.isNegative(0));
    Assert.assertTrue(BooleanExpressions.isNegative(-1));

    Assert.assertTrue(BooleanExpressions.isEven(0));
    Assert.assertFalse(BooleanExpressions.isEven(1));
    Assert.assertTrue(BooleanExpressions.isEven(2));

    Assert.assertFalse(BooleanExpressions.isOdd(0));
    Assert.assertTrue(BooleanExpressions.isOdd(1));
    Assert.assertFalse(BooleanExpressions.isOdd(2));

    Assert.assertTrue(BooleanExpressions.isMultipleOf(4, 2));
    Assert.assertFalse(BooleanExpressions.isMultipleOf(5, 2));
  }
}