Public Class frmNotifications

    Private Sub picLockButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLockButton.Click

        'Error Message
        MessageBox.Show("Cannot Lock Iphone, Apps Are Running", "iPhone")

    End Sub

    Private Sub picHomeButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picHomeButton.Click

        'Hides Form2
        Me.Close()

    End Sub

    Private Sub picVolumeUp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeUp.Click

        'Plays Music
        My.Computer.Audio.Play(My.Resources.gta, AudioPlayMode.BackgroundLoop)

    End Sub

    Private Sub picVolumeDown_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picVolumeDown.Click

        'Stops Music
        My.Computer.Audio.Stop()

    End Sub

End Class