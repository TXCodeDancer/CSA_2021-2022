using WordleEngine;

namespace WordleConsoleUI;

public class Program
{
    private static string Answer = "";
    private static readonly int NoOfAttempts = 6;

    public static void Main()
    {
        WordBank.Setup();
        Answer = GetAnswer();

        //Console.WriteLine($"The secret word is {Answer};");
        //Console.WriteLine($"");
        //Console.WriteLine($"Press any key start game:");
        //Console.ReadLine();

        Console.Clear();

        int attemptsRemaining = NoOfAttempts;
        while (attemptsRemaining > 0)
        {
            var guess = GetGuess(attemptsRemaining);
            attemptsRemaining--;
            if (guess != null)
            {
                Console.WriteLine($"{Grader.GetGrade(Answer, guess)}");
                if (GuessIsCorrect(guess))
                {
                    Console.WriteLine($"Congratulations, you won in {NoOfAttempts - attemptsRemaining} attempt(s).");
                    return;
                }
            }
        }

        Console.WriteLine($"You lost! The correct answer was {Answer}");
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
        string? answer = WordBank.GetRandomWord();
        //while (true)
        //{
        //    Console.WriteLine("What is the five-letter secret word? ");
        //    answer = Console.ReadLine();
        //    if (answer == null)
        //        continue;
        //    if (WordBank.IsValid(answer))
        //        break;
        //    else
        //        Console.WriteLine("That's not a valid word. ");
        //}
        return answer.Trim().ToUpper();
    }

    private static string? GetGuess(int attemptsRemaining)
    {
        string? guess;
        while (true)
        {
            Console.WriteLine(WordBank.GetAvailableLetters());
            Console.WriteLine($"What is your guess? ({attemptsRemaining})");
            guess = Console.ReadLine();
            if (guess == null)
                continue;
            if (WordBank.IsValid(guess))
            {
                WordBank.UpdateAvailableLetters(guess);
                break;
            }
            else
            {
                Console.WriteLine("That's not a valid word. ");
                return null;
            }
        }
        return guess.Trim().ToUpper();
    }
}
