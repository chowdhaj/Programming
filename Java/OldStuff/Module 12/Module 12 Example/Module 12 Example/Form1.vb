Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click

        Dim i, j, x, smallest As Integer
        Dim item(2) As String
        Dim temp As String

        txt1.Text = ("Joe's Grocery Store Items")
        'Get 5 item names from user

        For i = 0 To 2

            item(i) = InputBox("Enter an item name ")
        Next

        'Sort in  Alpha order
        For i = 0 To 2

            smallest = i
            For j = i To 2

                If (item(j)) < (item(smallest)) Then

                    smallest = j
                End If
            Next
            temp = item(i)
            item(i) = item(smallest)
            item(smallest) = temp
        Next i


        'Display info stored in the array
        For i = 0 To 2

            lst1.Items.Add(item(i))
        Next









    End Sub
End Class
