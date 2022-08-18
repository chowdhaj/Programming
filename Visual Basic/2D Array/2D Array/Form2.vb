Public Class frmPaint

    Dim down = False
    Dim BlackColor As Boolean = False
    Dim RedColor As Boolean = False
    Dim OrangeColor As Boolean = False
    Dim YellowColor As Boolean = False
    Dim GreenColor As Boolean = False
    Dim BlueColor As Boolean = False
    Dim PurpleColor As Boolean = False
    Dim WhiteColor As Boolean = False

    Private Sub picPaint_MouseDown(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picPaint.MouseDown
        down = True
    End Sub

    Private Sub picPaint_MouseMove(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picPaint.MouseMove

        If down = True Then
            If BlackColor = True Then
                picPaint.CreateGraphics.FillEllipse(Brushes.Black, e.X, 10, e.Y, 10)
            Else
                If RedColor = True Then
                    picPaint.CreateGraphics.FillEllipse(Brushes.Red, e.X, e.Y, 10, 10)
                Else
                    If OrangeColor = True Then
                        picPaint.CreateGraphics.FillEllipse(Brushes.Orange, e.X, e.Y, 10, 10)
                    Else
                        If YellowColor = True Then
                            picPaint.CreateGraphics.FillEllipse(Brushes.Yellow, e.X, e.Y, 10, 10)
                        Else
                            If GreenColor = True Then
                                picPaint.CreateGraphics.FillEllipse(Brushes.Green, e.X, e.Y, 10, 10)
                            Else
                                If BlueColor = True Then
                                    picPaint.CreateGraphics.FillEllipse(Brushes.Blue, e.X, e.Y, 10, 10)
                                Else
                                    If PurpleColor = True Then
                                        picPaint.CreateGraphics.FillEllipse(Brushes.Magenta, e.X, e.Y, 10, 10)
                                    Else
                                        If WhiteColor = True Then
                                            picPaint.CreateGraphics.FillEllipse(Brushes.White, e.X, e.Y, 10, 10)
                                        End If
                                    End If
                                End If
                            End If
                        End If
                    End If
                End If
            End If
        End If

    End Sub

    Private Sub picPaint_MouseUp(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picPaint.MouseUp

        down = False

    End Sub

    Private Sub AboutToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles AboutToolStripMenuItem1.Click

        'Shows Information
        boxAbout.Show()

    End Sub

    Private Sub ClearAllToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ClearAllToolStripMenuItem.Click

        'Clears Board
        Me.Refresh()

    End Sub

    Private Sub ExitToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem2.Click

        'Exits Paint
        Me.Close()
        frmArray.Show()

    End Sub

    Private Sub RedToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RedToolStripMenuItem1.Click

        'Sets BG Color To Red
        picPaint.BackColor = Color.Red

    End Sub

    Private Sub BlueToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlueToolStripMenuItem1.Click

        'Sets BG Color To Blue
        picPaint.BackColor = Color.Blue

    End Sub

    Private Sub GreenToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreenToolStripMenuItem1.Click

        'Sets BG Color To Green
        picPaint.BackColor = Color.Green

    End Sub

    Private Sub YellowToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles YellowToolStripMenuItem1.Click

        'Sets BG Color To Yellow
        picPaint.BackColor = Color.Yellow

    End Sub

    Private Sub PurpleToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PurpleToolStripMenuItem1.Click

        'Sets BG Color To Purple
        picPaint.BackColor = Color.Purple

    End Sub

    Private Sub BlackToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlackToolStripMenuItem.Click

        'Sets BG Color To Black
        picPaint.BackColor = Color.Black

    End Sub

    Private Sub WhiteToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles WhiteToolStripMenuItem.Click

        'Sets BG Color To White
        picPaint.BackColor = Color.White

    End Sub

    Private Sub OrangeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OrangeToolStripMenuItem.Click

        'Sets BG Color To Orange
        picPaint.BackColor = Color.Orange

    End Sub

    Private Sub RedToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorR.Click

        'Sets Brush Color To Red
        BlackColor = False
        RedColor = True
        OrangeColor = False
        YellowColor = False
        GreenColor = False
        BlueColor = False
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorB_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorB.Click

        'Sets Brush Color To Blue
        BlackColor = False
        RedColor = False
        OrangeColor = False
        YellowColor = False
        GreenColor = False
        BlueColor = True
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorG_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorG.Click

        'Sets Brush Color To Green
        BlackColor = False
        RedColor = False
        OrangeColor = False
        YellowColor = False
        GreenColor = True
        BlueColor = False
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorY_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorY.Click

        'Sets Brush Color To Yellow
        BlackColor = False
        RedColor = False
        OrangeColor = False
        YellowColor = True
        GreenColor = False
        BlueColor = False
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorO_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorO.Click

        'Sets Brush Color To Orange
        BlackColor = False
        RedColor = False
        OrangeColor = True
        YellowColor = False
        GreenColor = False
        BlueColor = False
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorP_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorP.Click

        'Sets Brush Color To Purple
        BlackColor = False
        RedColor = False
        OrangeColor = False
        YellowColor = False
        GreenColor = False
        BlueColor = False
        PurpleColor = True
        WhiteColor = False

    End Sub

    Private Sub ColorBB_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorBB.Click

        'Sets Brush Color To Black
        BlackColor = True
        RedColor = False
        OrangeColor = False
        YellowColor = False
        GreenColor = False
        BlueColor = False
        PurpleColor = False
        WhiteColor = False

    End Sub

    Private Sub ColorW_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ColorW.Click

        'Sets Brush Color To White
        BlackColor = False
        RedColor = False
        OrangeColor = False
        YellowColor = False
        GreenColor = False
        BlueColor = False
        PurpleColor = False
        WhiteColor = True

    End Sub

    Private Sub SaveAsToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles SaveAsToolStripMenuItem1.Click

        Dim sPath As String = "C:\MyArtWork.bmp"
        Dim bmp As Bitmap

        'Saves Files
        MsgBox("Would you really like to save this image?", MsgBoxStyle.YesNo)
        If MsgBoxResult.Yes = True Then
            bmp = Me.picPaint.Image
            bmp.Save(sPath)
            MsgBox("Sucessfully saved" + vbNewLine + "Check in |C:\MyArtWork.bmp|")
        End If

        If MsgBoxResult.No = True Then
            MsgBox("File not saved")
        End If

    End Sub

    Private Sub AboutToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles AboutToolStripMenuItem.Click

        'New board
        Me.Refresh()
        Me.BackColor = Color.White

    End Sub

    Private Sub ExitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem.Click

        'Error Message
        MsgBox("No Media Found")

    End Sub
End Class