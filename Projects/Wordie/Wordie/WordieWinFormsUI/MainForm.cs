using System.Runtime.InteropServices;
using WordieEngine;

namespace WordieWinFormsUI;

public partial class MainForm : Form
{
    private static string Answer = "";
    private static readonly int MaxAttempts = 6;
    private static int Attempts = 0;

    public MainForm()
    {
        InitializeComponent();
        StartGame();
        SetReadOnly();
    }

    private void SetReadOnly()
    {
        textBox1_1.ReadOnly = true;
        textBox1_2.ReadOnly = true;
        textBox1_3.ReadOnly = true;
        textBox1_4.ReadOnly = true;
        textBox1_5.ReadOnly = true;

        textBox2_1.ReadOnly = true;
        textBox2_2.ReadOnly = true;
        textBox2_3.ReadOnly = true;
        textBox2_4.ReadOnly = true;
        textBox2_5.ReadOnly = true;

        textBox3_1.ReadOnly = true;
        textBox3_2.ReadOnly = true;
        textBox3_3.ReadOnly = true;
        textBox3_4.ReadOnly = true;
        textBox3_5.ReadOnly = true;

        textBox4_1.ReadOnly = true;
        textBox4_2.ReadOnly = true;
        textBox4_3.ReadOnly = true;
        textBox4_4.ReadOnly = true;
        textBox4_5.ReadOnly = true;

        textBox5_1.ReadOnly = true;
        textBox5_2.ReadOnly = true;
        textBox5_3.ReadOnly = true;
        textBox5_4.ReadOnly = true;
        textBox5_5.ReadOnly = true;

        textBox6_1.ReadOnly = true;
        textBox6_2.ReadOnly = true;
        textBox6_3.ReadOnly = true;
        textBox6_4.ReadOnly = true;
        textBox6_5.ReadOnly = true;
    }

    private void ClearGuesses()
    {
        textBox1_1.Text = "";
        textBox1_2.Text = "";
        textBox1_3.Text = "";
        textBox1_4.Text = "";
        textBox1_5.Text = "";
        textBox2_1.Text = "";
        textBox2_2.Text = "";
        textBox2_3.Text = "";
        textBox2_4.Text = "";
        textBox2_5.Text = "";
        textBox3_1.Text = "";
        textBox3_2.Text = "";
        textBox3_3.Text = "";
        textBox3_4.Text = "";
        textBox3_5.Text = "";
        textBox4_1.Text = "";
        textBox4_2.Text = "";
        textBox4_3.Text = "";
        textBox4_4.Text = "";
        textBox4_5.Text = "";
        textBox5_1.Text = "";
        textBox5_2.Text = "";
        textBox5_3.Text = "";
        textBox5_4.Text = "";
        textBox5_5.Text = "";
        textBox6_1.Text = "";
        textBox6_2.Text = "";
        textBox6_3.Text = "";
        textBox6_4.Text = "";
        textBox6_5.Text = "";

        textBox1_1.BackColor = Color.WhiteSmoke;
        textBox1_2.BackColor = Color.WhiteSmoke;
        textBox1_3.BackColor = Color.WhiteSmoke;
        textBox1_4.BackColor = Color.WhiteSmoke;
        textBox1_5.BackColor = Color.WhiteSmoke;
        textBox2_1.BackColor = Color.WhiteSmoke;
        textBox2_2.BackColor = Color.WhiteSmoke;
        textBox2_3.BackColor = Color.WhiteSmoke;
        textBox2_4.BackColor = Color.WhiteSmoke;
        textBox2_5.BackColor = Color.WhiteSmoke;
        textBox3_1.BackColor = Color.WhiteSmoke;
        textBox3_2.BackColor = Color.WhiteSmoke;
        textBox3_3.BackColor = Color.WhiteSmoke;
        textBox3_4.BackColor = Color.WhiteSmoke;
        textBox3_5.BackColor = Color.WhiteSmoke;
        textBox4_1.BackColor = Color.WhiteSmoke;
        textBox4_2.BackColor = Color.WhiteSmoke;
        textBox4_3.BackColor = Color.WhiteSmoke;
        textBox4_4.BackColor = Color.WhiteSmoke;
        textBox4_5.BackColor = Color.WhiteSmoke;
        textBox5_1.BackColor = Color.WhiteSmoke;
        textBox5_2.BackColor = Color.WhiteSmoke;
        textBox5_3.BackColor = Color.WhiteSmoke;
        textBox5_4.BackColor = Color.WhiteSmoke;
        textBox5_5.BackColor = Color.WhiteSmoke;
        textBox6_1.BackColor = Color.WhiteSmoke;
        textBox6_2.BackColor = Color.WhiteSmoke;
        textBox6_3.BackColor = Color.WhiteSmoke;
        textBox6_4.BackColor = Color.WhiteSmoke;
        textBox6_5.BackColor = Color.WhiteSmoke;
    }

    private void StartGame()
    {
        WordBank.Setup();
        LetterUsageLabel.Text = WordBank.GetAvailableLetters();
        GuessTextBox.Text = "";
        Answer = WordBank.GetRandomWord().ToUpper();
        SubmitButton.Visible = false;
        ClearGuesses();
        SubmitButton.Enabled = true;
        GuessTextBox.Enabled = true;
        Attempts = 0;
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
