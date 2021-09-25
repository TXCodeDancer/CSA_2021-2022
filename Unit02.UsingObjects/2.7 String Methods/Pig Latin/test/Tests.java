import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testPigLatinWord() {
    String text = "pig";
    String expected = "igpay";
    String actual = PigLatin.ConvertWord(text);
    Assert.assertTrue(expected.equals(actual));
  }

  @Test
  public void testPigLatinPhrase() {
    String text = "Java is fun";
    String expected = "avaJay siay unfay";
    String actual = PigLatin.Convert(text);
    Assert.assertTrue(expected.equals(actual));
  }

}