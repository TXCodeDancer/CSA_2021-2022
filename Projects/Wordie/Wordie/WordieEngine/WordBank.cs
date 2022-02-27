namespace WordieEngine;

public class WordBank
{
    private static readonly int AlphabetSize = (int)('Z' - '@');
    private static List<string> ValidWords = new();
    private static bool[] UsedLetters = new bool[AlphabetSize];

    public static void CreateWordList()
    {
        //string allWordFile = "AllWordBank.txt";
        string wordleWordFile = "WordleWordBank.txt";
        string fiveLetterWordFile = "FiveLetterWordBank.txt";
        var lines = File.ReadAllLines(wordleWordFile);
        List<string> fiveLetterWords = new();
        foreach (var line in lines)
        {
            var tokens = line.Split(' ');
            var word = tokens[5];
            if (word.Trim().Length == 5)
            {
                fiveLetterWords.Add(word.Trim().ToLower());
            }
        }
        if (fiveLetterWords.Any())
            File.WriteAllLines(fiveLetterWordFile, fiveLetterWords);
    }

    public static void Setup()
    {
        string wordBank = "FiveLetterWordBank.txt";
        try
        {
            ValidWords = File.ReadAllLines(wordBank).ToList();
        }
        catch (IOException e)
        {
            CreateWordList();
            ValidWords = File.ReadAllLines(wordBank).ToList();
        }
        UsedLetters = new bool[AlphabetSize];
    }

    public static string GetRandomWord()
    {
        Random random = new();
        var idx = random.Next(ValidWords.Count);
        return ValidWords[idx];
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
        string available = "";
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
