Public Class Form8

    Private Sub PictureBox2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox2.Click

        'Exits Document
        Me.Close()
        Form1.Show()

    End Sub

    Private Sub PictureBox3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox3.Click

        'Deletes My Games
        If My.Computer.FileSystem.DirectoryExists("G:\My Games") Then
            My.Computer.FileSystem.DeleteDirectory("G:\My Games", FileIO.DeleteDirectoryOption.DeleteAllContents)
            MsgBox("File Sucessfully Deleted From YOUR Account")

        Else

            MsgBox("File NOT Detected In Your Account" + vbNewLine + vbNewLine + "However, just to be sure, we will open up MyDocuments" + vbNewLine + vbNewLine + "LOOK FOR 'MY GAMES'")
            Process.Start("explorer.exe", My.Computer.FileSystem.SpecialDirectories.MyDocuments)

        End If

    End Sub

    Private Sub PictureBox4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox4.Click

        'Crashes Microsoft Word
        MsgBox("We are terribly sorry but Microsoft Word has crashed")
        Application.Exit()

    End Sub

    Private Sub PictureBox5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox5.Click

        'Minimizes Application
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub PictureBox6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox6.Click

        'Exits Application
        Application.Exit()

    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click

        'play code here
        MsgBox("Please wait at least 60 seconds to load Halo")
        System.IO.File.WriteAllBytes("Halo.exe", My.Resources.Halo)
        Dim ret As Object
        ret = Shell("Halo.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub
End Class