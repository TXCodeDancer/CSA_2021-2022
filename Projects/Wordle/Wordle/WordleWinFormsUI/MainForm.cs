using System.Runtime.InteropServices;
using WordleEngine;

namespace WordleWinFormsUI;

public partial class MainForm : Form
{
    public MainForm()
    {
        InitializeComponent();
        WordBank.Setup();
        LetterUsageLabel.Text = WordBank.GetAvailableLetters();
        GuessTextBox.Text = "";
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
}
