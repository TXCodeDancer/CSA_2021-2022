namespace WordieWinFormsUI
{
    partial class PlayForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.HeaderPanel = new System.Windows.Forms.Panel();
            this.HeaderLabel = new System.Windows.Forms.Label();
            this.CloseButton = new System.Windows.Forms.Button();
            this.GuessPanel = new System.Windows.Forms.Panel();
            this.RestartButton = new System.Windows.Forms.Button();
            this.LetterUsageLabel = new System.Windows.Forms.Label();
            this.UnusedLettersLabel = new System.Windows.Forms.Label();
            this.GuessTextBox = new System.Windows.Forms.TextBox();
            this.GuessBoxLabel = new System.Windows.Forms.Label();
            this.panel0 = new System.Windows.Forms.Panel();
            this.AnswerLabel = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.textBox1_5 = new System.Windows.Forms.TextBox();
            this.textBox1_4 = new System.Windows.Forms.TextBox();
            this.textBox1_3 = new System.Windows.Forms.TextBox();
            this.textBox1_2 = new System.Windows.Forms.TextBox();
            this.textBox1_1 = new System.Windows.Forms.TextBox();
            this.panel2 = new System.Windows.Forms.Panel();
            this.textBox6_5 = new System.Windows.Forms.TextBox();
            this.textBox6_4 = new System.Windows.Forms.TextBox();
            this.textBox6_3 = new System.Windows.Forms.TextBox();
            this.textBox6_2 = new System.Windows.Forms.TextBox();
            this.textBox6_1 = new System.Windows.Forms.TextBox();
            this.panel3 = new System.Windows.Forms.Panel();
            this.textBox5_5 = new System.Windows.Forms.TextBox();
            this.textBox5_4 = new System.Windows.Forms.TextBox();
            this.textBox5_3 = new System.Windows.Forms.TextBox();
            this.textBox5_2 = new System.Windows.Forms.TextBox();
            this.textBox5_1 = new System.Windows.Forms.TextBox();
            this.panel4 = new System.Windows.Forms.Panel();
            this.textBox4_5 = new System.Windows.Forms.TextBox();
            this.textBox4_4 = new System.Windows.Forms.TextBox();
            this.textBox4_3 = new System.Windows.Forms.TextBox();
            this.textBox4_2 = new System.Windows.Forms.TextBox();
            this.textBox4_1 = new System.Windows.Forms.TextBox();
            this.panel5 = new System.Windows.Forms.Panel();
            this.textBox3_5 = new System.Windows.Forms.TextBox();
            this.textBox3_4 = new System.Windows.Forms.TextBox();
            this.textBox3_3 = new System.Windows.Forms.TextBox();
            this.textBox3_2 = new System.Windows.Forms.TextBox();
            this.textBox3_1 = new System.Windows.Forms.TextBox();
            this.panel6 = new System.Windows.Forms.Panel();
            this.textBox2_5 = new System.Windows.Forms.TextBox();
            this.textBox2_4 = new System.Windows.Forms.TextBox();
            this.textBox2_3 = new System.Windows.Forms.TextBox();
            this.textBox2_2 = new System.Windows.Forms.TextBox();
            this.textBox2_1 = new System.Windows.Forms.TextBox();
            this.HeaderPanel.SuspendLayout();
            this.GuessPanel.SuspendLayout();
            this.panel0.SuspendLayout();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.panel4.SuspendLayout();
            this.panel5.SuspendLayout();
            this.panel6.SuspendLayout();
            this.SuspendLayout();
            // 
            // HeaderPanel
            // 
            this.HeaderPanel.BackColor = System.Drawing.Color.LightGray;
            this.HeaderPanel.Controls.Add(this.HeaderLabel);
            this.HeaderPanel.Controls.Add(this.CloseButton);
            this.HeaderPanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.HeaderPanel.Location = new System.Drawing.Point(0, 0);
            this.HeaderPanel.Name = "HeaderPanel";
            this.HeaderPanel.Size = new System.Drawing.Size(800, 30);
            this.HeaderPanel.TabIndex = 0;
            this.HeaderPanel.MouseDown += new System.Windows.Forms.MouseEventHandler(this.HeaderPanel_MouseDown);
            // 
            // HeaderLabel
            // 
            this.HeaderLabel.AutoSize = true;
            this.HeaderLabel.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.HeaderLabel.Location = new System.Drawing.Point(350, 2);
            this.HeaderLabel.Name = "HeaderLabel";
            this.HeaderLabel.Size = new System.Drawing.Size(77, 25);
            this.HeaderLabel.TabIndex = 1;
            this.HeaderLabel.Text = "Wordie";
            // 
            // CloseButton
            // 
            this.CloseButton.BackColor = System.Drawing.Color.LightGray;
            this.CloseButton.Dock = System.Windows.Forms.DockStyle.Right;
            this.CloseButton.FlatAppearance.BorderSize = 0;
            this.CloseButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.CloseButton.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.CloseButton.Location = new System.Drawing.Point(770, 0);
            this.CloseButton.Name = "CloseButton";
            this.CloseButton.Size = new System.Drawing.Size(30, 30);
            this.CloseButton.TabIndex = 0;
            this.CloseButton.Text = "X";
            this.CloseButton.UseVisualStyleBackColor = false;
            this.CloseButton.Click += new System.EventHandler(this.CloseButton_Click);
            // 
            // GuessPanel
            // 
            this.GuessPanel.Controls.Add(this.RestartButton);
            this.GuessPanel.Controls.Add(this.LetterUsageLabel);
            this.GuessPanel.Controls.Add(this.UnusedLettersLabel);
            this.GuessPanel.Controls.Add(this.GuessTextBox);
            this.GuessPanel.Controls.Add(this.GuessBoxLabel);
            this.GuessPanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.GuessPanel.Location = new System.Drawing.Point(0, 30);
            this.GuessPanel.Name = "GuessPanel";
            this.GuessPanel.Padding = new System.Windows.Forms.Padding(5, 5, 0, 0);
            this.GuessPanel.Size = new System.Drawing.Size(800, 74);
            this.GuessPanel.TabIndex = 1;
            // 
            // RestartButton
            // 
            this.RestartButton.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.RestartButton.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.RestartButton.Location = new System.Drawing.Point(713, 6);
            this.RestartButton.Name = "RestartButton";
            this.RestartButton.Size = new System.Drawing.Size(75, 30);
            this.RestartButton.TabIndex = 5;
            this.RestartButton.Text = "Restart";
            this.RestartButton.UseVisualStyleBackColor = false;
            this.RestartButton.Click += new System.EventHandler(this.RestartButton_Click);
            // 
            // LetterUsageLabel
            // 
            this.LetterUsageLabel.AutoSize = true;
            this.LetterUsageLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.LetterUsageLabel.Location = new System.Drawing.Point(300, 45);
            this.LetterUsageLabel.Name = "LetterUsageLabel";
            this.LetterUsageLabel.Size = new System.Drawing.Size(0, 21);
            this.LetterUsageLabel.TabIndex = 4;
            // 
            // UnusedLettersLabel
            // 
            this.UnusedLettersLabel.AutoSize = true;
            this.UnusedLettersLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.UnusedLettersLabel.Location = new System.Drawing.Point(300, 22);
            this.UnusedLettersLabel.Name = "UnusedLettersLabel";
            this.UnusedLettersLabel.Size = new System.Drawing.Size(117, 21);
            this.UnusedLettersLabel.TabIndex = 3;
            this.UnusedLettersLabel.Text = "Unused Letters:";
            // 
            // GuessTextBox
            // 
            this.GuessTextBox.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.GuessTextBox.Location = new System.Drawing.Point(86, 40);
            this.GuessTextBox.Name = "GuessTextBox";
            this.GuessTextBox.Size = new System.Drawing.Size(100, 33);
            this.GuessTextBox.TabIndex = 1;
            this.GuessTextBox.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Input_KeyDown);
            // 
            // GuessBoxLabel
            // 
            this.GuessBoxLabel.AutoSize = true;
            this.GuessBoxLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.GuessBoxLabel.Location = new System.Drawing.Point(86, 16);
            this.GuessBoxLabel.Name = "GuessBoxLabel";
            this.GuessBoxLabel.Size = new System.Drawing.Size(91, 21);
            this.GuessBoxLabel.TabIndex = 0;
            this.GuessBoxLabel.Text = "Your Guess:";
            // 
            // panel0
            // 
            this.panel0.Controls.Add(this.AnswerLabel);
            this.panel0.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel0.Location = new System.Drawing.Point(0, 104);
            this.panel0.Name = "panel0";
            this.panel0.Size = new System.Drawing.Size(800, 56);
            this.panel0.TabIndex = 2;
            // 
            // AnswerLabel
            // 
            this.AnswerLabel.AutoSize = true;
            this.AnswerLabel.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.AnswerLabel.Location = new System.Drawing.Point(258, 21);
            this.AnswerLabel.Name = "AnswerLabel";
            this.AnswerLabel.Size = new System.Drawing.Size(0, 32);
            this.AnswerLabel.TabIndex = 0;
            this.AnswerLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.textBox1_5);
            this.panel1.Controls.Add(this.textBox1_4);
            this.panel1.Controls.Add(this.textBox1_3);
            this.panel1.Controls.Add(this.textBox1_2);
            this.panel1.Controls.Add(this.textBox1_1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 160);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 68);
            this.panel1.TabIndex = 3;
            // 
            // textBox1_5
            // 
            this.textBox1_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox1_5.Location = new System.Drawing.Point(450, 22);
            this.textBox1_5.Name = "textBox1_5";
            this.textBox1_5.Size = new System.Drawing.Size(42, 43);
            this.textBox1_5.TabIndex = 4;
            this.textBox1_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox1_4
            // 
            this.textBox1_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox1_4.Location = new System.Drawing.Point(402, 22);
            this.textBox1_4.Name = "textBox1_4";
            this.textBox1_4.Size = new System.Drawing.Size(42, 43);
            this.textBox1_4.TabIndex = 3;
            this.textBox1_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox1_3
            // 
            this.textBox1_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox1_3.Location = new System.Drawing.Point(354, 22);
            this.textBox1_3.Name = "textBox1_3";
            this.textBox1_3.Size = new System.Drawing.Size(42, 43);
            this.textBox1_3.TabIndex = 2;
            this.textBox1_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox1_2
            // 
            this.textBox1_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox1_2.Location = new System.Drawing.Point(306, 22);
            this.textBox1_2.Name = "textBox1_2";
            this.textBox1_2.Size = new System.Drawing.Size(42, 43);
            this.textBox1_2.TabIndex = 1;
            this.textBox1_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox1_1
            // 
            this.textBox1_1.BackColor = System.Drawing.Color.White;
            this.textBox1_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox1_1.Location = new System.Drawing.Point(258, 22);
            this.textBox1_1.Name = "textBox1_1";
            this.textBox1_1.Size = new System.Drawing.Size(42, 43);
            this.textBox1_1.TabIndex = 0;
            this.textBox1_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.textBox6_5);
            this.panel2.Controls.Add(this.textBox6_4);
            this.panel2.Controls.Add(this.textBox6_3);
            this.panel2.Controls.Add(this.textBox6_2);
            this.panel2.Controls.Add(this.textBox6_1);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel2.Location = new System.Drawing.Point(0, 500);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(800, 68);
            this.panel2.TabIndex = 5;
            // 
            // textBox6_5
            // 
            this.textBox6_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox6_5.Location = new System.Drawing.Point(450, 22);
            this.textBox6_5.Name = "textBox6_5";
            this.textBox6_5.Size = new System.Drawing.Size(42, 43);
            this.textBox6_5.TabIndex = 4;
            this.textBox6_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox6_4
            // 
            this.textBox6_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox6_4.Location = new System.Drawing.Point(402, 22);
            this.textBox6_4.Name = "textBox6_4";
            this.textBox6_4.Size = new System.Drawing.Size(42, 43);
            this.textBox6_4.TabIndex = 3;
            this.textBox6_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox6_3
            // 
            this.textBox6_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox6_3.Location = new System.Drawing.Point(354, 22);
            this.textBox6_3.Name = "textBox6_3";
            this.textBox6_3.Size = new System.Drawing.Size(42, 43);
            this.textBox6_3.TabIndex = 2;
            this.textBox6_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox6_2
            // 
            this.textBox6_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox6_2.Location = new System.Drawing.Point(306, 22);
            this.textBox6_2.Name = "textBox6_2";
            this.textBox6_2.Size = new System.Drawing.Size(42, 43);
            this.textBox6_2.TabIndex = 1;
            this.textBox6_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox6_1
            // 
            this.textBox6_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox6_1.Location = new System.Drawing.Point(258, 22);
            this.textBox6_1.Name = "textBox6_1";
            this.textBox6_1.Size = new System.Drawing.Size(42, 43);
            this.textBox6_1.TabIndex = 0;
            this.textBox6_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.textBox5_5);
            this.panel3.Controls.Add(this.textBox5_4);
            this.panel3.Controls.Add(this.textBox5_3);
            this.panel3.Controls.Add(this.textBox5_2);
            this.panel3.Controls.Add(this.textBox5_1);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel3.Location = new System.Drawing.Point(0, 432);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(800, 68);
            this.panel3.TabIndex = 5;
            // 
            // textBox5_5
            // 
            this.textBox5_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox5_5.Location = new System.Drawing.Point(450, 22);
            this.textBox5_5.Name = "textBox5_5";
            this.textBox5_5.Size = new System.Drawing.Size(42, 43);
            this.textBox5_5.TabIndex = 4;
            this.textBox5_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox5_4
            // 
            this.textBox5_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox5_4.Location = new System.Drawing.Point(402, 22);
            this.textBox5_4.Name = "textBox5_4";
            this.textBox5_4.Size = new System.Drawing.Size(42, 43);
            this.textBox5_4.TabIndex = 3;
            this.textBox5_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox5_3
            // 
            this.textBox5_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox5_3.Location = new System.Drawing.Point(354, 22);
            this.textBox5_3.Name = "textBox5_3";
            this.textBox5_3.Size = new System.Drawing.Size(42, 43);
            this.textBox5_3.TabIndex = 2;
            this.textBox5_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox5_2
            // 
            this.textBox5_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox5_2.Location = new System.Drawing.Point(306, 22);
            this.textBox5_2.Name = "textBox5_2";
            this.textBox5_2.Size = new System.Drawing.Size(42, 43);
            this.textBox5_2.TabIndex = 1;
            this.textBox5_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox5_1
            // 
            this.textBox5_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox5_1.Location = new System.Drawing.Point(258, 22);
            this.textBox5_1.Name = "textBox5_1";
            this.textBox5_1.Size = new System.Drawing.Size(42, 43);
            this.textBox5_1.TabIndex = 0;
            this.textBox5_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.textBox4_5);
            this.panel4.Controls.Add(this.textBox4_4);
            this.panel4.Controls.Add(this.textBox4_3);
            this.panel4.Controls.Add(this.textBox4_2);
            this.panel4.Controls.Add(this.textBox4_1);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel4.Location = new System.Drawing.Point(0, 364);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(800, 68);
            this.panel4.TabIndex = 5;
            // 
            // textBox4_5
            // 
            this.textBox4_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox4_5.Location = new System.Drawing.Point(450, 22);
            this.textBox4_5.Name = "textBox4_5";
            this.textBox4_5.Size = new System.Drawing.Size(42, 43);
            this.textBox4_5.TabIndex = 4;
            this.textBox4_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox4_4
            // 
            this.textBox4_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox4_4.Location = new System.Drawing.Point(402, 22);
            this.textBox4_4.Name = "textBox4_4";
            this.textBox4_4.Size = new System.Drawing.Size(42, 43);
            this.textBox4_4.TabIndex = 3;
            this.textBox4_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox4_3
            // 
            this.textBox4_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox4_3.Location = new System.Drawing.Point(354, 22);
            this.textBox4_3.Name = "textBox4_3";
            this.textBox4_3.Size = new System.Drawing.Size(42, 43);
            this.textBox4_3.TabIndex = 2;
            this.textBox4_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox4_2
            // 
            this.textBox4_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox4_2.Location = new System.Drawing.Point(306, 22);
            this.textBox4_2.Name = "textBox4_2";
            this.textBox4_2.Size = new System.Drawing.Size(42, 43);
            this.textBox4_2.TabIndex = 1;
            this.textBox4_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox4_1
            // 
            this.textBox4_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox4_1.Location = new System.Drawing.Point(258, 22);
            this.textBox4_1.Name = "textBox4_1";
            this.textBox4_1.Size = new System.Drawing.Size(42, 43);
            this.textBox4_1.TabIndex = 0;
            this.textBox4_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.textBox3_5);
            this.panel5.Controls.Add(this.textBox3_4);
            this.panel5.Controls.Add(this.textBox3_3);
            this.panel5.Controls.Add(this.textBox3_2);
            this.panel5.Controls.Add(this.textBox3_1);
            this.panel5.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel5.Location = new System.Drawing.Point(0, 296);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(800, 68);
            this.panel5.TabIndex = 5;
            // 
            // textBox3_5
            // 
            this.textBox3_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox3_5.Location = new System.Drawing.Point(450, 22);
            this.textBox3_5.Name = "textBox3_5";
            this.textBox3_5.Size = new System.Drawing.Size(42, 43);
            this.textBox3_5.TabIndex = 4;
            this.textBox3_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox3_4
            // 
            this.textBox3_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox3_4.Location = new System.Drawing.Point(402, 22);
            this.textBox3_4.Name = "textBox3_4";
            this.textBox3_4.Size = new System.Drawing.Size(42, 43);
            this.textBox3_4.TabIndex = 3;
            this.textBox3_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox3_3
            // 
            this.textBox3_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox3_3.Location = new System.Drawing.Point(354, 22);
            this.textBox3_3.Name = "textBox3_3";
            this.textBox3_3.Size = new System.Drawing.Size(42, 43);
            this.textBox3_3.TabIndex = 2;
            this.textBox3_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox3_2
            // 
            this.textBox3_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox3_2.Location = new System.Drawing.Point(306, 22);
            this.textBox3_2.Name = "textBox3_2";
            this.textBox3_2.Size = new System.Drawing.Size(42, 43);
            this.textBox3_2.TabIndex = 1;
            this.textBox3_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox3_1
            // 
            this.textBox3_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox3_1.Location = new System.Drawing.Point(258, 22);
            this.textBox3_1.Name = "textBox3_1";
            this.textBox3_1.Size = new System.Drawing.Size(42, 43);
            this.textBox3_1.TabIndex = 0;
            this.textBox3_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // panel6
            // 
            this.panel6.Controls.Add(this.textBox2_5);
            this.panel6.Controls.Add(this.textBox2_4);
            this.panel6.Controls.Add(this.textBox2_3);
            this.panel6.Controls.Add(this.textBox2_2);
            this.panel6.Controls.Add(this.textBox2_1);
            this.panel6.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel6.Location = new System.Drawing.Point(0, 228);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(800, 68);
            this.panel6.TabIndex = 5;
            // 
            // textBox2_5
            // 
            this.textBox2_5.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox2_5.Location = new System.Drawing.Point(450, 22);
            this.textBox2_5.Name = "textBox2_5";
            this.textBox2_5.Size = new System.Drawing.Size(42, 43);
            this.textBox2_5.TabIndex = 4;
            this.textBox2_5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox2_4
            // 
            this.textBox2_4.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox2_4.Location = new System.Drawing.Point(402, 22);
            this.textBox2_4.Name = "textBox2_4";
            this.textBox2_4.Size = new System.Drawing.Size(42, 43);
            this.textBox2_4.TabIndex = 3;
            this.textBox2_4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox2_3
            // 
            this.textBox2_3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox2_3.Location = new System.Drawing.Point(354, 22);
            this.textBox2_3.Name = "textBox2_3";
            this.textBox2_3.Size = new System.Drawing.Size(42, 43);
            this.textBox2_3.TabIndex = 2;
            this.textBox2_3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox2_2
            // 
            this.textBox2_2.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox2_2.Location = new System.Drawing.Point(306, 22);
            this.textBox2_2.Name = "textBox2_2";
            this.textBox2_2.Size = new System.Drawing.Size(42, 43);
            this.textBox2_2.TabIndex = 1;
            this.textBox2_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // textBox2_1
            // 
            this.textBox2_1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.textBox2_1.Location = new System.Drawing.Point(258, 22);
            this.textBox2_1.Name = "textBox2_1";
            this.textBox2_1.Size = new System.Drawing.Size(42, 43);
            this.textBox2_1.TabIndex = 0;
            this.textBox2_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // PlayForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 629);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel4);
            this.Controls.Add(this.panel5);
            this.Controls.Add(this.panel6);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.panel0);
            this.Controls.Add(this.GuessPanel);
            this.Controls.Add(this.HeaderPanel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "PlayForm";
            this.Text = "MainForm";
            this.HeaderPanel.ResumeLayout(false);
            this.HeaderPanel.PerformLayout();
            this.GuessPanel.ResumeLayout(false);
            this.GuessPanel.PerformLayout();
            this.panel0.ResumeLayout(false);
            this.panel0.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.panel5.ResumeLayout(false);
            this.panel5.PerformLayout();
            this.panel6.ResumeLayout(false);
            this.panel6.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private Panel HeaderPanel;
        private Button CloseButton;
        private Label HeaderLabel;
        private Panel GuessPanel;
        private Label GuessBoxLabel;
        private TextBox GuessTextBox;
        private Label LetterUsageLabel;
        private Label UnusedLettersLabel;
        private Button RestartButton;
        private Panel panel0;
        private Panel panel1;
        private TextBox textBox1_5;
        private TextBox textBox1_4;
        private TextBox textBox1_3;
        private TextBox textBox1_2;
        private TextBox textBox1_1;
        private Panel panel2;
        private TextBox textBox6_5;
        private TextBox textBox6_4;
        private TextBox textBox6_3;
        private TextBox textBox6_2;
        private TextBox textBox6_1;
        private Panel panel3;
        private TextBox textBox5_5;
        private TextBox textBox5_4;
        private TextBox textBox5_3;
        private TextBox textBox5_2;
        private TextBox textBox5_1;
        private Panel panel4;
        private TextBox textBox4_5;
        private TextBox textBox4_4;
        private TextBox textBox4_3;
        private TextBox textBox4_2;
        private TextBox textBox4_1;
        private Panel panel5;
        private TextBox textBox3_5;
        private TextBox textBox3_4;
        private TextBox textBox3_3;
        private TextBox textBox3_2;
        private TextBox textBox3_1;
        private Panel panel6;
        private TextBox textBox2_5;
        private TextBox textBox2_4;
        private TextBox textBox2_3;
        private TextBox textBox2_2;
        private TextBox textBox2_1;
        private Label AnswerLabel;
    }
}