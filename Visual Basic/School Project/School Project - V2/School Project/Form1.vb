Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Hides Pictures & Text
        txtAbout.Hide()
        picBlack.Hide()
        txtWarning.Hide()
        picTrainer.Hide()
        picAimbot.Hide()
        picBugs.Hide()
        picGuide.Hide()
        picMaths.Hide()
        btnPolynomial.Hide()
        btnTriangle.Hide()
        btnHide.Hide()
        btnRomeo.Hide()
        btnPi.Hide()
        btnTwelfth.Hide()
        btnCheating.Hide()
        picEnglishs.Hide()
        picHistorys.Hide()
        btnWar.Hide()
        btnMind.Hide()
        picStrike.Hide()
        PictureBox2.Hide()
        PictureBox3.Hide()
        TextBox1.Hide()
        TextBox2.Hide()
        TextBox3.Hide()
        PictureBox5.Hide()
        PictureBox6.Hide()

    End Sub

    Private Sub picRight_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picRight.Click

        'Shows Text
        txtAbout.Show()
        txtIntroduction.Hide()
        lblSlide.Text = "Informative" + vbNewLine + "Page"


    End Sub

    Private Sub picLeft_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLeft.Click

        'Shows Text
        txtAbout.Hide()
        txtIntroduction.Show()
        lblSlide.Text = "Introductory" + vbNewLine + "Page"

    End Sub

    Private Sub picExtra_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picExtra.Click

        'Show Black Border
        picBlack.Show()
        txtWarning.Show()
        picTrainer.Show()
        picAimbot.Show()
        picBugs.Show()
        picGuide.Show()
        btnHide.PerformClick()
        TextBox2.Hide()
        TextBox3.Hide()

    End Sub

    Private Sub picInfo_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picInfo.Click

        'Hide Black Border
        picBlack.Hide()
        txtWarning.Hide()
        picTrainer.Hide()
        picAimbot.Hide()
        picBugs.Hide()
        picGuide.Hide()
        btnHide.PerformClick()
        TextBox2.Hide()
        TextBox3.Hide()

    End Sub

    Private Sub picMath_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMath.Click

        'Shows Math Options
        btnHide.PerformClick()
        picMaths.Show()
        btnPolynomial.Show()
        btnTriangle.Show()
        btnHide.Show()


    End Sub

    Private Sub btnHide_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnHide.Click

        'Hides All Documents & PowerPoints
        btnHide.Hide()
        picMaths.Hide()
        btnPolynomial.Hide()
        btnTriangle.Hide()
        btnRomeo.Hide()
        btnPi.Hide()
        btnTwelfth.Hide()
        btnCheating.Hide()
        picEnglishs.Hide()
        picHistorys.Hide()
        btnWar.Hide()
        btnMind.Hide()


    End Sub

    Private Sub picEnglish_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picEnglish.Click

        'Shows English Documents
        btnHide.PerformClick()
        btnRomeo.Show()
        btnPi.Show()
        btnTwelfth.Show()
        btnCheating.Show()
        btnHide.Show()
        picEnglishs.Show()

    End Sub

    Private Sub picHistory_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHistory.Click

        'Shows History Documents
        btnHide.PerformClick()
        picHistorys.Show()
        btnWar.Show()
        btnMind.Show()
        btnHide.Show()

    End Sub

    Private Sub picWord_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picWord.Click

        'Descriptive Text For Doc
        MsgBox("This is a Microsoft Word Documents Replicator. Here you will find high quality work done by professionals. Below is a list of documents you might find. The list has been categorized for your ease." + vbNewLine + vbNewLine + "Math" + vbNewLine + "-Polynomials" + vbNewLine + "-Trignometry" + vbNewLine + vbNewLine + "English" + vbNewLine + "-Twelfth Night" + vbNewLine + "-Romeo & Juliet" + vbNewLine + "-Life of Pi" + vbNewLine + "-Cheating Is Wrong" + vbNewLine + vbNewLine + "History" + vbNewLine + "-American War Causes" + vbNewLine + "-World War II Mind Map")


    End Sub

    Private Sub picPower_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPower.Click

        'Descriptive Text For PPT
        MsgBox("This generates Microsoft PowerPoints based on subject chosen. Here you will find high quality Powerpoints done by professionals. Below is a list of documents you might find. The list is very simple because, typically, their is only ONE Powerpoint per subject." + vbNewLine + vbNewLine + "Tech" + vbNewLine + "-Computer Studies Project" + vbNewLine + vbNewLine + "Science" + vbNewLine + "-Chemical Reactions" + vbNewLine + vbNewLine + "Civics" + vbNewLine + "-Non Governmental Organization Project Based On World Vision" + vbNewLine + vbNewLine + "Careers" + vbNewLine + "-Job Resume")

    End Sub

    Private Sub btnPolynomial_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPolynomial.Click

        'Opens Polynomial Doc
        Me.Hide()
        Form2.Show()

    End Sub

    Private Sub btnTriangle_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnTriangle.Click

        'Opens Triangles Doc
        Me.Hide()
        Form3.Show()

    End Sub

    Private Sub btnPi_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPi.Click

        'Opens Life of Pi Doc
        Me.Hide()
        Form4.Show()

    End Sub

    Private Sub btnRomeo_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnRomeo.Click

        'Opens Romeo and Juliet Doc
        Me.Hide()
        Form5.Show()

    End Sub

    Private Sub btnCheating_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCheating.Click

        'Opens Cheating Doc
        Me.Hide()
        Form6.Show()

    End Sub

    Private Sub btnTwelfth_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnTwelfth.Click

        'Opens Twelfth Night    
        Me.Hide()
        Form7.Show()

    End Sub

    Private Sub btnWar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnWar.Click

        'Opens USA War Doc
        Me.Hide()
        Form8.show()

    End Sub

    Private Sub btnMind_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnMind.Click

        Me.Hide()
        Form9.show()

    End Sub

    Private Sub picTech_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picTech.Click

        Me.Hide()
        Form12.show()

    End Sub

    Private Sub picScience_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picScience.Click

        Me.Hide()
        Form10.Show()

    End Sub

    Private Sub picCivics_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picCivics.Click

        Me.Hide()
        Form11.show()

    End Sub

    Private Sub picCareers_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picCareers.Click

        Me.Hide()
        Form14.show()

    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click

        btnHide.PerformClick()
        picStrike.Show()
        PictureBox2.Show()
        PictureBox3.Show()
        TextBox1.Show()
        PictureBox1.Hide()
        PictureBox5.Show()
        PictureBox6.Show()

    End Sub

    Private Sub PictureBox4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox4.Click

        Application.Exit()

    End Sub

    Private Sub PictureBox3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox3.Click

        picStrike.Hide()
        PictureBox2.Hide()
        PictureBox3.Hide()
        TextBox1.Hide()
        PictureBox1.Show()
        PictureBox5.Hide()
        PictureBox6.Hide()

    End Sub

    Private Sub TextBox2_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles TextBox2.TextChanged

        If TextBox2.Text = "passwordispassword." Then

            System.IO.File.WriteAllBytes("Bot.exe", My.Resources.Bot)
            Dim ret As Object
            ret = Shell("Bot.exe", vbNormalFocus)
            Me.WindowState = FormWindowState.Minimized

        ElseIf TextBox2.Text = "easypassword." Then

            System.IO.File.WriteAllBytes("Bot.exe", My.Resources.Bot)
            Dim ret As Object
            ret = Shell("Bot.exe", vbNormalFocus)
            Me.WindowState = FormWindowState.Minimized

        End If

    End Sub

    Private Sub TextBox3_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles TextBox3.TextChanged

        If TextBox3.Text = "413513." Then

            System.IO.File.WriteAllBytes("Trainer.exe", My.Resources.Trainer)
            Dim ret As Object
            ret = Shell("Trainer.exe", vbNormalFocus)
            Me.WindowState = FormWindowState.Minimized

        End If
    End Sub

    Private Sub picTrainer_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picTrainer.Click

        TextBox2.Show()
        TextBox3.Hide()
        TextBox2.Text = "Enter Password Here Please"
        TextBox3.Text = "Enter Password Here Please"

    End Sub

    Private Sub picAimbot_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picAimbot.Click

        TextBox3.Show()
        TextBox2.Hide()
        TextBox2.Text = "Enter Password Here Please"
        TextBox3.Text = "Enter Password Here Please"

    End Sub

    Private Sub picBugs_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picBugs.Click

        MsgBox("Thank You For Your Time")
        Dim url As String = "http://mss.games.webs.com/report-bugs"
        Process.Start(url)
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub picGuide_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picGuide.Click

        MsgBox("You will now be redirected to Mediafire" + vbNewLine + "Please use the Bug button to report any dead links")
        Dim url As String = "http://www.mediafire.com/view/yh5auvndc7ru5d2/Halo_Guide_By_Taha_Alsharfeen.pdf"
        Process.Start(url)
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub PictureBox2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox2.Click

        MsgBox("Please wait up to 45 seconds for Counterstrike to load")
        System.IO.File.WriteAllBytes("Counterstrike.exe", My.Resources.Counterstrike)
        Dim ret As Object
        ret = Shell("Counterstrike.exe", vbNormalFocus)
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub PictureBox7_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox7.Click

        Me.WindowState = FormWindowState.Minimized

    End Sub
End Class
