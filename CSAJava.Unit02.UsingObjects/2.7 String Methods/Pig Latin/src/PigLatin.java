import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class PigLatin {
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