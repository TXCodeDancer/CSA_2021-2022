import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

/**
 * The type Pig latin.
 */
public class PigLatin {
    /**
     * Convert string.
     *
     * @param text the text
     * @return the string
     */
    public static String Convert(String text)
  {
      List<String> pigLatinWords = new ArrayList();
      String[] words = text.split(" ");
      for(String word : words)
      {
          String pigLatinWord = ConvertWord(word);
          pigLatinWords.add(pigLatinWord);
      }
      String pigLatin = String.join(" ", pigLatinWords);
      return pigLatin;
  }

    /**
     * Convert word string.
     *
     * @param word the word
     * @return the string
     */
    public static String ConvertWord(String word)
    {
        // Implement method to convert a single word to Pig Latin
        String firstLetter = word.substring(0,1);
        String otherLetters = word.substring(1);
        String addedLetters = "ay";
        String pigLatinWord = otherLetters + firstLetter + addedLetters;
        return pigLatinWord;
    }
}