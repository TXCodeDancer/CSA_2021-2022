namespace WordleEngine
{
    public class Grader
    {
        public static string GetGrade(string answer, string guess)
        {
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
