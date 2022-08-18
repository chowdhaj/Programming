Public Class frmSplashScreen

    Private Sub frmSplashScreen_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Starts Timer
        timArray.Start()

    End Sub

    Private Sub frmSplashScreen_FormClosing(ByVal sender As Object, ByVal e As System.Windows.Forms.FormClosingEventArgs) Handles Me.FormClosing

        'Greets User
        MsgBox("Welcome!")

    End Sub

    Private Sub timArray_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles timArray.Tick

        'Sets Increment Level
        barTimer.Increment(1)

        'Starts ProgressBar
        If barTimer.Value = barTimer.Maximum Then

            Me.Close()
            frmArray.Show()

        End If

    End Sub
End Class