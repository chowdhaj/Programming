<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmWeight
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmWeight))
        Me.btnReset = New System.Windows.Forms.Button()
        Me.lblUnits = New System.Windows.Forms.Label()
        Me.lblanswer = New System.Windows.Forms.Label()
        Me.radKgtoLbs = New System.Windows.Forms.RadioButton()
        Me.radLbstoKg = New System.Windows.Forms.RadioButton()
        Me.NumericUpDown1 = New System.Windows.Forms.NumericUpDown()
        Me.NumericUpDown2 = New System.Windows.Forms.NumericUpDown()
        Me.btnConvert = New System.Windows.Forms.Button()
        Me.btnConvert2 = New System.Windows.Forms.Button()
        Me.picLock = New System.Windows.Forms.PictureBox()
        Me.picSilent = New System.Windows.Forms.PictureBox()
        Me.picVolumeUp = New System.Windows.Forms.PictureBox()
        Me.picVolumeDown = New System.Windows.Forms.PictureBox()
        Me.picHomeButton = New System.Windows.Forms.PictureBox()
        CType(Me.NumericUpDown1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.NumericUpDown2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picLock, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picSilent, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnReset
        '
        Me.btnReset.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!)
        Me.btnReset.Location = New System.Drawing.Point(260, 565)
        Me.btnReset.Name = "btnReset"
        Me.btnReset.Size = New System.Drawing.Size(118, 48)
        Me.btnReset.TabIndex = 0
        Me.btnReset.Text = "Reset"
        Me.btnReset.UseVisualStyleBackColor = True
        '
        'lblUnits
        '
        Me.lblUnits.AutoSize = True
        Me.lblUnits.BackColor = System.Drawing.Color.Transparent
        Me.lblUnits.Font = New System.Drawing.Font("Swis721 LtCn BT", 12.25!)
        Me.lblUnits.Location = New System.Drawing.Point(51, 594)
        Me.lblUnits.Name = "lblUnits"
        Me.lblUnits.Size = New System.Drawing.Size(0, 20)
        Me.lblUnits.TabIndex = 1
        '
        'lblanswer
        '
        Me.lblanswer.AutoSize = True
        Me.lblanswer.BackColor = System.Drawing.Color.Transparent
        Me.lblanswer.Font = New System.Drawing.Font("Microsoft Sans Serif", 36.75!, System.Drawing.FontStyle.Bold)
        Me.lblanswer.Location = New System.Drawing.Point(41, 537)
        Me.lblanswer.Name = "lblanswer"
        Me.lblanswer.Size = New System.Drawing.Size(0, 57)
        Me.lblanswer.TabIndex = 2
        '
        'radKgtoLbs
        '
        Me.radKgtoLbs.AutoSize = True
        Me.radKgtoLbs.BackColor = System.Drawing.Color.Transparent
        Me.radKgtoLbs.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!)
        Me.radKgtoLbs.Location = New System.Drawing.Point(159, 220)
        Me.radKgtoLbs.Name = "radKgtoLbs"
        Me.radKgtoLbs.Size = New System.Drawing.Size(121, 20)
        Me.radKgtoLbs.TabIndex = 5
        Me.radKgtoLbs.TabStop = True
        Me.radKgtoLbs.Text = "From Kg To Lbs"
        Me.radKgtoLbs.UseVisualStyleBackColor = False
        '
        'radLbstoKg
        '
        Me.radLbstoKg.AutoSize = True
        Me.radLbstoKg.BackColor = System.Drawing.Color.Transparent
        Me.radLbstoKg.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!)
        Me.radLbstoKg.Location = New System.Drawing.Point(159, 375)
        Me.radLbstoKg.Name = "radLbstoKg"
        Me.radLbstoKg.Size = New System.Drawing.Size(121, 20)
        Me.radLbstoKg.TabIndex = 6
        Me.radLbstoKg.TabStop = True
        Me.radLbstoKg.Text = "From Lbs To Kg"
        Me.radLbstoKg.UseVisualStyleBackColor = False
        '
        'NumericUpDown1
        '
        Me.NumericUpDown1.Font = New System.Drawing.Font("Microsoft Sans Serif", 17.75!)
        Me.NumericUpDown1.Location = New System.Drawing.Point(169, 254)
        Me.NumericUpDown1.Maximum = New Decimal(New Integer() {700, 0, 0, 0})
        Me.NumericUpDown1.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.NumericUpDown1.Name = "NumericUpDown1"
        Me.NumericUpDown1.Size = New System.Drawing.Size(90, 34)
        Me.NumericUpDown1.TabIndex = 7
        Me.NumericUpDown1.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'NumericUpDown2
        '
        Me.NumericUpDown2.Font = New System.Drawing.Font("Microsoft Sans Serif", 17.75!)
        Me.NumericUpDown2.Location = New System.Drawing.Point(169, 409)
        Me.NumericUpDown2.Maximum = New Decimal(New Integer() {1540, 0, 0, 0})
        Me.NumericUpDown2.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.NumericUpDown2.Name = "NumericUpDown2"
        Me.NumericUpDown2.Size = New System.Drawing.Size(90, 34)
        Me.NumericUpDown2.TabIndex = 8
        Me.NumericUpDown2.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'btnConvert
        '
        Me.btnConvert.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!)
        Me.btnConvert.Location = New System.Drawing.Point(159, 302)
        Me.btnConvert.Name = "btnConvert"
        Me.btnConvert.Size = New System.Drawing.Size(107, 42)
        Me.btnConvert.TabIndex = 9
        Me.btnConvert.Text = "Convert"
        Me.btnConvert.UseVisualStyleBackColor = True
        '
        'btnConvert2
        '
        Me.btnConvert2.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!)
        Me.btnConvert2.Location = New System.Drawing.Point(159, 457)
        Me.btnConvert2.Name = "btnConvert2"
        Me.btnConvert2.Size = New System.Drawing.Size(107, 40)
        Me.btnConvert2.TabIndex = 10
        Me.btnConvert2.Text = "Convert"
        Me.btnConvert2.UseVisualStyleBackColor = True
        '
        'picLock
        '
        Me.picLock.BackColor = System.Drawing.Color.Transparent
        Me.picLock.Location = New System.Drawing.Point(260, -1)
        Me.picLock.Name = "picLock"
        Me.picLock.Size = New System.Drawing.Size(106, 25)
        Me.picLock.TabIndex = 12
        Me.picLock.TabStop = False
        '
        'picSilent
        '
        Me.picSilent.BackColor = System.Drawing.Color.Transparent
        Me.picSilent.Location = New System.Drawing.Point(38, 135)
        Me.picSilent.Name = "picSilent"
        Me.picSilent.Size = New System.Drawing.Size(355, 23)
        Me.picSilent.TabIndex = 13
        Me.picSilent.TabStop = False
        '
        'picVolumeUp
        '
        Me.picVolumeUp.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeUp.Location = New System.Drawing.Point(-1, 139)
        Me.picVolumeUp.Name = "picVolumeUp"
        Me.picVolumeUp.Size = New System.Drawing.Size(24, 48)
        Me.picVolumeUp.TabIndex = 14
        Me.picVolumeUp.TabStop = False
        '
        'picVolumeDown
        '
        Me.picVolumeDown.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeDown.Location = New System.Drawing.Point(0, 208)
        Me.picVolumeDown.Name = "picVolumeDown"
        Me.picVolumeDown.Size = New System.Drawing.Size(24, 42)
        Me.picVolumeDown.TabIndex = 15
        Me.picVolumeDown.TabStop = False
        '
        'picHomeButton
        '
        Me.picHomeButton.BackColor = System.Drawing.Color.Transparent
        Me.picHomeButton.Location = New System.Drawing.Point(169, 654)
        Me.picHomeButton.Name = "picHomeButton"
        Me.picHomeButton.Size = New System.Drawing.Size(83, 70)
        Me.picHomeButton.TabIndex = 16
        Me.picHomeButton.TabStop = False
        '
        'frmWeight
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
        Me.Controls.Add(Me.picSilent)
        Me.Controls.Add(Me.picLock)
        Me.Controls.Add(Me.btnConvert2)
        Me.Controls.Add(Me.btnConvert)
        Me.Controls.Add(Me.NumericUpDown2)
        Me.Controls.Add(Me.NumericUpDown1)
        Me.Controls.Add(Me.radLbstoKg)
        Me.Controls.Add(Me.radKgtoLbs)
        Me.Controls.Add(Me.lblanswer)
        Me.Controls.Add(Me.lblUnits)
        Me.Controls.Add(Me.btnReset)
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Name = "frmWeight"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Weight Converter"
        Me.TransparencyKey = System.Drawing.Color.Silver
        CType(Me.NumericUpDown1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.NumericUpDown2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picLock, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picSilent, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnReset As System.Windows.Forms.Button
    Friend WithEvents lblUnits As System.Windows.Forms.Label
    Friend WithEvents lblanswer As System.Windows.Forms.Label
    Friend WithEvents radKgtoLbs As System.Windows.Forms.RadioButton
    Friend WithEvents radLbstoKg As System.Windows.Forms.RadioButton
    Friend WithEvents NumericUpDown1 As System.Windows.Forms.NumericUpDown
    Friend WithEvents NumericUpDown2 As System.Windows.Forms.NumericUpDown
    Friend WithEvents btnConvert As System.Windows.Forms.Button
    Friend WithEvents btnConvert2 As System.Windows.Forms.Button
    Friend WithEvents picLock As System.Windows.Forms.PictureBox
    Friend WithEvents picSilent As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeUp As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeDown As System.Windows.Forms.PictureBox
    Friend WithEvents picHomeButton As System.Windows.Forms.PictureBox
End Class
