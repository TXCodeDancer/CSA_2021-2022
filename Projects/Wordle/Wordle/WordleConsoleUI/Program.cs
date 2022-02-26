namespace WordleConsoleUI;

public class Program
{
    private static string Answer = "";

    public static void Main()
    {
        //WordBank.Setup();

        Answer = GetAnswer();
        Console.WriteLine($"The secret word is {Answer};");

        Console.WriteLine($"");
        Console.WriteLine($"Press any key start game:");
        Console.ReadLine();
        Console.Clear();

        const int noOfAttempts = 5;
        int attemptsRemaining = noOfAttempts;
        while (attemptsRemaining > 0)
        {
            attemptsRemaining--;
            var guess = GetGuess();
            if (GuessIsCorrect(guess))
            {
                Console.WriteLine($"You won with {noOfAttempts - attemptsRemaining} attempt(s).");
            }
        }

        Console.WriteLine($"You lost!");
    }

    private static bool GuessIsCorrect(string guess)
    {
        if (guess == Answer)
            return true;
        else
            return false;
    }

    private static string GetAnswer()
    {
        string? answer;
        while (true)
        {
            Console.WriteLine("What is the five-letter secret word? ");
            answer = Console.ReadLine();
            if (answer != null)
                break;
        }
        return answer.Trim().ToUpper();
    }

    private static string GetGuess()
    {
        string? guess;
        while (true)
        {
            Console.WriteLine("What is your guess? ");
            guess = Console.ReadLine();
            if (guess != null)
                break;
        }
        return guess.Trim().ToUpper();
    }
}
