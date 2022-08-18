Public Class frmWeight

    Private Sub Form4_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Hides ControlBox
        ControlBox = False

        'Hides Buttons/Inputs
        btnReset.Hide()
        NumericUpDown1.ReadOnly = True
        NumericUpDown2.ReadOnly = True
        btnConvert.Hide()
        btnConvert2.Hide()

    End Sub

    Private Sub radKgtoLbs_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radKgtoLbs.CheckedChanged

        'Shows Buttons/Inputs
        NumericUpDown1.ReadOnly = False
        btnConvert.Show()

        If radKgtoLbs.Checked Then
            NumericUpDown2.ReadOnly = True
            btnConvert2.Hide()

        End If

    End Sub

    Private Sub radLbstoKg_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radLbstoKg.CheckedChanged

        'Shows Buttons/Inputs
        NumericUpDown2.ReadOnly = False
        btnConvert2.Show()

        If radLbstoKg.Checked = True Then
            NumericUpDown1.ReadOnly = True
            btnConvert.Hide()
        End If


    End Sub

    Private Sub btnConvert_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvert.Click

        'Converts Kg To Lbs
        If radKgtoLbs.Checked = True Then
            lblanswer.Text = ((NumericUpDown1.Text) * 2.2)
            btnReset.Show()
            lblUnits.Text = ("Lbs")
        End If

    End Sub

    Private Sub btnConvert2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnConvert2.Click

        'Converts Lbs To Kg
        If radLbstoKg.Checked = True Then
            lblanswer.Text = FormatNumber(((NumericUpDown2.Text) / 2.2), "0.000")
            btnReset.Show()
            lblUnits.Text = ("Kg")
        End If

        If NumericUpDown2.Text = 1 Then
            lblanswer.Text = 0.45
        End If

    End Sub

    Private Sub btnReset_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnReset.Click

        'Resets Entire Settngs
        radKgtoLbs.Checked = False
        radLbstoKg.Checked = False
        NumericUpDown1.ReadOnly = True
        NumericUpDown2.ReadOnly = True
        btnConvert.Hide()
        btnConvert2.Hide()
        btnReset.Hide()
        lblanswer.Text = ""
        lblUnits.Text = ""
        NumericUpDown1.Value = 1
        NumericUpDown2.Value = 1

    End Sub

    Private Sub picLock_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLock.Click

        'Error Message
        MessageBox.Show("Cannot Lock Iphone Apps Are Running", "iPhone")

    End Sub

    Private Sub picVolumeDown_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeDown.Click

        'Stops Music
        My.Computer.Audio.Stop()

    End Sub

    Private Sub picHomeButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHomeButton.Click

        'Closes Form
        Me.Close()

    End Sub

    Private Sub picSilent_Click_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picSilent.Click

        'Hides Height Calculator & Shows Information Panel
        Dim FourthForm As New frmWeight
        FourthForm.Hide()

        Dim SecondForm As New frmNotifications
        SecondForm.Show()

    End Sub

    Private Sub picVolumeUp_Click_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeUp.Click

        'Plays Music
        My.Computer.Audio.Play(My.Resources.gta, AudioPlayMode.BackgroundLoop)

    End Sub

End Class