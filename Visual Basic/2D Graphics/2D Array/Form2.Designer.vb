<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmPaint
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
        Me.picPaint = New System.Windows.Forms.PictureBox()
        Me.mnuBar = New System.Windows.Forms.MenuStrip()
        Me.FileToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.AboutToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ExitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ToolStripMenuItem1 = New System.Windows.Forms.ToolStripSeparator()
        Me.SaveToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.SaveAsToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.ToolStripMenuItem2 = New System.Windows.Forms.ToolStripSeparator()
        Me.ExitToolStripMenuItem2 = New System.Windows.Forms.ToolStripMenuItem()
        Me.EditToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.BackgroundColorToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.RedToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.BlueToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.GreenToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.YellowToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.OrangeToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.PurpleToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.BlackToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.WhiteToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ClearAllToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorR = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorB = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorG = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorY = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorO = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorP = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorBB = New System.Windows.Forms.ToolStripMenuItem()
        Me.ColorW = New System.Windows.Forms.ToolStripMenuItem()
        Me.HelpToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.AboutToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem()
        CType(Me.picPaint, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.mnuBar.SuspendLayout()
        Me.SuspendLayout()
        '
        'picPaint
        '
        Me.picPaint.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.picPaint.Dock = System.Windows.Forms.DockStyle.Fill
        Me.picPaint.Location = New System.Drawing.Point(0, 0)
        Me.picPaint.Name = "picPaint"
        Me.picPaint.Size = New System.Drawing.Size(640, 486)
        Me.picPaint.TabIndex = 0
        Me.picPaint.TabStop = False
        '
        'mnuBar
        '
        Me.mnuBar.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.mnuBar.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.FileToolStripMenuItem, Me.EditToolStripMenuItem, Me.ColorToolStripMenuItem1, Me.HelpToolStripMenuItem})
        Me.mnuBar.Location = New System.Drawing.Point(0, 0)
        Me.mnuBar.Name = "mnuBar"
        Me.mnuBar.Size = New System.Drawing.Size(640, 24)
        Me.mnuBar.TabIndex = 1
        Me.mnuBar.Text = "Menu Bar"
        '
        'FileToolStripMenuItem
        '
        Me.FileToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.AboutToolStripMenuItem, Me.ExitToolStripMenuItem, Me.ToolStripMenuItem1, Me.SaveToolStripMenuItem1, Me.SaveAsToolStripMenuItem1, Me.ToolStripMenuItem2, Me.ExitToolStripMenuItem2})
        Me.FileToolStripMenuItem.Name = "FileToolStripMenuItem"
        Me.FileToolStripMenuItem.Size = New System.Drawing.Size(37, 20)
        Me.FileToolStripMenuItem.Text = "File"
        '
        'AboutToolStripMenuItem
        '
        Me.AboutToolStripMenuItem.Name = "AboutToolStripMenuItem"
        Me.AboutToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.AboutToolStripMenuItem.Text = "New"
        '
        'ExitToolStripMenuItem
        '
        Me.ExitToolStripMenuItem.Name = "ExitToolStripMenuItem"
        Me.ExitToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.ExitToolStripMenuItem.Text = "Open"
        '
        'ToolStripMenuItem1
        '
        Me.ToolStripMenuItem1.Name = "ToolStripMenuItem1"
        Me.ToolStripMenuItem1.Size = New System.Drawing.Size(149, 6)
        '
        'SaveToolStripMenuItem1
        '
        Me.SaveToolStripMenuItem1.Name = "SaveToolStripMenuItem1"
        Me.SaveToolStripMenuItem1.Size = New System.Drawing.Size(152, 22)
        Me.SaveToolStripMenuItem1.Text = "Save"
        '
        'SaveAsToolStripMenuItem1
        '
        Me.SaveAsToolStripMenuItem1.Name = "SaveAsToolStripMenuItem1"
        Me.SaveAsToolStripMenuItem1.Size = New System.Drawing.Size(152, 22)
        Me.SaveAsToolStripMenuItem1.Text = "Save As"
        '
        'ToolStripMenuItem2
        '
        Me.ToolStripMenuItem2.Name = "ToolStripMenuItem2"
        Me.ToolStripMenuItem2.Size = New System.Drawing.Size(149, 6)
        '
        'ExitToolStripMenuItem2
        '
        Me.ExitToolStripMenuItem2.Name = "ExitToolStripMenuItem2"
        Me.ExitToolStripMenuItem2.Size = New System.Drawing.Size(152, 22)
        Me.ExitToolStripMenuItem2.Text = "Exit"
        '
        'EditToolStripMenuItem
        '
        Me.EditToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BackgroundColorToolStripMenuItem, Me.ClearAllToolStripMenuItem})
        Me.EditToolStripMenuItem.Name = "EditToolStripMenuItem"
        Me.EditToolStripMenuItem.Size = New System.Drawing.Size(39, 20)
        Me.EditToolStripMenuItem.Text = "Edit"
        '
        'BackgroundColorToolStripMenuItem
        '
        Me.BackgroundColorToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.RedToolStripMenuItem1, Me.BlueToolStripMenuItem1, Me.GreenToolStripMenuItem1, Me.YellowToolStripMenuItem1, Me.OrangeToolStripMenuItem, Me.PurpleToolStripMenuItem1, Me.BlackToolStripMenuItem, Me.WhiteToolStripMenuItem})
        Me.BackgroundColorToolStripMenuItem.Name = "BackgroundColorToolStripMenuItem"
        Me.BackgroundColorToolStripMenuItem.Size = New System.Drawing.Size(170, 22)
        Me.BackgroundColorToolStripMenuItem.Text = "Background Color"
        '
        'RedToolStripMenuItem1
        '
        Me.RedToolStripMenuItem1.Name = "RedToolStripMenuItem1"
        Me.RedToolStripMenuItem1.Size = New System.Drawing.Size(113, 22)
        Me.RedToolStripMenuItem1.Text = "Red"
        '
        'BlueToolStripMenuItem1
        '
        Me.BlueToolStripMenuItem1.Name = "BlueToolStripMenuItem1"
        Me.BlueToolStripMenuItem1.Size = New System.Drawing.Size(113, 22)
        Me.BlueToolStripMenuItem1.Text = "Blue"
        '
        'GreenToolStripMenuItem1
        '
        Me.GreenToolStripMenuItem1.Name = "GreenToolStripMenuItem1"
        Me.GreenToolStripMenuItem1.Size = New System.Drawing.Size(113, 22)
        Me.GreenToolStripMenuItem1.Text = "Green"
        '
        'YellowToolStripMenuItem1
        '
        Me.YellowToolStripMenuItem1.Name = "YellowToolStripMenuItem1"
        Me.YellowToolStripMenuItem1.Size = New System.Drawing.Size(113, 22)
        Me.YellowToolStripMenuItem1.Text = "Yellow"
        '
        'OrangeToolStripMenuItem
        '
        Me.OrangeToolStripMenuItem.Name = "OrangeToolStripMenuItem"
        Me.OrangeToolStripMenuItem.Size = New System.Drawing.Size(113, 22)
        Me.OrangeToolStripMenuItem.Text = "Orange"
        '
        'PurpleToolStripMenuItem1
        '
        Me.PurpleToolStripMenuItem1.Name = "PurpleToolStripMenuItem1"
        Me.PurpleToolStripMenuItem1.Size = New System.Drawing.Size(113, 22)
        Me.PurpleToolStripMenuItem1.Text = "Purple"
        '
        'BlackToolStripMenuItem
        '
        Me.BlackToolStripMenuItem.Name = "BlackToolStripMenuItem"
        Me.BlackToolStripMenuItem.Size = New System.Drawing.Size(113, 22)
        Me.BlackToolStripMenuItem.Text = "Black"
        '
        'WhiteToolStripMenuItem
        '
        Me.WhiteToolStripMenuItem.Name = "WhiteToolStripMenuItem"
        Me.WhiteToolStripMenuItem.Size = New System.Drawing.Size(113, 22)
        Me.WhiteToolStripMenuItem.Text = "White"
        '
        'ClearAllToolStripMenuItem
        '
        Me.ClearAllToolStripMenuItem.Name = "ClearAllToolStripMenuItem"
        Me.ClearAllToolStripMenuItem.Size = New System.Drawing.Size(170, 22)
        Me.ClearAllToolStripMenuItem.Text = "Clear"
        '
        'ColorToolStripMenuItem1
        '
        Me.ColorToolStripMenuItem1.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.ColorR, Me.ColorB, Me.ColorG, Me.ColorY, Me.ColorO, Me.ColorP, Me.ColorBB, Me.ColorW})
        Me.ColorToolStripMenuItem1.Name = "ColorToolStripMenuItem1"
        Me.ColorToolStripMenuItem1.Size = New System.Drawing.Size(48, 20)
        Me.ColorToolStripMenuItem1.Text = "Color"
        '
        'ColorR
        '
        Me.ColorR.Name = "ColorR"
        Me.ColorR.Size = New System.Drawing.Size(152, 22)
        Me.ColorR.Text = "Red"
        '
        'ColorB
        '
        Me.ColorB.Name = "ColorB"
        Me.ColorB.Size = New System.Drawing.Size(152, 22)
        Me.ColorB.Text = "Blue"
        '
        'ColorG
        '
        Me.ColorG.Name = "ColorG"
        Me.ColorG.Size = New System.Drawing.Size(152, 22)
        Me.ColorG.Text = "Green"
        '
        'ColorY
        '
        Me.ColorY.Name = "ColorY"
        Me.ColorY.Size = New System.Drawing.Size(152, 22)
        Me.ColorY.Text = "Yellow"
        '
        'ColorO
        '
        Me.ColorO.Name = "ColorO"
        Me.ColorO.Size = New System.Drawing.Size(152, 22)
        Me.ColorO.Text = "Orange"
        '
        'ColorP
        '
        Me.ColorP.Name = "ColorP"
        Me.ColorP.Size = New System.Drawing.Size(152, 22)
        Me.ColorP.Text = "Purple"
        '
        'ColorBB
        '
        Me.ColorBB.Name = "ColorBB"
        Me.ColorBB.Size = New System.Drawing.Size(152, 22)
        Me.ColorBB.Text = "Black"
        '
        'ColorW
        '
        Me.ColorW.Name = "ColorW"
        Me.ColorW.Size = New System.Drawing.Size(152, 22)
        Me.ColorW.Text = "White"
        '
        'HelpToolStripMenuItem
        '
        Me.HelpToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.AboutToolStripMenuItem1})
        Me.HelpToolStripMenuItem.Name = "HelpToolStripMenuItem"
        Me.HelpToolStripMenuItem.Size = New System.Drawing.Size(44, 20)
        Me.HelpToolStripMenuItem.Text = "&Help"
        '
        'AboutToolStripMenuItem1
        '
        Me.AboutToolStripMenuItem1.Name = "AboutToolStripMenuItem1"
        Me.AboutToolStripMenuItem1.Size = New System.Drawing.Size(152, 22)
        Me.AboutToolStripMenuItem1.Text = "&About..."
        '
        'frmPaint
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(640, 486)
        Me.Controls.Add(Me.mnuBar)
        Me.Controls.Add(Me.picPaint)
        Me.MainMenuStrip = Me.mnuBar
        Me.Name = "frmPaint"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Paint"
        CType(Me.picPaint, System.ComponentModel.ISupportInitialize).EndInit()
        Me.mnuBar.ResumeLayout(False)
        Me.mnuBar.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents picPaint As System.Windows.Forms.PictureBox
    Friend WithEvents mnuBar As System.Windows.Forms.MenuStrip
    Friend WithEvents FileToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents EditToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents AboutToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ExitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ClearAllToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem1 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents SaveToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents SaveAsToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem2 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents ExitToolStripMenuItem2 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorR As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorB As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorG As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorY As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorO As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorP As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HelpToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents AboutToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents BackgroundColorToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents RedToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents BlueToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents GreenToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents YellowToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents PurpleToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents BlackToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents WhiteToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorBB As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ColorW As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents OrangeToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
End Class
