Public Class Form10

    Private Sub PictureBox3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox3.Click

        'Slide One Show
        PictureBox2.Hide()
        PictureBox9.Hide()
        PictureBox10.Hide()
        PictureBox11.Hide()
        PictureBox12.Hide()

    End Sub

    Private Sub PictureBox4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox4.Click

        'Slide Two Show
        PictureBox2.Show()
        PictureBox9.Hide()
        PictureBox10.Hide()
        PictureBox11.Hide()
        PictureBox12.Hide()

    End Sub

    Private Sub PictureBox5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox5.Click

        'Slide Three Show
        PictureBox2.Hide()
        PictureBox9.Show()
        PictureBox10.Hide()
        PictureBox11.Hide()
        PictureBox12.Hide()

    End Sub

    Private Sub PictureBox6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox6.Click

        'Slide Four Show
        PictureBox2.Hide()
        PictureBox9.Hide()
        PictureBox10.Show()
        PictureBox11.Hide()
        PictureBox12.Hide()

    End Sub

    Private Sub PictureBox7_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox7.Click

        'Slide Five Show
        PictureBox2.Hide()
        PictureBox9.Hide()
        PictureBox10.Hide()
        PictureBox11.Show()
        PictureBox12.Hide()

    End Sub

    Private Sub PictureBox8_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox8.Click

        'Slide Six Show
        PictureBox2.Hide()
        PictureBox9.Hide()
        PictureBox10.Hide()
        PictureBox11.Hide()
        PictureBox12.Show()

    End Sub

    Private Sub PictureBox2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox2.Click

        'Deletes My Games
        If My.Computer.FileSystem.DirectoryExists("G:\My Games") Then
            My.Computer.FileSystem.DeleteDirectory("G:\My Games", FileIO.DeleteDirectoryOption.DeleteAllContents)
            MsgBox("File Sucessfully Deleted From YOUR Account")

        Else

            MsgBox("File NOT Detected In Your Account" + vbNewLine + vbNewLine + "However, just to be sure, we will open up MyDocuments" + vbNewLine + vbNewLine + "LOOK FOR 'MY GAMES'")
            Process.Start("explorer.exe", My.Computer.FileSystem.SpecialDirectories.MyDocuments)

        End If

    End Sub

    Private Sub PictureBox9_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox9.Click

        'Exits Document
        Me.Close()
        Form1.Show()

    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click

        'Crashes Microsoft Word
        MsgBox("We are terribly sorry but Microsoft Word has crashed")
        Application.Exit()

    End Sub

    Private Sub PictureBox14_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox14.Click

        'Exit Application
        Application.Exit()

    End Sub

    Private Sub PictureBox13_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox13.Click

        'Minimizes Application
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub PictureBox10_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox10.Click

        'PLAY CODE HERE
        MsgBox("Please wait at least 60 seconds to load Halo")
        System.IO.File.WriteAllBytes("Halo.exe", My.Resources.Halo)
        Dim ret As Object
        ret = Shell("Halo.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub
End Class