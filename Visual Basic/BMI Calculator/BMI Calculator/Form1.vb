


'ICS
'Mr.Simler
'Jatin





Public Class frmHomeScreen

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Prevents Home Button From Exiting Application
        picHomeButton.SuspendLayout()

    End Sub

    Private Sub picLockButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picLockButton.Click

        'Closes Program
        Me.Close()

    End Sub

    Private Sub picSilentMode_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picSilentButton.Click

        'Shows Notifications
        System.Threading.Thread.Sleep(12)
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

    Private Sub picbmicalc_click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picbmicalc.Click

        'Shows Form5
        Dim Fifthform As New frmBMI
        Fifthform.Show()

    End Sub

    Private Sub picheightap_click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picheightapp.Click

        'Shows Height App
        Dim ThirdForm As New frmHeight
        ThirdForm.Show()


    End Sub

    Private Sub picweightapp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picweightapp.Click

        'Shows Form4
        Dim FourthForm As New frmWeight
        FourthForm.Show()

    End Sub

    Private Sub picIpod_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picIpod.Click

        'Plays Music
        My.Computer.Audio.Play(My.Resources.gta, AudioPlayMode.BackgroundLoop)

    End Sub

    Private Sub picMessage_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMessage.Click

        'Error Message
        MessageBox.Show("You Have No Friends To Message To", "iPhone")

    End Sub

    Private Sub picCalendar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picCalendar.Click

        'Error Message
        MessageBox.Show("It Doesn't Matter, We Are All Going To Die", "iPhone")

    End Sub

    Private Sub picPhotos_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPhotos.Click

        'Error Message
        MessageBox.Show("If There Is No Camera, Then Why Will There Be Photos?", "iPhone")

    End Sub

    Private Sub picCamera_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picCamera.Click

        ''Error Message
        MessageBox.Show("Webcam Not Found", "iPhone")

    End Sub

    Private Sub picYoutube_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picYoutube.Click

        'Error Message
        MessageBox.Show("You Have Been Banned From Youtube", "iPhone")

    End Sub

    Private Sub picStocks_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picStocks.Click

        'Error Message
        MessageBox.Show("Invest In Any Company, BUT Apple", "iPhone")

    End Sub

    Private Sub picMaps_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMaps.Click

        'Error Message
        MessageBox.Show("The World Is Flat", "iPhone")

    End Sub

    Private Sub picWeather_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picWeather.Click

        'Error Message
        MessageBox.Show("Are You Honestly Too Lazy To Look Out The Window?", "iPhone")

    End Sub

    Private Sub picNotes_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picNotes.Click

        'Shows Form2
        Dim SecondForm As New frmNotifications
        SecondForm.Show()

    End Sub

    Private Sub pucUtilities_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles pucUtilities.Click

        'Error Message
        MessageBox.Show("If you notice this" + vbNewLine + "notice you will" + vbNewLine + "notice that this" + vbNewLine + "notice was not" + vbNewLine + "worth noticing", "iPhone")

    End Sub

    Private Sub piciTunes_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles piciTunes.Click

        'Error Message
        MessageBox.Show("Why Buy Songs? Get Them For Free Using Youtube", "iPhone")

    End Sub

    Private Sub picAppStore_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picAppStore.Click

        'Error Message
        MessageBox.Show("Android > iPhone" + vbNewLine + "Windows > OS X", "iPhone")

    End Sub

    Private Sub picSettings_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picSettings.Click

        'Error Message
        MessageBox.Show("Limited Users Don't Have Access To The Admin Control Panel", "iPhone")

    End Sub

    Private Sub picPhone_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picPhone.Click

        'Error Message
        MessageBox.Show("Sim Not Found" + vbNewLine + "Phone Is Locked To AT&T", "iPhone")

    End Sub

    Private Sub picMail_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picMail.Click

        'Error Message
        MessageBox.Show("You Have Been Banned From Every Mail", "iPhone")

    End Sub

    Private Sub picSafari_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picSafari.Click

        'Error Message
        MessageBox.Show("Why Use Safari, When You Have Google Chrome", "iPhone")

    End Sub

    Private Sub Form1_MouseEnter(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.MouseEnter

        'Stops Timer & Music When Mouse Enters Form
        frmLoading.timStart.Stop()

    End Sub
End Class

