Public Class frmHeight

    Private Sub Form3_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Hides All Buttons
        btnConvert.Hide()
        btnConvert2.Hide()
        btnReset.Hide()
        Me.Focus()

        'Makes All Inputs Read Only
        NumericUpDown3.ReadOnly = True
        NumericUpDown1.ReadOnly = True
        NumericUpDown2.ReadOnly = True

    End Sub

    Private Sub radCentimeters_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radCentimeters.CheckedChanged

        'Makes Inputs Valid
        If radCentimeters.Checked Then
            NumericUpDown3.ReadOnly = False

        End If

        'Shows Convert Button When radCentimeters is Clicked
        If radCentimeters.Checked Then
            btnConvert.Show()

        End If

        'Hides Convert2 Button when radCentimeters is Clicked
        If radCentimeters.Checked Then
            btnConvert2.Hide()

        End If

        'Makes Inputs ReadOnly
        If radCentimeters.Checked Then
            NumericUpDown1.ReadOnly = True
            NumericUpDown2.ReadOnly = True

        End If

    End Sub

    Private Sub radInches_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radInches.CheckedChanged

        'Makes Inputs Valid
        If radInches.Checked Then
            NumericUpDown3.ReadOnly = False

        End If

        'Show Convert Button When radInches is Clicked
        If radInches.Checked Then
            btnConvert.Show()

        End If

        'Hides Convert2 Button when radInches is Clicked
        If radInches.Checked Then
            btnConvert.Show()

        End If

        'Makes Inputs ReadOnly
        If radInches.Checked Then
            NumericUpDown1.ReadOnly = True
            NumericUpDown2.ReadOnly = True

        End If

    End Sub

    Private Sub radFeet2_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radFeet2.CheckedChanged

        'Makes Inputs Valid
        If radFeet2.Checked Then
            NumericUpDown1.ReadOnly = False
            NumericUpDown2.ReadOnly = False

        End If

        'Shows Convert2 Button when radFeet2 is Clicked
        If radFeet2.Checked Then
            btnConvert2.Show()

        End If

        'Hides Convert Button when radFeet2 is Clicked
        If radFeet2.Checked Then
            btnConvert.Hide()

        End If

        'Makes Inputs ReadOnly
        If radFeet.Checked Then
            NumericUpDown3.ReadOnly = True

        End If

    End Sub

    Private Sub radFeet_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radFeet.CheckedChanged

        'Makes Inputs Valid
        If radFeet.Checked Then
            NumericUpDown1.ReadOnly = False
            NumericUpDown2.ReadOnly = False

        End If

        'Shows Convert2 Button when radFeet is Clicked
        If radFeet.Checked Then
            btnConvert2.Show()

        End If

        'Hides Convert Button when radFeet is Clicked
        If radFeet.Checked Then
            btnConvert.Hide()

        End If

        'Makes Inputs ReadOnly
        If radFeet2.Checked Then
            NumericUpDown3.ReadOnly = True

        End If

    End Sub

    Private Sub btnConvert_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvert.Click

        'Enables Reset Button
        btnReset.Show()

        'Converts Centimeters To Inches
        If radCentimeters.Checked Then
            lblAnswer.Text = (NumericUpDown3.Text) * 0.39

        End If

        'Displays Units of Final Answer
        If radCentimeters.Checked Then
            lblUnit.Text = "(Inches)"

        End If

        'Converts Inches To Centimeters
        If radInches.Checked Then
            lblAnswer.Text = (NumericUpDown3.Text) * 2.54

        End If

        'Displays Units of Final Answer
        If radInches.Checked Then
            lblUnit.Text = "(Cm)"

        End If

    End Sub

    Private Sub btnConvert2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvert2.Click

        'Enables Reset Button
        btnReset.Show()

        'Converts Feet To Inches
        If radFeet.Checked Then
            lblAnswer.Text = ((NumericUpDown1.Text) * 12) + (NumericUpDown2.Text)

        End If

        'Displays Units of Final Answer
        If radFeet.Checked Then
            lblUnit.Text = "(Inches)"

        End If

        'Displays Units of Final Answer
        If radFeet2.Checked Then
            lblUnit.Text = "(Cm)"

        End If

        'Converts Feet To Centimeters
        If radFeet2.Checked Then
            lblAnswer.Text = (((NumericUpDown1.Text) * 12) + (NumericUpDown2.Text)) * 2.54

        End If

    End Sub

    Private Sub btnReset_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnReset.Click

        'Resets/Clears All Settings
        btnConvert.Hide()
        btnConvert2.Hide()
        NumericUpDown1.ReadOnly = True
        NumericUpDown2.ReadOnly = True
        NumericUpDown3.ReadOnly = True
        radCentimeters.Checked = False
        radInches.Checked = False
        radFeet.Checked = False
        radFeet2.Checked = False
        lblAnswer.Text = ""
        lblUnit.Text = ""
        btnReset.Hide()
        NumericUpDown1.Value = 1
        NumericUpDown2.Value = 8
        NumericUpDown3.Value = 1

    End Sub

    Private Sub PictureBox2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox2.Click

        'Error Message
        MessageBox.Show("Cannot Lock Iphone Apps Are Running", "iPhone")

    End Sub

    Private Sub picLockButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLockButton.Click

        'Hides Height Calculator & Shows Information Panel
        Dim ThirdForm As New frmHeight
        ThirdForm.Hide()

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
End Class