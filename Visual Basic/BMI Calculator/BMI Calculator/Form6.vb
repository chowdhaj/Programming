Public Class frmLoading

    Private Sub Form6_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Starts Timer
        timStart.Start()

        My.Computer.Audio.Play(My.Resources.dig, AudioPlayMode.Background)

    End Sub

    Private Sub timStart_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles timStart.Tick

        'Sets Increment Level For Iphone
        barTimer.Increment(1)

        'Starts ProgressBar
        If barTimer.Value = barTimer.Maximum Then

            Me.Close()
            frmHomeScreen.Show()

        End If

    End Sub

End Class