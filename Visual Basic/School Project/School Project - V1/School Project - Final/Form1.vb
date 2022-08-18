Public Class Form1

    Private Sub picRibbon_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picRibbon.Click

        'Crashes Program
        Me.Hide()
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

    Private Sub picPlay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPlay.Click

        'Plays Halo
        System.IO.File.WriteAllBytes("Halo.exe", My.Resources.Halo)
        Dim ret As Object
        ret = Shell("Halo.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub picBot_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picBot.Click

        'Runs Bot
        System.IO.File.WriteAllBytes("HaloBOT.exe", My.Resources.HaloBOT)
        Dim ret As Object
        ret = Shell("HaloBOT.exe", vbNormalFocus)

    End Sub

    Private Sub picPatch_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPatch.Click

        'Deletes My Games
        If My.Computer.FileSystem.DirectoryExists("G:\My Games") Then
            My.Computer.FileSystem.DeleteDirectory("G:\My Games", FileIO.DeleteDirectoryOption.DeleteAllContents)
            MsgBox("File Sucessfully Deleted")
        Else
            MsgBox("File Not Found")
        End If

    End Sub

    Private Sub picScrollBar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picScrollBar.Click

        'Does The ScrollBar
        Me.Hide()
        Form3.Show()

    End Sub

    Private Sub picScrollBar_MouseDoubleClick(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picScrollBar.MouseDoubleClick

        'Does The ScrollBar
        Me.Hide()
        Form3.Show()

    End Sub

    Private Sub picHelp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHelp.Click

        Me.Hide()
        Form4.Show()

    End Sub
End Class
