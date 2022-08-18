Public Class Form3

    Private Sub Form3_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Clears Input
        RichTextBox1.Text = "Notes: "

    End Sub

    Private Sub picRibbon_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picRibbon.Click

        'Error Report
        Form2.Show()

    End Sub

    Private Sub picMinimize_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMinimize.Click

        'Minimizes Application
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub picMaximize_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMaximize.Click

        'Maximizes Application
        Me.WindowState = FormWindowState.Maximized

    End Sub

    Private Sub picClose_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picClose.Click

        'Exits Application
        Application.Exit()

    End Sub

    Private Sub picScrollBar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picScrollBar.Click

        'Does The ScrollBar
        Me.Hide()
        Form1.Show()

    End Sub

    Private Sub picHelp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHelp.Click

        RichTextBox1.Text = "SCROLL BACK UP AND USE THAT HELP BUTTON" & vbNewLine & "Add stuff here, to pretend like your working"

    End Sub
End Class