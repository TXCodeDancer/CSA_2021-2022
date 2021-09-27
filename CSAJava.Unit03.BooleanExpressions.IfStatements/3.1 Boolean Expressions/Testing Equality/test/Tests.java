import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Assert.assertTrue(BooleanExpressions.equals(1, 1));
    Assert.assertFalse(BooleanExpressions.equals(0, 1));

    Assert.assertTrue(BooleanExpressions.notEquals(0, 1));
    Assert.assertFalse(BooleanExpressions.notEquals(1, 1));

    Assert.assertTrue(BooleanExpressions.lessThan(0, 1));
    Assert.assertFalse(BooleanExpressions.lessThan(1, 1));
    Assert.assertFalse(BooleanExpressions.lessThan(2, 1));

    Assert.assertFalse(BooleanExpressions.greaterThan(0, 1));
    Assert.assertFalse(BooleanExpressions.greaterThan(1, 1));
    Assert.assertTrue(BooleanExpressions.greaterThan(2, 1));

    Assert.assertTrue(BooleanExpressions.lessThanEquals(0, 1));
    Assert.assertTrue(BooleanExpressions.lessThanEquals(1, 1));
    Assert.assertFalse(BooleanExpressions.lessThanEquals(2, 1));

    Assert.assertFalse(BooleanExpressions.greaterThanEquals(0, 1));
    Assert.assertTrue(BooleanExpressions.greaterThanEquals(1, 1));
    Assert.assertTrue(BooleanExpressions.greaterThanEquals(2, 1));

  }
}