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
        Answer = WordBank.GetRandomWord();
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
            if (Attempts >= MaxAttempts)
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

    private void UpdateGuessBoxes(string guess)
    {
        switch (Attempts)
        {
            case 1:
                textBox1_1.Text = guess[0].ToString();
                textBox1_2.Text = guess[1].ToString();
                textBox1_3.Text = guess[2].ToString();
                textBox1_4.Text = guess[3].ToString();
                textBox1_5.Text = guess[4].ToString();
                break;

            case 2:
                textBox2_1.Text = guess[0].ToString();
                textBox2_2.Text = guess[1].ToString();
                textBox2_3.Text = guess[2].ToString();
                textBox2_4.Text = guess[3].ToString();
                textBox2_5.Text = guess[4].ToString();
                break;

            case 3:
                textBox3_1.Text = guess[0].ToString();
                textBox3_2.Text = guess[1].ToString();
                textBox3_3.Text = guess[2].ToString();
                textBox3_4.Text = guess[3].ToString();
                textBox3_5.Text = guess[4].ToString();
                break;

            case 4:
                textBox4_1.Text = guess[0].ToString();
                textBox4_2.Text = guess[1].ToString();
                textBox4_3.Text = guess[2].ToString();
                textBox4_4.Text = guess[3].ToString();
                textBox4_5.Text = guess[4].ToString();
                break;

            case 5:
                textBox5_1.Text = guess[0].ToString();
                textBox5_2.Text = guess[1].ToString();
                textBox5_3.Text = guess[2].ToString();
                textBox5_4.Text = guess[3].ToString();
                textBox5_5.Text = guess[4].ToString();
                break;

            case 6:
                textBox6_1.Text = guess[0].ToString();
                textBox6_2.Text = guess[1].ToString();
                textBox6_3.Text = guess[2].ToString();
                textBox6_4.Text = guess[3].ToString();
                textBox6_5.Text = guess[4].ToString();
                break;

            default:
                break;
        }
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
