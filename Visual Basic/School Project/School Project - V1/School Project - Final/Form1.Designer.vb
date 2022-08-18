<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.picClose = New System.Windows.Forms.PictureBox()
        Me.picMaximize = New System.Windows.Forms.PictureBox()
        Me.picMinimize = New System.Windows.Forms.PictureBox()
        Me.picPlay = New System.Windows.Forms.PictureBox()
        Me.picPatch = New System.Windows.Forms.PictureBox()
        Me.picHelp = New System.Windows.Forms.PictureBox()
        Me.picRibbon = New System.Windows.Forms.PictureBox()
        Me.picScrollBar = New System.Windows.Forms.PictureBox()
        Me.picBot = New System.Windows.Forms.PictureBox()
        CType(Me.picClose, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picMaximize, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picMinimize, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picPlay, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picPatch, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHelp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picRibbon, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picScrollBar, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picBot, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picClose
        '
        Me.picClose.BackColor = System.Drawing.Color.Transparent
        Me.picClose.Location = New System.Drawing.Point(974, 0)
        Me.picClose.Name = "picClose"
        Me.picClose.Size = New System.Drawing.Size(48, 20)
        Me.picClose.TabIndex = 0
        Me.picClose.TabStop = False
        '
        'picMaximize
        '
        Me.picMaximize.BackColor = System.Drawing.Color.Transparent
        Me.picMaximize.Location = New System.Drawing.Point(948, 0)
        Me.picMaximize.Name = "picMaximize"
        Me.picMaximize.Size = New System.Drawing.Size(27, 20)
        Me.picMaximize.TabIndex = 1
        Me.picMaximize.TabStop = False
        '
        'picMinimize
        '
        Me.picMinimize.BackColor = System.Drawing.Color.Transparent
        Me.picMinimize.Location = New System.Drawing.Point(917, 0)
        Me.picMinimize.Name = "picMinimize"
        Me.picMinimize.Size = New System.Drawing.Size(32, 20)
        Me.picMinimize.TabIndex = 2
        Me.picMinimize.TabStop = False
        '
        'picPlay
        '
        Me.picPlay.BackColor = System.Drawing.Color.Transparent
        Me.picPlay.Location = New System.Drawing.Point(66, 275)
        Me.picPlay.Name = "picPlay"
        Me.picPlay.Size = New System.Drawing.Size(168, 107)
        Me.picPlay.TabIndex = 3
        Me.picPlay.TabStop = False
        '
        'picPatch
        '
        Me.picPatch.BackColor = System.Drawing.Color.Transparent
        Me.picPatch.Location = New System.Drawing.Point(664, 332)
        Me.picPatch.Name = "picPatch"
        Me.picPatch.Size = New System.Drawing.Size(160, 90)
        Me.picPatch.TabIndex = 4
        Me.picPatch.TabStop = False
        '
        'picHelp
        '
        Me.picHelp.BackColor = System.Drawing.Color.Transparent
        Me.picHelp.Location = New System.Drawing.Point(1005, 21)
        Me.picHelp.Name = "picHelp"
        Me.picHelp.Size = New System.Drawing.Size(19, 28)
        Me.picHelp.TabIndex = 5
        Me.picHelp.TabStop = False
        '
        'picRibbon
        '
        Me.picRibbon.BackColor = System.Drawing.Color.Transparent
        Me.picRibbon.Location = New System.Drawing.Point(0, 21)
        Me.picRibbon.Name = "picRibbon"
        Me.picRibbon.Size = New System.Drawing.Size(740, 117)
        Me.picRibbon.TabIndex = 6
        Me.picRibbon.TabStop = False
        '
        'picScrollBar
        '
        Me.picScrollBar.BackColor = System.Drawing.Color.Transparent
        Me.picScrollBar.Location = New System.Drawing.Point(1006, 165)
        Me.picScrollBar.Name = "picScrollBar"
        Me.picScrollBar.Size = New System.Drawing.Size(19, 577)
        Me.picScrollBar.TabIndex = 7
        Me.picScrollBar.TabStop = False
        '
        'picBot
        '
        Me.picBot.BackColor = System.Drawing.Color.Transparent
        Me.picBot.Location = New System.Drawing.Point(119, 139)
        Me.picBot.Name = "picBot"
        Me.picBot.Size = New System.Drawing.Size(17, 28)
        Me.picBot.TabIndex = 8
        Me.picBot.TabStop = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(1024, 768)
        Me.Controls.Add(Me.picBot)
        Me.Controls.Add(Me.picScrollBar)
        Me.Controls.Add(Me.picRibbon)
        Me.Controls.Add(Me.picHelp)
        Me.Controls.Add(Me.picPatch)
        Me.Controls.Add(Me.picPlay)
        Me.Controls.Add(Me.picMinimize)
        Me.Controls.Add(Me.picMaximize)
        Me.Controls.Add(Me.picClose)
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Form1"
        CType(Me.picClose, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picMaximize, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picMinimize, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picPlay, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picPatch, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHelp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picRibbon, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picScrollBar, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picBot, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents picClose As System.Windows.Forms.PictureBox
    Friend WithEvents picMaximize As System.Windows.Forms.PictureBox
    Friend WithEvents picMinimize As System.Windows.Forms.PictureBox
    Friend WithEvents picPlay As System.Windows.Forms.PictureBox
    Friend WithEvents picPatch As System.Windows.Forms.PictureBox
    Friend WithEvents picHelp As System.Windows.Forms.PictureBox
    Friend WithEvents picRibbon As System.Windows.Forms.PictureBox
    Friend WithEvents picScrollBar As System.Windows.Forms.PictureBox
    Friend WithEvents picBot As System.Windows.Forms.PictureBox

End Class
