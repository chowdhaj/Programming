Public Class frmBMI

    Private Sub picLock_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLock.Click

        'Error Message
        MessageBox.Show("Cannot Lock Iphone, Apps Are Running", "iPhone")

    End Sub

    Private Sub picNotificationBar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picNotificationBar.Click

        'Opens Form2
        Dim SecondForm As New frmNotifications
        SecondForm.Show()

    End Sub

    Private Sub picVolumeUp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeUp.Click

        'Plays Music
        My.Computer.Audio.Play(My.Resources.gta, AudioPlayMode.BackgroundLoop)

    End Sub

    Private Sub picVolumeDown_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeDown.Click

        'Stops Music
        My.Computer.Audio.Stop()

    End Sub

    Private Sub picHomeButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHomeButton.Click

        'Closes Form
        Me.Close()

    End Sub

    Private Sub Form5_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Clears All Settings When Form Loads
        radImperial.Checked = False
        RadMetric.Checked = False
        txtName.Text = ""
        txtName.ReadOnly = True
        numHeight.Text = ""
        numHeight.ReadOnly = True
        numWeight.Text = ""
        numWeight.ReadOnly = True
        lblHeightUnits.Text = ""
        lblWeightUnits.Text = ""
        btnOK.Hide()
        btnReset.Hide()
        lblNameOutput.Text = ""
        lblBMIis.Text = ""
        lblBMI.Text = ""
        lblComment.Text = ""
        lblWeightStat.Text = ""
        picCheckmark.Hide()
        picCrossMark.Hide()
        pic9000.Hide()
        lblWeightStat2.Text = ""
        lblWeightStat3.Text = ""

    End Sub

    Private Sub RadMetric_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RadMetric.CheckedChanged

        'Settings For Metric
        If RadMetric.Checked = True Then
            txtName.ReadOnly = False
            numHeight.ReadOnly = False
            numHeight.Maximum = 370
            numHeight.Minimum = 1
            numHeight.Text = ""
            lblHeightUnits.Text = "(Cm)"
            numWeight.ReadOnly = False
            numWeight.Maximum = 680
            numWeight.Minimum = 1
            numWeight.Text = ""
            lblWeightUnits.Text = "(Kg)"
            btnOK.Show()
            btnReset.Show()
            lblBMIis.Text = ""
            lblBMI.Text = ""
            lblWeightStat.Text = ""
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = ""
            lblNameOutput.Text = ""
            lblComment.Text = ""
            picCheckmark.Hide()
            picCrossMark.Hide()
            pic9000.Hide()

        End If

    End Sub

    Private Sub radImperial_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radImperial.CheckedChanged

        'Settings For Imperial
        If radImperial.Checked = True Then
            txtName.ReadOnly = False
            numHeight.ReadOnly = False
            numHeight.Maximum = 144
            numHeight.Minimum = 1
            numHeight.Text = ""
            lblHeightUnits.Text = "(Inches)"
            numWeight.ReadOnly = False
            numWeight.Maximum = 1500
            numWeight.Minimum = 1
            numWeight.Text = ""
            lblWeightUnits.Text = "(Lbs)"
            btnOK.Show()
            btnReset.Show()
            lblBMIis.Text = ""
            lblBMI.Text = ""
            lblWeightStat.Text = ""
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = ""
            lblNameOutput.Text = ""
            lblComment.Text = ""
            picCheckmark.Hide()
            picCrossMark.Hide()
            pic9000.Hide()

        End If

    End Sub

    Private Sub btnReset_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnReset.Click

        'Clears All Settings When Reset Button Is Clicked
        radImperial.Checked = False
        RadMetric.Checked = False
        txtName.Text = ""
        txtName.ReadOnly = True
        numHeight.Text = ""
        numHeight.ReadOnly = True
        numWeight.Text = ""
        numWeight.ReadOnly = True
        lblHeightUnits.Text = ""
        lblWeightUnits.Text = ""
        btnOK.Hide()
        btnReset.Hide()
        lblBMI.Text = ""
        lblBMIis.Text = ""
        lblNameOutput.Text = ""
        lblComment.Text = ""
        lblWeightStat.Text = ""
        picCheckmark.Hide()
        picCrossMark.Hide()
        pic9000.Hide()
        lblWeightStat2.Text = ""
        lblWeightStat3.Text = ""
        My.Computer.Audio.Stop()

    End Sub

    Private Sub btnOK_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnOK.Click

        'Enters name, if nothing has been inputed
        If txtName.Text = "" Then

            txtName.Text = "User"

        End If

        'Shows text displaying _____'s BMI Is
        lblNameOutput.Text = txtName.Text + "'s"

        lblBMIis.Text = "BMI Is:"

        'Promotes User To Input Info
        If numHeight.Text = "" Then

            btnReset.PerformClick()
            lblNameOutput.Text = ""
            lblBMIis.Text = ""
            lblBMI.Text = ""
            MessageBox.Show("Please Enter Your REAL Height", "iPhone Roars")
            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "Please Enter Your Info" + vbNewLine + "       If You Wish To Calculate" + vbNewLine + "Your BMI"
            btnReset.Show()
            lblBMI.Text = "Fail"

        End If

        'Promotes User To Input Info
        If numWeight.Text = "" Then

            btnReset.PerformClick()
            lblNameOutput.Text = ""
            lblBMIis.Text = ""
            lblBMI.Text = ""
            MessageBox.Show("Please Enter Your REAL Weight", "iPhone Roars")
            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "Please Enter Your Info" + vbNewLine + "       If You Wish To Calculate" + vbNewLine + "Your BMI"
            btnReset.Show()
            lblBMI.Text = "Fail"

        End If

        'Calculates Bmi Using Metric Units
        If RadMetric.Checked = True Then

            lblBMI.Text = ((numWeight.Text)) / ((((numHeight.Text) * (numHeight.Text)) / 10000))

        End If

        'Calculates Bmi Using Imperial Units
        If radImperial.Checked = True Then

            lblBMI.Text = (((numWeight.Text) * 703)) / (((numHeight.Text) * (numHeight.Text)))

        End If

        'Rounds Final Answer
        lblBMI.Text = Math.Round(Val(lblBMI.Text), 1)

        'UnderWeight
        If lblBMI.Text < 18.5 And lblBMI.Text > 0.01 Then

            lblComment.Text = "OMG! You Are Under Weight!" + vbNewLine + "Start Eating More!"
            lblComment.TextAlign = ContentAlignment.MiddleCenter
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Hide()
            lblWeightStat.Text = "You Need To Gain!"
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = "Pounds To For A Healthy BMI!"

        End If

        'Normal Weight
        If lblBMI.Text > 18.5 And lblBMI.Text < 25 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "YAY! You Are Normal Weight!" + vbNewLine + "Keep It Up!"
            picCheckmark.Show()
            picCrossMark.Hide()
            pic9000.Hide()
            lblWeightStat.Text = "You Are Near Perfect!"
            lblWeightStat2.Text = "Good Job!"
            lblWeightStat3.Text = "Keep It Up!"
            MessageBox.Show("Good Job Partner, Keep It Up", "iPhone Cheers")

        End If

        'OverWeight
        If lblBMI.Text > 25 And lblBMI.Text < 30 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "HOLY! You Are Over Weight!" + vbNewLine + "Eat Healthy!"
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Hide()
            lblWeightStat.Text = "You Need To Lose!"
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = "To Obtain A Healthy BMI!"
        End If

        'Obese Class I
        If lblBMI.Text > 30 And lblBMI.Text < 35 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "You Are Very Over Weight!" + vbNewLine + "Eat Only Healthy!"
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Hide()
            lblWeightStat.Text = "You Need To Lose!"
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = "To Obtain A Healthy BMI!"

        End If

        'Obese Class II
        If lblBMI.Text > 35 And lblBMI.Text < 40 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "You Are Extremely Over Weight!" + vbNewLine + "Eat Super Healthy!"
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Hide()
            lblWeightStat.Text = "You Need To Lose!"
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = "To Obtain A Healthy BMI!"

        End If

        'Obese Class III
        If lblBMI.Text >= 40 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "HOLY MOLY! Outrageous BMI!" + vbNewLine + "Contact Dr.Phil ASAP!"
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Hide()
            lblWeightStat.Text = "You Need To Lose!"
            lblWeightStat2.Text = ""
            lblWeightStat3.Text = "To Obtain A Healthy BMI!"

        End If

        'Obese Class 9000
        If lblBMI.Text > 1000 Then

            lblComment.TextAlign = ContentAlignment.MiddleCenter
            lblComment.Text = "YOUR BMI..." + vbNewLine + "             ITS OVER 9000!"
            picCheckmark.Hide()
            picCrossMark.Show()
            pic9000.Show()
            My.Computer.Audio.Play(My.Resources._9000, AudioPlayMode.BackgroundLoop)
            lblWeightStat.Text = "Im Sorry!"
            lblWeightStat2.Text = "           But!"
            lblWeightStat3.Text = "              There's No Hope!" + vbNewLine + "               (Against Vegeta)"

        End If

        'Under Weight Imperial
        If lblBMI.Text < 18.5 And lblBMI.Text > 0.1 And radImperial.Checked = True Then

            lblWeightStat2.Text = (((((24)) * ((numHeight.Text ^ 2)))) / 703)
            lblWeightStat2.Text = (lblWeightStat2.Text) - (numWeight.Text)
            lblWeightStat2.Text = Math.Round(Val(lblWeightStat2.Text), 0)
            lblWeightStat2.Text = lblWeightStat2.Text + " Lbs"

        End If

        'Under Weight Metric
        If lblBMI.Text < 18.5 And lblBMI.Text > 0.1 And RadMetric.Checked = True Then

            lblWeightStat2.Text = (24) * ((((numHeight.Text ^ 2)) / 10000))
            lblWeightStat2.Text = (lblWeightStat2.Text) - (numWeight.Text)
            lblWeightStat2.Text = Math.Round(Val(lblWeightStat2.Text), 0)
            lblWeightStat2.Text = lblWeightStat2.Text + " Kg"

        End If

        'Over Weight Imperial
        If lblBMI.Text > 24.9 And lblBMI.Text < 1000 And radImperial.Checked = True Then

            lblWeightStat2.Text = (((((24)) * ((numHeight.Text ^ 2)))) / 703)
            lblWeightStat2.Text = (numWeight.Text) - (lblWeightStat2.Text)
            lblWeightStat2.Text = Math.Round(Val(lblWeightStat2.Text), 1)
            lblWeightStat2.Text = lblWeightStat2.Text + " Lbs"

        End If

        'Over Weight Metric
        If lblBMI.Text > 24.9 And lblBMI.Text < 1000 And RadMetric.Checked = True Then

            lblWeightStat2.Text = (24) * ((((numHeight.Text ^ 2)) / 10000))
            lblWeightStat2.Text = (numWeight.Text) - (lblWeightStat2.Text)
            lblWeightStat2.Text = Math.Round(Val(lblWeightStat2.Text), 1)
            lblWeightStat2.Text = lblWeightStat2.Text + " Kg"

        End If

    End Sub

End Class

