<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmBMI
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmBMI))
        Me.picLock = New System.Windows.Forms.PictureBox()
        Me.picNotificationBar = New System.Windows.Forms.PictureBox()
        Me.picVolumeUp = New System.Windows.Forms.PictureBox()
        Me.picVolumeDown = New System.Windows.Forms.PictureBox()
        Me.picHomeButton = New System.Windows.Forms.PictureBox()
        Me.lblNameInput = New System.Windows.Forms.Label()
        Me.txtName = New System.Windows.Forms.TextBox()
        Me.lblWeight = New System.Windows.Forms.Label()
        Me.lblHeight = New System.Windows.Forms.Label()
        Me.RadMetric = New System.Windows.Forms.RadioButton()
        Me.radImperial = New System.Windows.Forms.RadioButton()
        Me.lblWeightUnits = New System.Windows.Forms.Label()
        Me.lblHeightUnits = New System.Windows.Forms.Label()
        Me.numWeight = New System.Windows.Forms.NumericUpDown()
        Me.numHeight = New System.Windows.Forms.NumericUpDown()
        Me.btnReset = New System.Windows.Forms.Button()
        Me.btnOK = New System.Windows.Forms.Button()
        Me.lblBMIis = New System.Windows.Forms.Label()
        Me.lblNameOutput = New System.Windows.Forms.Label()
        Me.lblBMI = New System.Windows.Forms.Label()
        Me.lblWeightStat = New System.Windows.Forms.Label()
        Me.lblComment = New System.Windows.Forms.Label()
        Me.picCheckmark = New System.Windows.Forms.PictureBox()
        Me.lblWeightStat2 = New System.Windows.Forms.Label()
        Me.lblWeightStat3 = New System.Windows.Forms.Label()
        Me.picCrossMark = New System.Windows.Forms.PictureBox()
        Me.pic9000 = New System.Windows.Forms.PictureBox()
        CType(Me.picLock, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picNotificationBar, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numWeight, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numHeight, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picCheckmark, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picCrossMark, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pic9000, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picLock
        '
        Me.picLock.BackColor = System.Drawing.Color.Transparent
        Me.picLock.Location = New System.Drawing.Point(269, -1)
        Me.picLock.Name = "picLock"
        Me.picLock.Size = New System.Drawing.Size(100, 20)
        Me.picLock.TabIndex = 0
        Me.picLock.TabStop = False
        '
        'picNotificationBar
        '
        Me.picNotificationBar.BackColor = System.Drawing.Color.Transparent
        Me.picNotificationBar.Location = New System.Drawing.Point(37, 135)
        Me.picNotificationBar.Name = "picNotificationBar"
        Me.picNotificationBar.Size = New System.Drawing.Size(357, 23)
        Me.picNotificationBar.TabIndex = 1
        Me.picNotificationBar.TabStop = False
        '
        'picVolumeUp
        '
        Me.picVolumeUp.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeUp.Location = New System.Drawing.Point(0, 141)
        Me.picVolumeUp.Name = "picVolumeUp"
        Me.picVolumeUp.Size = New System.Drawing.Size(23, 50)
        Me.picVolumeUp.TabIndex = 2
        Me.picVolumeUp.TabStop = False
        '
        'picVolumeDown
        '
        Me.picVolumeDown.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeDown.Location = New System.Drawing.Point(-1, 208)
        Me.picVolumeDown.Name = "picVolumeDown"
        Me.picVolumeDown.Size = New System.Drawing.Size(23, 50)
        Me.picVolumeDown.TabIndex = 3
        Me.picVolumeDown.TabStop = False
        '
        'picHomeButton
        '
        Me.picHomeButton.BackColor = System.Drawing.Color.Transparent
        Me.picHomeButton.Location = New System.Drawing.Point(172, 652)
        Me.picHomeButton.Name = "picHomeButton"
        Me.picHomeButton.Size = New System.Drawing.Size(85, 72)
        Me.picHomeButton.TabIndex = 4
        Me.picHomeButton.TabStop = False
        '
        'lblNameInput
        '
        Me.lblNameInput.AutoSize = True
        Me.lblNameInput.BackColor = System.Drawing.Color.Transparent
        Me.lblNameInput.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNameInput.Location = New System.Drawing.Point(88, 243)
        Me.lblNameInput.Name = "lblNameInput"
        Me.lblNameInput.Size = New System.Drawing.Size(55, 20)
        Me.lblNameInput.TabIndex = 5
        Me.lblNameInput.Text = "Name:"
        '
        'txtName
        '
        Me.txtName.Location = New System.Drawing.Point(154, 245)
        Me.txtName.MaxLength = 10
        Me.txtName.Name = "txtName"
        Me.txtName.Size = New System.Drawing.Size(158, 20)
        Me.txtName.TabIndex = 6
        '
        'lblWeight
        '
        Me.lblWeight.AutoSize = True
        Me.lblWeight.BackColor = System.Drawing.Color.Transparent
        Me.lblWeight.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblWeight.Location = New System.Drawing.Point(87, 275)
        Me.lblWeight.Name = "lblWeight"
        Me.lblWeight.Size = New System.Drawing.Size(63, 20)
        Me.lblWeight.TabIndex = 7
        Me.lblWeight.Text = "Weight:"
        '
        'lblHeight
        '
        Me.lblHeight.AutoSize = True
        Me.lblHeight.BackColor = System.Drawing.Color.Transparent
        Me.lblHeight.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeight.Location = New System.Drawing.Point(88, 306)
        Me.lblHeight.Name = "lblHeight"
        Me.lblHeight.Size = New System.Drawing.Size(60, 20)
        Me.lblHeight.TabIndex = 9
        Me.lblHeight.Text = "Height:"
        '
        'RadMetric
        '
        Me.RadMetric.AutoSize = True
        Me.RadMetric.BackColor = System.Drawing.Color.Transparent
        Me.RadMetric.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.RadMetric.Location = New System.Drawing.Point(127, 208)
        Me.RadMetric.Name = "RadMetric"
        Me.RadMetric.Size = New System.Drawing.Size(68, 20)
        Me.RadMetric.TabIndex = 11
        Me.RadMetric.TabStop = True
        Me.RadMetric.Text = "Metric"
        Me.RadMetric.UseVisualStyleBackColor = False
        '
        'radImperial
        '
        Me.radImperial.AutoSize = True
        Me.radImperial.BackColor = System.Drawing.Color.Transparent
        Me.radImperial.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.radImperial.Location = New System.Drawing.Point(230, 208)
        Me.radImperial.Name = "radImperial"
        Me.radImperial.Size = New System.Drawing.Size(82, 20)
        Me.radImperial.TabIndex = 12
        Me.radImperial.TabStop = True
        Me.radImperial.Text = "Imperial"
        Me.radImperial.UseVisualStyleBackColor = False
        '
        'lblWeightUnits
        '
        Me.lblWeightUnits.AutoSize = True
        Me.lblWeightUnits.BackColor = System.Drawing.Color.Transparent
        Me.lblWeightUnits.Location = New System.Drawing.Point(318, 277)
        Me.lblWeightUnits.Name = "lblWeightUnits"
        Me.lblWeightUnits.Size = New System.Drawing.Size(31, 13)
        Me.lblWeightUnits.TabIndex = 13
        Me.lblWeightUnits.Text = "Units"
        '
        'lblHeightUnits
        '
        Me.lblHeightUnits.AutoSize = True
        Me.lblHeightUnits.BackColor = System.Drawing.Color.Transparent
        Me.lblHeightUnits.Location = New System.Drawing.Point(318, 313)
        Me.lblHeightUnits.Name = "lblHeightUnits"
        Me.lblHeightUnits.Size = New System.Drawing.Size(31, 13)
        Me.lblHeightUnits.TabIndex = 14
        Me.lblHeightUnits.Text = "Units"
        '
        'numWeight
        '
        Me.numWeight.Location = New System.Drawing.Point(154, 275)
        Me.numWeight.Maximum = New Decimal(New Integer() {1500, 0, 0, 0})
        Me.numWeight.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.numWeight.Name = "numWeight"
        Me.numWeight.Size = New System.Drawing.Size(158, 20)
        Me.numWeight.TabIndex = 15
        Me.numWeight.TabStop = False
        Me.numWeight.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'numHeight
        '
        Me.numHeight.Location = New System.Drawing.Point(154, 306)
        Me.numHeight.Maximum = New Decimal(New Integer() {300, 0, 0, 0})
        Me.numHeight.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.numHeight.Name = "numHeight"
        Me.numHeight.Size = New System.Drawing.Size(158, 20)
        Me.numHeight.TabIndex = 16
        Me.numHeight.TabStop = False
        Me.numHeight.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'btnReset
        '
        Me.btnReset.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnReset.Location = New System.Drawing.Point(153, 344)
        Me.btnReset.Name = "btnReset"
        Me.btnReset.Size = New System.Drawing.Size(68, 35)
        Me.btnReset.TabIndex = 17
        Me.btnReset.TabStop = False
        Me.btnReset.Text = "Reset"
        Me.btnReset.UseVisualStyleBackColor = True
        '
        'btnOK
        '
        Me.btnOK.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOK.Location = New System.Drawing.Point(230, 344)
        Me.btnOK.Name = "btnOK"
        Me.btnOK.Size = New System.Drawing.Size(68, 35)
        Me.btnOK.TabIndex = 18
        Me.btnOK.TabStop = False
        Me.btnOK.Text = "OK"
        Me.btnOK.UseVisualStyleBackColor = True
        '
        'lblBMIis
        '
        Me.lblBMIis.AutoSize = True
        Me.lblBMIis.BackColor = System.Drawing.Color.Transparent
        Me.lblBMIis.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblBMIis.Location = New System.Drawing.Point(166, 413)
        Me.lblBMIis.Name = "lblBMIis"
        Me.lblBMIis.Size = New System.Drawing.Size(55, 20)
        Me.lblBMIis.TabIndex = 19
        Me.lblBMIis.Text = "Bmi is:"
        '
        'lblNameOutput
        '
        Me.lblNameOutput.AutoSize = True
        Me.lblNameOutput.BackColor = System.Drawing.Color.Transparent
        Me.lblNameOutput.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNameOutput.Location = New System.Drawing.Point(166, 389)
        Me.lblNameOutput.Name = "lblNameOutput"
        Me.lblNameOutput.Size = New System.Drawing.Size(54, 20)
        Me.lblNameOutput.TabIndex = 20
        Me.lblNameOutput.Text = "User's"
        '
        'lblBMI
        '
        Me.lblBMI.AutoSize = True
        Me.lblBMI.BackColor = System.Drawing.Color.Transparent
        Me.lblBMI.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblBMI.Location = New System.Drawing.Point(221, 410)
        Me.lblBMI.Name = "lblBMI"
        Me.lblBMI.Size = New System.Drawing.Size(48, 25)
        Me.lblBMI.TabIndex = 21
        Me.lblBMI.Text = "900"
        '
        'lblWeightStat
        '
        Me.lblWeightStat.AutoSize = True
        Me.lblWeightStat.BackColor = System.Drawing.Color.Transparent
        Me.lblWeightStat.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblWeightStat.Location = New System.Drawing.Point(45, 519)
        Me.lblWeightStat.Name = "lblWeightStat"
        Me.lblWeightStat.Size = New System.Drawing.Size(188, 20)
        Me.lblWeightStat.TabIndex = 22
        Me.lblWeightStat.Text = "You Need To Gain/Loose"
        '
        'lblComment
        '
        Me.lblComment.AutoSize = True
        Me.lblComment.BackColor = System.Drawing.Color.Transparent
        Me.lblComment.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblComment.Location = New System.Drawing.Point(80, 441)
        Me.lblComment.Name = "lblComment"
        Me.lblComment.Size = New System.Drawing.Size(289, 25)
        Me.lblComment.TabIndex = 23
        Me.lblComment.Text = "OMG You Are Under Weight!"
        '
        'picCheckmark
        '
        Me.picCheckmark.BackColor = System.Drawing.Color.Transparent
        Me.picCheckmark.BackgroundImage = CType(resources.GetObject("picCheckmark.BackgroundImage"), System.Drawing.Image)
        Me.picCheckmark.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picCheckmark.Location = New System.Drawing.Point(249, 520)
        Me.picCheckmark.Name = "picCheckmark"
        Me.picCheckmark.Size = New System.Drawing.Size(110, 85)
        Me.picCheckmark.TabIndex = 24
        Me.picCheckmark.TabStop = False
        '
        'lblWeightStat2
        '
        Me.lblWeightStat2.AutoSize = True
        Me.lblWeightStat2.BackColor = System.Drawing.Color.Transparent
        Me.lblWeightStat2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblWeightStat2.Location = New System.Drawing.Point(46, 544)
        Me.lblWeightStat2.Name = "lblWeightStat2"
        Me.lblWeightStat2.Size = New System.Drawing.Size(113, 20)
        Me.lblWeightStat2.TabIndex = 25
        Me.lblWeightStat2.Text = "X Kg (Number)"
        '
        'lblWeightStat3
        '
        Me.lblWeightStat3.AutoSize = True
        Me.lblWeightStat3.BackColor = System.Drawing.Color.Transparent
        Me.lblWeightStat3.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblWeightStat3.Location = New System.Drawing.Point(46, 569)
        Me.lblWeightStat3.Name = "lblWeightStat3"
        Me.lblWeightStat3.Size = New System.Drawing.Size(146, 20)
        Me.lblWeightStat3.TabIndex = 26
        Me.lblWeightStat3.Text = "To Achieve Stability"
        '
        'picCrossMark
        '
        Me.picCrossMark.BackColor = System.Drawing.Color.Transparent
        Me.picCrossMark.BackgroundImage = CType(resources.GetObject("picCrossMark.BackgroundImage"), System.Drawing.Image)
        Me.picCrossMark.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picCrossMark.Location = New System.Drawing.Point(269, 520)
        Me.picCrossMark.Name = "picCrossMark"
        Me.picCrossMark.Size = New System.Drawing.Size(93, 80)
        Me.picCrossMark.TabIndex = 27
        Me.picCrossMark.TabStop = False
        Me.picCrossMark.Visible = False
        '
        'pic9000
        '
        Me.pic9000.BackColor = System.Drawing.Color.Transparent
        Me.pic9000.BackgroundImage = CType(resources.GetObject("pic9000.BackgroundImage"), System.Drawing.Image)
        Me.pic9000.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.pic9000.Image = CType(resources.GetObject("pic9000.Image"), System.Drawing.Image)
        Me.pic9000.Location = New System.Drawing.Point(91, 201)
        Me.pic9000.Name = "pic9000"
        Me.pic9000.Size = New System.Drawing.Size(257, 141)
        Me.pic9000.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pic9000.TabIndex = 28
        Me.pic9000.TabStop = False
        '
        'frmBMI
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Silver
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(421, 760)
        Me.ControlBox = False
        Me.Controls.Add(Me.pic9000)
        Me.Controls.Add(Me.lblWeightStat3)
        Me.Controls.Add(Me.lblWeightStat2)
        Me.Controls.Add(Me.lblComment)
        Me.Controls.Add(Me.lblWeightStat)
        Me.Controls.Add(Me.lblNameOutput)
        Me.Controls.Add(Me.lblBMIis)
        Me.Controls.Add(Me.btnOK)
        Me.Controls.Add(Me.btnReset)
        Me.Controls.Add(Me.numHeight)
        Me.Controls.Add(Me.numWeight)
        Me.Controls.Add(Me.lblHeightUnits)
        Me.Controls.Add(Me.lblWeightUnits)
        Me.Controls.Add(Me.radImperial)
        Me.Controls.Add(Me.RadMetric)
        Me.Controls.Add(Me.lblHeight)
        Me.Controls.Add(Me.lblWeight)
        Me.Controls.Add(Me.txtName)
        Me.Controls.Add(Me.lblNameInput)
        Me.Controls.Add(Me.picHomeButton)
        Me.Controls.Add(Me.picVolumeDown)
        Me.Controls.Add(Me.picVolumeUp)
        Me.Controls.Add(Me.picNotificationBar)
        Me.Controls.Add(Me.picLock)
        Me.Controls.Add(Me.picCheckmark)
        Me.Controls.Add(Me.picCrossMark)
        Me.Controls.Add(Me.lblBMI)
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Name = "frmBMI"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "BMI Calculator"
        Me.TransparencyKey = System.Drawing.Color.Silver
        CType(Me.picLock, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picNotificationBar, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numWeight, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numHeight, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picCheckmark, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picCrossMark, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pic9000, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents picLock As System.Windows.Forms.PictureBox
    Friend WithEvents picNotificationBar As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeUp As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeDown As System.Windows.Forms.PictureBox
    Friend WithEvents picHomeButton As System.Windows.Forms.PictureBox
    Friend WithEvents lblNameInput As System.Windows.Forms.Label
    Friend WithEvents txtName As System.Windows.Forms.TextBox
    Friend WithEvents lblWeight As System.Windows.Forms.Label
    Friend WithEvents lblHeight As System.Windows.Forms.Label
    Friend WithEvents RadMetric As System.Windows.Forms.RadioButton
    Friend WithEvents radImperial As System.Windows.Forms.RadioButton
    Friend WithEvents lblWeightUnits As System.Windows.Forms.Label
    Friend WithEvents lblHeightUnits As System.Windows.Forms.Label
    Friend WithEvents numWeight As System.Windows.Forms.NumericUpDown
    Friend WithEvents numHeight As System.Windows.Forms.NumericUpDown
    Friend WithEvents btnReset As System.Windows.Forms.Button
    Friend WithEvents btnOK As System.Windows.Forms.Button
    Friend WithEvents lblBMIis As System.Windows.Forms.Label
    Friend WithEvents lblNameOutput As System.Windows.Forms.Label
    Friend WithEvents lblBMI As System.Windows.Forms.Label
    Friend WithEvents lblWeightStat As System.Windows.Forms.Label
    Friend WithEvents lblComment As System.Windows.Forms.Label
    Friend WithEvents picCheckmark As System.Windows.Forms.PictureBox
    Friend WithEvents lblWeightStat2 As System.Windows.Forms.Label
    Friend WithEvents lblWeightStat3 As System.Windows.Forms.Label
    Friend WithEvents picCrossMark As System.Windows.Forms.PictureBox
    Friend WithEvents pic9000 As System.Windows.Forms.PictureBox
End Class
