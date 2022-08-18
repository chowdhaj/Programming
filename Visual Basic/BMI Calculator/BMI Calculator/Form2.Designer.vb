<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmNotifications
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmNotifications))
        Me.picVolumeDown = New System.Windows.Forms.PictureBox()
        Me.picVolumeUp = New System.Windows.Forms.PictureBox()
        Me.picLockButton = New System.Windows.Forms.PictureBox()
        Me.picHomeButton = New System.Windows.Forms.PictureBox()
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picLockButton, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picVolumeDown
        '
        Me.picVolumeDown.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeDown.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picVolumeDown.Location = New System.Drawing.Point(0, 211)
        Me.picVolumeDown.Name = "picVolumeDown"
        Me.picVolumeDown.Size = New System.Drawing.Size(25, 46)
        Me.picVolumeDown.TabIndex = 20
        Me.picVolumeDown.TabStop = False
        '
        'picVolumeUp
        '
        Me.picVolumeUp.BackColor = System.Drawing.Color.Transparent
        Me.picVolumeUp.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picVolumeUp.Location = New System.Drawing.Point(-1, 146)
        Me.picVolumeUp.Name = "picVolumeUp"
        Me.picVolumeUp.Size = New System.Drawing.Size(27, 46)
        Me.picVolumeUp.TabIndex = 19
        Me.picVolumeUp.TabStop = False
        '
        'picLockButton
        '
        Me.picLockButton.AccessibleRole = System.Windows.Forms.AccessibleRole.None
        Me.picLockButton.BackColor = System.Drawing.Color.Transparent
        Me.picLockButton.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picLockButton.Location = New System.Drawing.Point(261, 0)
        Me.picLockButton.Name = "picLockButton"
        Me.picLockButton.Size = New System.Drawing.Size(106, 24)
        Me.picLockButton.TabIndex = 17
        Me.picLockButton.TabStop = False
        '
        'picHomeButton
        '
        Me.picHomeButton.BackColor = System.Drawing.Color.Transparent
        Me.picHomeButton.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.picHomeButton.Location = New System.Drawing.Point(168, 647)
        Me.picHomeButton.Name = "picHomeButton"
        Me.picHomeButton.Size = New System.Drawing.Size(92, 83)
        Me.picHomeButton.TabIndex = 21
        Me.picHomeButton.TabStop = False
        '
        'frmNotifications
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
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Name = "frmNotifications"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Information"
        Me.TransparencyKey = System.Drawing.Color.Silver
        CType(Me.picVolumeDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picVolumeUp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picLockButton, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHomeButton, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents picVolumeDown As System.Windows.Forms.PictureBox
    Friend WithEvents picVolumeUp As System.Windows.Forms.PictureBox
    Friend WithEvents picLockButton As System.Windows.Forms.PictureBox
    Friend WithEvents picHomeButton As System.Windows.Forms.PictureBox
End Class
