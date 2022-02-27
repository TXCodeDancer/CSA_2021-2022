namespace WordieEngine
{
    public class Grader
    {
        public static string GetGrade(string answer, string guess)
        {
            if (string.IsNullOrEmpty(answer))
            {
                throw new ArgumentException($"'{nameof(answer)}' cannot be null or empty.", nameof(answer));
            }

            if (string.IsNullOrEmpty(guess))
            {
                throw new ArgumentException($"'{nameof(guess)}' cannot be null or empty.", nameof(guess));
            }

            answer = answer.Trim().ToUpper();
            guess = guess.Trim().ToUpper();
            string grade = "";
            for (int i = 0; i < guess.Length; i++)
            {
                if (guess[i] == answer[i])
                    grade += '*';
                else if (answer.Contains(guess[i]))
                    grade += '@';
                else
                    grade += '-';
            }

            return grade;
        }
    }
}
