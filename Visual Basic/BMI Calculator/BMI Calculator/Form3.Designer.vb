<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmHeight
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmHeight))
        Me.radCentimeters = New System.Windows.Forms.RadioButton()
        Me.radInches = New System.Windows.Forms.RadioButton()
        Me.btnConvert = New System.Windows.Forms.Button()
        Me.radFeet = New System.Windows.Forms.RadioButton()
        Me.radFeet2 = New System.Windows.Forms.RadioButton()
        Me.btnConvert2 = New System.Windows.Forms.Button()
        Me.NumericUpDown1 = New System.Windows.Forms.NumericUpDown()
        Me.NumericUpDown2 = New System.Windows.Forms.NumericUpDown()
        Me.lblSingleQuote = New System.Windows.Forms.Label()
        Me.lblDoublequote = New System.Windows.Forms.Label()
        Me.lblAnswer = New System.Windows.Forms.Label()
        Me.btnReset = New System.Windows.Forms.Button()
        Me.NumericUpDown3 = New System.Windows.Forms.NumericUpDown()
        Me.lblUnit = New System.Windows.Forms.Label()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.picLockButton = New System.Windows.Forms.PictureBox()
        Me.picVolumeUp = New System.Windows.Forms.PictureBox()
        Me.picVolumeDown = New System.Windows.Forms.PictureBox()
        Me.picHomeButton = New System.Windows.Forms.PictureBox()
        CType(Me.NumericUpDown1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.NumericUpDown2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.NumericUpDown3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picLockButton, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'radCentimeters
        '
        Me.radCentimeters.AutoSize = True
        Me.radCentimeters.BackColor = System.Drawing.Color.Transparent
        Me.radCentimeters.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.radCentimeters.Location = New System.Drawing.Point(56, 223)
        Me.radCentimeters.Name = "radCentimeters"
        Me.radCentimeters.Size = New System.Drawing.Size(159, 20)
        Me.radCentimeters.TabIndex = 1
        Me.radCentimeters.TabStop = True
        Me.radCentimeters.Text = "Centimeters To Inches"
        Me.radCentimeters.UseVisualStyleBackColor = False
        '
        'radInches
        '
        Me.radInches.AutoSize = True
        Me.radInches.BackColor = System.Drawing.Color.Transparent
        Me.radInches.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!)
        Me.radInches.Location = New System.Drawing.Point(223, 223)
        Me.radInches.Name = "radInches"
        Me.radInches.Size = New System.Drawing.Size(159, 20)
        Me.radInches.TabIndex = 2
        Me.radInches.TabStop = True
        Me.radInches.Text = "Inches To Centimeters"
        Me.radInches.UseVisualStyleBackColor = False
        '
        'btnConvert
        '
        Me.btnConvert.Cursor = System.Windows.Forms.Cursors.Default
        Me.btnConvert.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnConvert.Location = New System.Drawing.Point(158, 282)
        Me.btnConvert.Name = "btnConvert"
        Me.btnConvert.Size = New System.Drawing.Size(115, 48)
        Me.btnConvert.TabIndex = 4
        Me.btnConvert.Text = "Convert"
        Me.btnConvert.UseVisualStyleBackColor = True
        '
        'radFeet
        '
        Me.radFeet.AutoSize = True
        Me.radFeet.BackColor = System.Drawing.Color.Transparent
        Me.radFeet.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!)
        Me.radFeet.Location = New System.Drawing.Point(223, 355)
        Me.radFeet.Name = "radFeet"
        Me.radFeet.Size = New System.Drawing.Size(115, 20)
        Me.radFeet.TabIndex = 5
        Me.radFeet.TabStop = True
        Me.radFeet.Text = "Feet To Inches"
        Me.radFeet.UseVisualStyleBackColor = False
        '
        'radFeet2
        '
        Me.radFeet2.AutoSize = True
        Me.radFeet2.BackColor = System.Drawing.Color.Transparent
        Me.radFeet2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!)
        Me.radFeet2.Location = New System.Drawing.Point(56, 355)
        Me.radFeet2.Name = "radFeet2"
        Me.radFeet2.Size = New System.Drawing.Size(147, 20)
        Me.radFeet2.TabIndex = 6
        Me.radFeet2.TabStop = True
        Me.radFeet2.Text = "Feet To Centimeters"
        Me.radFeet2.UseVisualStyleBackColor = False
        '
        'btnConvert2
        '
        Me.btnConvert2.Cursor = System.Windows.Forms.Cursors.Default
        Me.btnConvert2.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnConvert2.Location = New System.Drawing.Point(158, 434)
        Me.btnConvert2.Name = "btnConvert2"
        Me.btnConvert2.Size = New System.Drawing.Size(114, 48)
        Me.btnConvert2.TabIndex = 8
        Me.btnConvert2.Text = "Convert"
        Me.btnConvert2.UseVisualStyleBackColor = True
        '
        'NumericUpDown1
        '
        Me.NumericUpDown1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.75!)
        Me.NumericUpDown1.Location = New System.Drawing.Point(148, 387)
        Me.NumericUpDown1.Maximum = New Decimal(New Integer() {10, 0, 0, 0})
        Me.NumericUpDown1.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.NumericUpDown1.Name = "NumericUpDown1"
        Me.NumericUpDown1.Size = New System.Drawing.Size(50, 27)
        Me.NumericUpDown1.TabIndex = 9
        Me.NumericUpDown1.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'NumericUpDown2
        '
        Me.NumericUpDown2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.75!)
        Me.NumericUpDown2.Location = New System.Drawing.Point(216, 387)
        Me.NumericUpDown2.Maximum = New Decimal(New Integer() {12, 0, 0, 0})
        Me.NumericUpDown2.Name = "NumericUpDown2"
        Me.NumericUpDown2.Size = New System.Drawing.Size(50, 27)
        Me.NumericUpDown2.TabIndex = 10
        Me.NumericUpDown2.Value = New Decimal(New Integer() {8, 0, 0, 0})
        '
        'lblSingleQuote
        '
        Me.lblSingleQuote.AutoSize = True
        Me.lblSingleQuote.BackColor = System.Drawing.Color.Transparent
        Me.lblSingleQuote.Location = New System.Drawing.Point(200, 387)
        Me.lblSingleQuote.Name = "lblSingleQuote"
        Me.lblSingleQuote.Size = New System.Drawing.Size(9, 13)
        Me.lblSingleQuote.TabIndex = 11
        Me.lblSingleQuote.Text = "'"
        '
        'lblDoublequote
        '
        Me.lblDoublequote.AutoSize = True
        Me.lblDoublequote.BackColor = System.Drawing.Color.Transparent
        Me.lblDoublequote.Location = New System.Drawing.Point(267, 387)
        Me.lblDoublequote.Name = "lblDoublequote"
        Me.lblDoublequote.Size = New System.Drawing.Size(11, 13)
        Me.lblDoublequote.TabIndex = 12
        Me.lblDoublequote.Text = "''"
        '
        'lblAnswer
        '
        Me.lblAnswer.AutoSize = True
        Me.lblAnswer.BackColor = System.Drawing.Color.Transparent
        Me.lblAnswer.Font = New System.Drawing.Font("Microsoft Sans Serif", 36.75!, System.Drawing.FontStyle.Bold)
        Me.lblAnswer.Location = New System.Drawing.Point(47, 519)
        Me.lblAnswer.Name = "lblAnswer"
        Me.lblAnswer.Size = New System.Drawing.Size(0, 57)
        Me.lblAnswer.TabIndex = 13
        '
        'btnReset
        '
        Me.btnReset.Cursor = System.Windows.Forms.Cursors.Default
        Me.btnReset.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnReset.Location = New System.Drawing.Point(277, 559)
        Me.btnReset.Name = "btnReset"
        Me.btnReset.Size = New System.Drawing.Size(95, 41)
        Me.btnReset.TabIndex = 14
        Me.btnReset.Text = "Reset"
        Me.btnReset.UseVisualStyleBackColor = True
        '
        'NumericUpDown3
        '
        Me.NumericUpDown3.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.75!)
        Me.NumericUpDown3.Location = New System.Drawing.Point(185, 249)
        Me.NumericUpDown3.Maximum = New Decimal(New Integer() {300, 0, 0, 0})
        Me.NumericUpDown3.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.NumericUpDown3.Name = "NumericUpDown3"
        Me.NumericUpDown3.Size = New System.Drawing.Size(56, 27)
        Me.NumericUpDown3.TabIndex = 15
        Me.NumericUpDown3.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'lblUnit
        '
        Me.lblUnit.AutoSize = True
        Me.lblUnit.BackColor = System.Drawing.Color.Transparent
        Me.lblUnit.Font = New System.Drawing.Font("Swis721 LtCn BT", 12.25!)
        Me.lblUnit.Location = New System.Drawing.Point(56, 573)
        Me.lblUnit.Name = "lblUnit"
        Me.lblUnit.Size = New System.Drawing.Size(0, 20)
        Me.lblUnit.TabIndex = 16
        '
        'PictureBox2
        '
        Me.PictureBox2.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox2.Location = New System.Drawing.Point(268, -1)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(104, 16)
        Me.PictureBox2.TabIndex = 19
        Me.PictureBox2.TabStop = False
        '
        'picLockButton
        '
        Me.picLockButton.BackColor = System.Drawing.Color.Transparent
        Me.picLockButton.Location = New System.Drawing.Point(39, 136)
        Me.picLockButton.Name = "picLockButton"
        Me.picLockButton.Size = New System.Drawing.Size(350, 22)
        Me.picLockButton.TabIndex = 20
        Me.picLockButton.TabStop = False
        '
        'picVolumeUp
        '
        Me.picVolumeUp.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeUp.Location = New System.Drawing.Point(1, 141)
        Me.picVolumeUp.Name = "picVolumeUp"
        Me.picVolumeUp.Size = New System.Drawing.Size(26, 61)
        Me.picVolumeUp.TabIndex = 21
        Me.picVolumeUp.TabStop = False
        '
        'picVolumeDown
        '
        Me.picVolumeDown.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeDown.Location = New System.Drawing.Point(1, 211)
        Me.picVolumeDown.Name = "picVolumeDown"
        Me.picVolumeDown.Size = New System.Drawing.Size(26, 49)
        Me.picVolumeDown.TabIndex = 22
        Me.picVolumeDown.TabStop = False
        '
        'picHomeButton
        '
        Me.picHomeButton.BackColor = System.Drawing.Color.Transparent
        Me.picHomeButton.Location = New System.Drawing.Point(170, 652)
        Me.picHomeButton.Name = "picHomeButton"
        Me.picHomeButton.Size = New System.Drawing.Size(83, 72)
        Me.picHomeButton.TabIndex = 23
        Me.picHomeButton.TabStop = False
        '
        'frmHeight
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Silver
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(421, 760)
        Me.ControlBox = False
        Me.Controls.Add(Me.picHomeButton)
        Me.Controls.Add(Me.picVolumeDown)
        Me.Controls.Add(Me.picVolumeUp)
        Me.Controls.Add(Me.picLockButton)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.lblUnit)
        Me.Controls.Add(Me.NumericUpDown3)
        Me.Controls.Add(Me.btnReset)
        Me.Controls.Add(Me.lblAnswer)
        Me.Controls.Add(Me.lblDoublequote)
        Me.Controls.Add(Me.lblSingleQuote)
        Me.Controls.Add(Me.NumericUpDown2)
        Me.Controls.Add(Me.NumericUpDown1)
        Me.Controls.Add(Me.btnConvert2)
        Me.Controls.Add(Me.radFeet2)
        Me.Controls.Add(Me.radFeet)
        Me.Controls.Add(Me.btnConvert)
        Me.Controls.Add(Me.radInches)
        Me.Controls.Add(Me.radCentimeters)
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Name = "frmHeight"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Height Converter"
        Me.TransparencyKey = System.Drawing.Color.Silver
        CType(Me.NumericUpDown1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.NumericUpDown2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.NumericUpDown3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picLockButton, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents radCentimeters As System.Windows.Forms.RadioButton
    Friend WithEvents radInches As System.Windows.Forms.RadioButton
    Friend WithEvents btnConvert As System.Windows.Forms.Button
    Friend WithEvents radFeet As System.Windows.Forms.RadioButton
    Friend WithEvents radFeet2 As System.Windows.Forms.RadioButton
    Friend WithEvents btnConvert2 As System.Windows.Forms.Button
    Friend WithEvents NumericUpDown1 As System.Windows.Forms.NumericUpDown
    Friend WithEvents NumericUpDown2 As System.Windows.Forms.NumericUpDown
    Friend WithEvents lblSingleQuote As System.Windows.Forms.Label
    Friend WithEvents lblDoublequote As System.Windows.Forms.Label
    Friend WithEvents lblAnswer As System.Windows.Forms.Label
    Friend WithEvents btnReset As System.Windows.Forms.Button
    Friend WithEvents NumericUpDown3 As System.Windows.Forms.NumericUpDown
    Friend WithEvents lblUnit As System.Windows.Forms.Label
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents picLockButton As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeUp As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeDown As System.Windows.Forms.PictureBox
    Friend WithEvents picHomeButton As System.Windows.Forms.PictureBox
End Class
