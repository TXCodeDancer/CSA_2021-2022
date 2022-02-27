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
            WordBank.UpdateAvailableLetters(guess);
            LetterUsageLabel.Text = WordBank.GetAvailableLetters();
            GuessTextBox.Text = "";
            Attempts++;
            if (Attempts > MaxAttempts)
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
