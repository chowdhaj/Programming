Public NotInheritable Class boxAbout

    Private Sub OKButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OKButton.Click

        'Closes AboutBox
        Me.Close()
        frmArray.Show()

    End Sub

    Private Sub OKButton_DoubleClick(ByVal sender As Object, ByVal e As System.EventArgs) Handles OKButton.DoubleClick

        'Closes AboutBox
        Me.Close()
        frmPaint.Show()

    End Sub
End Class
