using System.Runtime.InteropServices;
using WordleEngine;

namespace WordleWinFormsUI;

public partial class MainForm : Form
{
    private static string Answer = "";
    private static readonly int MaxAttempts = 6;
    private static int Attempts = 0;

    public MainForm()
    {
        InitializeComponent();
        StartGame();
    }

    private void StartGame()
    {
        WordBank.Setup();
        LetterUsageLabel.Text = WordBank.GetAvailableLetters();
        GuessTextBox.Text = "";
        Answer = WordBank.GetRandomWord().ToUpper();
        SubmitButton.Visible = false;
    }

    public const int WM_NCLBUTTONDOWN = 0xA1;
    public const int HT_CAPTION = 0x2;

    [DllImportAttribute("user32.dll")]
    private static extern int SendMessage(IntPtr hWnd,
                     int Msg, int wParam, int lParam);

    [DllImportAttribute("user32.dll")]
    private static extern bool ReleaseCapture();

    private void HeaderPanel_MouseDown(object sender, MouseEventArgs e)
    {
        if (e.Button == MouseButtons.Left)
        {
            ReleaseCapture();
            _ = SendMessage(Handle, WM_NCLBUTTONDOWN, HT_CAPTION, 0);
        }
    }

    private void CloseButton_Click(object sender, EventArgs e)
    {
        Application.Exit();
    }

    private void SubmitButton_Click(object sender, EventArgs e)
    {
        string guess = GuessTextBox.Text;
        guess = guess.Trim().ToUpper();
        if (WordBank.IsValid(guess))
        {
            Attempts++;
            UpdateGuessBoxes(guess);
            WordBank.UpdateAvailableLetters(guess);
            LetterUsageLabel.Text = WordBank.GetAvailableLetters();
            GuessTextBox.Text = "";
            if (GuessIsCorrect(guess) || Attempts >= MaxAttempts)
            {
                SubmitButton.Enabled = false;
                GuessTextBox.Enabled = false;
            }
        }
        else
        {
            GuessTextBox.Text = "Invalid";
            GuessTextBox.SelectAll();
        }
    }

    private static bool GuessIsCorrect(string guess)
    {
        if (guess == Answer)
            return true;
        else
            return false;
    }

    private void UpdateGuessBoxes(string guess)
    {
        var grade = Grader.GetGrade(Answer, guess);

        switch (Attempts)
        {
            case 1:
                UpdateGuessBox(textBox1_1, guess[0], grade[0]);
                UpdateGuessBox(textBox1_2, guess[1], grade[1]);
                UpdateGuessBox(textBox1_3, guess[2], grade[2]);
                UpdateGuessBox(textBox1_4, guess[3], grade[3]);
                UpdateGuessBox(textBox1_5, guess[4], grade[4]);
                break;

            case 2:
                UpdateGuessBox(textBox2_1, guess[0], grade[0]);
                UpdateGuessBox(textBox2_2, guess[1], grade[1]);
                UpdateGuessBox(textBox2_3, guess[2], grade[2]);
                UpdateGuessBox(textBox2_4, guess[3], grade[3]);
                UpdateGuessBox(textBox2_5, guess[4], grade[4]);
                break;

            case 3:
                UpdateGuessBox(textBox3_1, guess[0], grade[0]);
                UpdateGuessBox(textBox3_2, guess[1], grade[1]);
                UpdateGuessBox(textBox3_3, guess[2], grade[2]);
                UpdateGuessBox(textBox3_4, guess[3], grade[3]);
                UpdateGuessBox(textBox3_5, guess[4], grade[4]);
                break;

            case 4:
                UpdateGuessBox(textBox4_1, guess[0], grade[0]);
                UpdateGuessBox(textBox4_2, guess[1], grade[1]);
                UpdateGuessBox(textBox4_3, guess[2], grade[2]);
                UpdateGuessBox(textBox4_4, guess[3], grade[3]);
                UpdateGuessBox(textBox4_5, guess[4], grade[4]);
                break;

            case 5:
                UpdateGuessBox(textBox5_1, guess[0], grade[0]);
                UpdateGuessBox(textBox5_2, guess[1], grade[1]);
                UpdateGuessBox(textBox5_3, guess[2], grade[2]);
                UpdateGuessBox(textBox5_4, guess[3], grade[3]);
                UpdateGuessBox(textBox5_5, guess[4], grade[4]);
                break;

            case 6:
                UpdateGuessBox(textBox6_1, guess[0], grade[0]);
                UpdateGuessBox(textBox6_2, guess[1], grade[1]);
                UpdateGuessBox(textBox6_3, guess[2], grade[2]);
                UpdateGuessBox(textBox6_4, guess[3], grade[3]);
                UpdateGuessBox(textBox6_5, guess[4], grade[4]);
                break;

            default:
                break;
        }
    }

    private static void UpdateGuessBox(TextBox textBox, char guess, char grade)
    {
        textBox.Text = guess.ToString();
        if (grade == '*')
            textBox.BackColor = Color.Green;
        else if (grade == '@')
            textBox.BackColor = Color.Yellow;
    }

    private void Input_KeyDown(object sender, KeyEventArgs e)
    {
        if (e.KeyData == Keys.Enter)
        {
            SubmitButton_Click(sender, e);
        }
    }

    private void RestartButton_Click(object sender, EventArgs e)
    {
        StartGame();
    }
}
