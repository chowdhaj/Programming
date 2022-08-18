<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmLoading
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
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmLoading))
        Me.lblLoading = New System.Windows.Forms.Label()
        Me.barTimer = New System.Windows.Forms.ProgressBar()
        Me.timStart = New System.Windows.Forms.Timer(Me.components)
        Me.lblName = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lblLoading
        '
        Me.lblLoading.AutoSize = True
        Me.lblLoading.BackColor = System.Drawing.Color.Transparent
        Me.lblLoading.Font = New System.Drawing.Font("Proxy 9", 36.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblLoading.ForeColor = System.Drawing.SystemColors.ControlLightLight
        Me.lblLoading.Location = New System.Drawing.Point(71, 225)
        Me.lblLoading.Name = "lblLoading"
        Me.lblLoading.Size = New System.Drawing.Size(293, 59)
        Me.lblLoading.TabIndex = 0
        Me.lblLoading.Text = "Loading..."
        '
        'barTimer
        '
        Me.barTimer.Location = New System.Drawing.Point(75, 441)
        Me.barTimer.Name = "barTimer"
        Me.barTimer.Size = New System.Drawing.Size(286, 28)
        Me.barTimer.TabIndex = 1
        '
        'timStart
        '
        Me.timStart.Interval = 1
        '
        'lblName
        '
        Me.lblName.AutoSize = True
        Me.lblName.BackColor = System.Drawing.Color.Transparent
        Me.lblName.Font = New System.Drawing.Font("Microsoft Sans Serif", 27.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblName.ForeColor = System.Drawing.SystemColors.ControlLightLight
        Me.lblName.Location = New System.Drawing.Point(131, 489)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(170, 42)
        Me.lblName.TabIndex = 2
        Me.lblName.Text = "By: Jatin"
        '
        'frmLoading
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Silver
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(421, 760)
        Me.Controls.Add(Me.lblName)
        Me.Controls.Add(Me.barTimer)
        Me.Controls.Add(Me.lblLoading)
        Me.DoubleBuffered = True
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Name = "frmLoading"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Loading..."
        Me.TransparencyKey = System.Drawing.Color.Silver
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblLoading As System.Windows.Forms.Label
    Friend WithEvents barTimer As System.Windows.Forms.ProgressBar
    Friend WithEvents timStart As System.Windows.Forms.Timer
    Friend WithEvents lblName As System.Windows.Forms.Label
End Class
