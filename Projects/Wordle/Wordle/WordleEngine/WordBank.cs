namespace WordleEngine;

public class WordBank
{
    public static void Setup()
    {
        string allWordFile = "AllWordBank.txt";
        string fiveLetterWordFile = "FiveLetterWordBank.txt";
        var words = File.ReadAllLines(allWordFile);
        List<string> fiveLetterWords = new();
        foreach (var word in words)
        {
            if (word.Trim().Length == 5)
            {
                fiveLetterWords.Add(word.Trim());
            }
        }
        File.WriteAllLines(fiveLetterWordFile, fiveLetterWords);
    }
}
