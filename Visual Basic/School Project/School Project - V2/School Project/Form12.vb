Public Class Form12

    Private Sub PictureBox9_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox9.Click

        'Crashes Microsoft Word
        MsgBox("We are terribly sorry but Microsoft Word has crashed")
        Application.Exit()

    End Sub

    Private Sub PictureBox10_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox10.Click

        'Minimizes Application
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub PictureBox11_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox11.Click

        'Exit Application
        Application.Exit()

    End Sub

    Private Sub PictureBox14_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox14.Click

        'Deletes My Games
        If My.Computer.FileSystem.DirectoryExists("G:\My Games") Then
            My.Computer.FileSystem.DeleteDirectory("G:\My Games", FileIO.DeleteDirectoryOption.DeleteAllContents)
            MsgBox("File Sucessfully Deleted From YOUR Account")

        Else

            MsgBox("File NOT Detected In Your Account" + vbNewLine + vbNewLine + "However, just to be sure, we will open up MyDocuments" + vbNewLine + vbNewLine + "LOOK FOR 'MY GAMES'")
            Process.Start("explorer.exe", My.Computer.FileSystem.SpecialDirectories.MyDocuments)

        End If

    End Sub

    Private Sub PictureBox8_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox8.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Show()

    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox2.Click

        PictureBox12.Show()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox3.Click

        PictureBox12.Hide()
        PictureBox13.Show()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox4.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Show()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox5.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Show()
        PictureBox16.Hide()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox6.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Show()
        PictureBox17.Hide()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox7_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox7.Click

        PictureBox12.Hide()
        PictureBox13.Hide()
        PictureBox14.Hide()
        PictureBox15.Hide()
        PictureBox16.Hide()
        PictureBox17.Show()
        PictureBox18.Hide()

    End Sub

    Private Sub PictureBox18_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox18.Click

        'Exits Document
        Me.Close()
        Form1.Show()

    End Sub

    Private Sub PictureBox13_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox13.Click

        'PLAY CODE HERE
        MsgBox("Please wait at least 60 seconds to load Halo")
        System.IO.File.WriteAllBytes("Halo.exe", My.Resources.Halo)
        Dim ret As Object
        ret = Shell("Halo.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub
End Class