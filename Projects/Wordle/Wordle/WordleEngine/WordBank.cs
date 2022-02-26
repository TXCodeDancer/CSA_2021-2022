namespace WordleEngine;

public class WordBank
{
    private static List<string> ValidWords = new();
    private static readonly bool[] UsedLetters = new bool[26];

    public static void CreateWordList()
    {
        string allWordFile = "AllWordBank.txt";
        string fiveLetterWordFile = "FiveLetterWordBank.txt";
        var words = File.ReadAllLines(allWordFile);
        List<string> fiveLetterWords = new();
        foreach (var word in words)
        {
            if (word.Trim().Length == 5)
            {
                fiveLetterWords.Add(word.Trim().ToLower());
            }
        }
        File.WriteAllLines(fiveLetterWordFile, fiveLetterWords);
    }

    public static void Setup()
    {
        string wordBank = "FiveLetterWordBank.txt";
        ValidWords = File.ReadAllLines(wordBank).ToList();
    }

    public static bool IsValid(string word)
    {
        if (string.IsNullOrEmpty(word))
        {
            return false;
        }

        return ValidWords.Contains(word.ToLower());
    }

    public static string GetAvailableLetters()
    {
        string available = "Available Letters: ";
        for (int i = 0; i < UsedLetters.Length; i++)
        {
            var used = UsedLetters[i];
            if (used)
            {
                available += "# ";
            }
            else
            {
                char letter = (char)('A' + i);
                available += $"{letter} ";
            }
        }

        return available;
    }

    public static void UpdateAvailableLetters(string guess)
    {
        if (string.IsNullOrEmpty(guess))
        {
            throw new ArgumentException($"'{nameof(guess)}' cannot be null or empty.", nameof(guess));
        }

        guess = guess.Trim().ToUpper();
        for (int i = 0; i < guess.Length; i++)
        {
            var c = guess[i];
            int idx = (int)(c - 'A');
            UsedLetters[idx] = true;
        }
    }
}
