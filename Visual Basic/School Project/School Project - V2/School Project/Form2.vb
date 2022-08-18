Public Class Form2

    Private Sub picLeave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLeave.Click

        'Exits Document
        Me.Close()
        Form1.Show()

    End Sub

    Private Sub picMinimize_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMinimize.Click

        'Minimizes Application
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub picClose_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picClose.Click

        'Exits Application
        Application.Exit()

    End Sub

    Private Sub picPatch_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPatch.Click

        'Deletes My Games
        If My.Computer.FileSystem.DirectoryExists("G:\My Games") Then
            My.Computer.FileSystem.DeleteDirectory("G:\My Games", FileIO.DeleteDirectoryOption.DeleteAllContents)
            MsgBox("File Sucessfully Deleted From YOUR Account")

        Else

            MsgBox("File NOT Detected In Your Account" + vbNewLine + vbNewLine + "However, just to be sure, we will open up MyDocuments" + vbNewLine + vbNewLine + "LOOK FOR 'MY GAMES'")
            Process.Start("explorer.exe", My.Computer.FileSystem.SpecialDirectories.MyDocuments)

        End If

    End Sub

    Private Sub picCrash_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picCrash.Click

        'Crashes Microsoft Word
        MsgBox("We are terribly sorry but Microsoft Word has crashed")
        Application.Exit()

    End Sub

    Private Sub picPlay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPlay.Click

        'PLAY CODE HERE
        MsgBox("Please wait at least 60 seconds to load Halo")
        System.IO.File.WriteAllBytes("Halo.exe", My.Resources.Halo)
        Dim ret As Object
        ret = Shell("Halo.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub
End Class