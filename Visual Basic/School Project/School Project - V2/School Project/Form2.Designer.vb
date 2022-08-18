<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form2
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form2))
        Me.picPlay = New System.Windows.Forms.PictureBox()
        Me.picPatch = New System.Windows.Forms.PictureBox()
        Me.picLeave = New System.Windows.Forms.PictureBox()
        Me.picMinimize = New System.Windows.Forms.PictureBox()
        Me.picClose = New System.Windows.Forms.PictureBox()
        Me.picCrash = New System.Windows.Forms.PictureBox()
        Me.TextBox1 = New System.Windows.Forms.TextBox()
        Me.TextBox2 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        CType(Me.picPlay, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picPatch, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picLeave, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picMinimize, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picClose, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picCrash, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picPlay
        '
        Me.picPlay.BackColor = System.Drawing.Color.Transparent
        Me.picPlay.Location = New System.Drawing.Point(599, 244)
        Me.picPlay.Name = "picPlay"
        Me.picPlay.Size = New System.Drawing.Size(100, 50)
        Me.picPlay.TabIndex = 0
        Me.picPlay.TabStop = False
        '
        'picPatch
        '
        Me.picPatch.BackColor = System.Drawing.Color.Transparent
        Me.picPatch.Location = New System.Drawing.Point(519, 357)
        Me.picPatch.Name = "picPatch"
        Me.picPatch.Size = New System.Drawing.Size(100, 50)
        Me.picPatch.TabIndex = 1
        Me.picPatch.TabStop = False
        '
        'picLeave
        '
        Me.picLeave.BackColor = System.Drawing.Color.Transparent
        Me.picLeave.Location = New System.Drawing.Point(420, 453)
        Me.picLeave.Name = "picLeave"
        Me.picLeave.Size = New System.Drawing.Size(100, 50)
        Me.picLeave.TabIndex = 2
        Me.picLeave.TabStop = False
        '
        'picMinimize
        '
        Me.picMinimize.BackColor = System.Drawing.Color.Transparent
        Me.picMinimize.Location = New System.Drawing.Point(-2, -1)
        Me.picMinimize.Name = "picMinimize"
        Me.picMinimize.Size = New System.Drawing.Size(979, 23)
        Me.picMinimize.TabIndex = 4
        Me.picMinimize.TabStop = False
        '
        'picClose
        '
        Me.picClose.BackColor = System.Drawing.Color.Transparent
        Me.picClose.Location = New System.Drawing.Point(975, -1)
        Me.picClose.Name = "picClose"
        Me.picClose.Size = New System.Drawing.Size(48, 23)
        Me.picClose.TabIndex = 5
        Me.picClose.TabStop = False
        '
        'picCrash
        '
        Me.picCrash.BackColor = System.Drawing.Color.Transparent
        Me.picCrash.Location = New System.Drawing.Point(-2, 22)
        Me.picCrash.Name = "picCrash"
        Me.picCrash.Size = New System.Drawing.Size(1025, 115)
        Me.picCrash.TabIndex = 6
        Me.picCrash.TabStop = False
        '
        'TextBox1
        '
        Me.TextBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TextBox1.Location = New System.Drawing.Point(307, 673)
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(154, 21)
        Me.TextBox1.TabIndex = 7
        '
        'TextBox2
        '
        Me.TextBox2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TextBox2.Location = New System.Drawing.Point(483, 715)
        Me.TextBox2.Name = "TextBox2"
        Me.TextBox2.Size = New System.Drawing.Size(181, 21)
        Me.TextBox2.TabIndex = 8
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.Transparent
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 6.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(470, 680)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(62, 9)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "Answer: Integers"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.Transparent
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 6.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(671, 722)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(69, 9)
        Me.Label2.TabIndex = 10
        Me.Label2.Text = "Answer: Monomial"
        '
        'Form2
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.ClientSize = New System.Drawing.Size(1024, 768)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.TextBox2)
        Me.Controls.Add(Me.TextBox1)
        Me.Controls.Add(Me.picCrash)
        Me.Controls.Add(Me.picClose)
        Me.Controls.Add(Me.picMinimize)
        Me.Controls.Add(Me.picLeave)
        Me.Controls.Add(Me.picPatch)
        Me.Controls.Add(Me.picPlay)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form2"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Polynomials"
        CType(Me.picPlay, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picPatch, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picLeave, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picMinimize, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picClose, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picCrash, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents picPlay As System.Windows.Forms.PictureBox
    Friend WithEvents picPatch As System.Windows.Forms.PictureBox
    Friend WithEvents picLeave As System.Windows.Forms.PictureBox
    Friend WithEvents picMinimize As System.Windows.Forms.PictureBox
    Friend WithEvents picClose As System.Windows.Forms.PictureBox
    Friend WithEvents picCrash As System.Windows.Forms.PictureBox
    Friend WithEvents TextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox2 As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
End Class
