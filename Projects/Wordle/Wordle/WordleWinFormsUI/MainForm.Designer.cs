namespace WordleWinFormsUI
{
    partial class MainForm
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
            this.label1 = new System.Windows.Forms.Label();
            this.CloseButton = new System.Windows.Forms.Button();
            this.GuessPanel = new System.Windows.Forms.Panel();
            this.LetterUsageLabel = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.SubmitButton = new System.Windows.Forms.Button();
            this.GuessTextBox = new System.Windows.Forms.TextBox();
            this.GuessBoxLabel = new System.Windows.Forms.Label();
            this.HeaderPanel.SuspendLayout();
            this.GuessPanel.SuspendLayout();
            this.SuspendLayout();
            // 
            // HeaderPanel
            // 
            this.HeaderPanel.BackColor = System.Drawing.Color.LightGray;
            this.HeaderPanel.Controls.Add(this.label1);
            this.HeaderPanel.Controls.Add(this.CloseButton);
            this.HeaderPanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.HeaderPanel.Location = new System.Drawing.Point(0, 0);
            this.HeaderPanel.Name = "HeaderPanel";
            this.HeaderPanel.Size = new System.Drawing.Size(800, 30);
            this.HeaderPanel.TabIndex = 0;
            this.HeaderPanel.MouseDown += new System.Windows.Forms.MouseEventHandler(this.HeaderPanel_MouseDown);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.label1.Location = new System.Drawing.Point(350, 2);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(77, 25);
            this.label1.TabIndex = 1;
            this.label1.Text = "Wordle";
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
            this.GuessPanel.Controls.Add(this.LetterUsageLabel);
            this.GuessPanel.Controls.Add(this.label2);
            this.GuessPanel.Controls.Add(this.SubmitButton);
            this.GuessPanel.Controls.Add(this.GuessTextBox);
            this.GuessPanel.Controls.Add(this.GuessBoxLabel);
            this.GuessPanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.GuessPanel.Location = new System.Drawing.Point(0, 30);
            this.GuessPanel.Name = "GuessPanel";
            this.GuessPanel.Padding = new System.Windows.Forms.Padding(5, 5, 0, 0);
            this.GuessPanel.Size = new System.Drawing.Size(800, 74);
            this.GuessPanel.TabIndex = 1;
            // 
            // LetterUsageLabel
            // 
            this.LetterUsageLabel.AutoSize = true;
            this.LetterUsageLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.LetterUsageLabel.Location = new System.Drawing.Point(350, 32);
            this.LetterUsageLabel.Name = "LetterUsageLabel";
            this.LetterUsageLabel.Size = new System.Drawing.Size(0, 21);
            this.LetterUsageLabel.TabIndex = 4;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.label2.Location = new System.Drawing.Point(350, 5);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 21);
            this.label2.TabIndex = 3;
            this.label2.Text = "Letter Usage:";
            // 
            // SubmitButton
            // 
            this.SubmitButton.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.SubmitButton.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.SubmitButton.Location = new System.Drawing.Point(118, 32);
            this.SubmitButton.Name = "SubmitButton";
            this.SubmitButton.Size = new System.Drawing.Size(75, 30);
            this.SubmitButton.TabIndex = 2;
            this.SubmitButton.Text = "Submit";
            this.SubmitButton.UseVisualStyleBackColor = false;
            this.SubmitButton.Click += new System.EventHandler(this.SubmitButton_Click);
            // 
            // GuessTextBox
            // 
            this.GuessTextBox.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.GuessTextBox.Location = new System.Drawing.Point(12, 29);
            this.GuessTextBox.Name = "GuessTextBox";
            this.GuessTextBox.Size = new System.Drawing.Size(100, 33);
            this.GuessTextBox.TabIndex = 1;
            this.GuessTextBox.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Input_KeyDown);
            // 
            // GuessBoxLabel
            // 
            this.GuessBoxLabel.AutoSize = true;
            this.GuessBoxLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.GuessBoxLabel.Location = new System.Drawing.Point(8, 5);
            this.GuessBoxLabel.Name = "GuessBoxLabel";
            this.GuessBoxLabel.Size = new System.Drawing.Size(91, 21);
            this.GuessBoxLabel.TabIndex = 0;
            this.GuessBoxLabel.Text = "Your Guess:";
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 629);
            this.Controls.Add(this.GuessPanel);
            this.Controls.Add(this.HeaderPanel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "MainForm";
            this.Text = "MainForm";
            this.HeaderPanel.ResumeLayout(false);
            this.HeaderPanel.PerformLayout();
            this.GuessPanel.ResumeLayout(false);
            this.GuessPanel.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private Panel HeaderPanel;
        private Button CloseButton;
        private Label label1;
        private Panel GuessPanel;
        private Label GuessBoxLabel;
        private Button SubmitButton;
        private TextBox GuessTextBox;
        private Label LetterUsageLabel;
        private Label label2;
    }
}