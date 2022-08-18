Public Class frmArray

    Private Sub frmArray_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Checks Red Button
        radRed.Checked = True

        txtSource.Hide()
        txtsource2.hide()
        txtsource3.hide()

    End Sub

    Private Sub frmArray_DoubleClick(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.DoubleClick

        'Clears Board
        Me.Refresh()
        MsgBox("Done!")

    End Sub

    Private Sub lblR_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblR.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblA_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblA.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblI_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblI.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblN_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblN.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblB_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblB.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblO_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblO.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub lblW_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblW.Click

        'Checks Rainbow Option
        radRainbow.Checked = True

    End Sub

    Private Sub AboutToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles AboutToolStripMenuItem.Click

        'Shows AboutBox
        Me.Hide()
        boxAbout.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem.Click

        'Checks For Updates
        MsgBox("Software is up to date!")

    End Sub

    Private Sub MinimizeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MinimizeToolStripMenuItem.Click

        'Minimizes Form
        Me.WindowState = FormWindowState.Minimized

    End Sub

    Private Sub MaximizeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MaximizeToolStripMenuItem.Click

        'Maximizes Form
        Me.WindowState = FormWindowState.Maximized

    End Sub

    Private Sub ExitToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem2.Click

        'Minimizes Form
        Me.WindowState = FormWindowState.Normal

    End Sub

    Private Sub ExitToolStripMenuItem3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem3.Click

        'Exits Application
        Application.Exit()

    End Sub

    Private Sub WhiteToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles WhiteToolStripMenuItem.Click

        'Changes BackColor.White
        Me.BackColor = Color.White
        grpColor.ForeColor = Color.Black

    End Sub

    Private Sub BlackToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlackToolStripMenuItem.Click

        'Changes BackColor.Black
        Me.BackColor = Color.Black
        grpColor.ForeColor = Color.White

    End Sub

    Private Sub GreyToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreyToolStripMenuItem.Click

        'Changes BackColor.Grey
        Me.BackColor = Color.DimGray
        grpColor.ForeColor = Color.White

    End Sub

    Private Sub BrownToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BrownToolStripMenuItem.Click

        'Changes BackColor.Brown
        Me.BackColor = Color.Maroon
        grpColor.ForeColor = Color.White

    End Sub

    Private Sub GoldToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GoldToolStripMenuItem.Click

        'Changes BackColor.Brown
        Me.BackColor = Color.Gold
        grpColor.ForeColor = Color.White

    End Sub

    Private Sub ClearFormToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ClearFormToolStripMenuItem.Click

        'Clears form table
        Me.Refresh()

    End Sub

    Private Sub INFOToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles INFOToolStripMenuItem.Click

        'Shows Info Form
        Me.Hide()
        frmInfo.Show()

    End Sub

    Private Sub ExitToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem1.Click

        'Example Array
        Dim formsurface As Graphics = Me.CreateGraphics
        Dim intY As Integer

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, intY, 520, 0, 0)
            formsurface.DrawLine(Pens.Red, 0, 0, 520, intY)
        Next

        Me.Refresh()

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Aquamarine, intY, 520, 0, 0)
            formsurface.DrawLine(Pens.Aquamarine, 0, 0, 520, intY)
        Next

        Me.Refresh()

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.LimeGreen, intY, 520, 0, 0)
            formsurface.DrawLine(Pens.LimeGreen, 0, 0, 520, intY)
        Next

        Me.Refresh()

    End Sub

    Private Sub btnAnimation_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation.Click

        'Clears Board
        Me.Refresh()

        'Settings For Rainbow Button
        If radRainbow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.White, 0, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.White, intY, 520, 520, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.White, intY, 0, 520, 520)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.White, 0, 0, 520, intY)
                formsurface.DrawLine(Pens.White, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.White, intY, 0, 520, 520)
                formsurface.DrawLine(Pens.White, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.White, intY, 520, 520, 0)
            Next

            MsgBox("Still Working on Rainbow")

        End If



        'Settings For Red Button
        If radRed.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Red, 0, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Red, intY, 520, 520, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Red, intY, 0, 520, 520)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Red, 0, 0, 520, intY)
                formsurface.DrawLine(Pens.Red, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Red, intY, 0, 520, 520)
                formsurface.DrawLine(Pens.Red, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Red, intY, 520, 520, 0)
            Next

        End If

        'Settings For Blue Button
        If radBlue.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Blue, 0, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Blue, intY, 520, 520, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Blue, intY, 0, 520, 520)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Blue, 0, 0, 520, intY)
                formsurface.DrawLine(Pens.Blue, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Blue, intY, 0, 520, 520)
                formsurface.DrawLine(Pens.Blue, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Blue, intY, 520, 520, 0)
            Next

        End If

        'Settings For Green Button
        If radGreen.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Green, 0, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Green, intY, 520, 520, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Green, intY, 0, 520, 520)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Green, 0, 0, 520, intY)
                formsurface.DrawLine(Pens.Green, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Green, intY, 0, 520, 520)
                formsurface.DrawLine(Pens.Green, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Green, intY, 520, 520, 0)
            Next

        End If

        'Settings For Yellow Button
        If radYellow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Yellow, 0, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 520, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 520, 520)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 0, 0)
                formsurface.DrawLine(Pens.Yellow, 0, 0, 520, intY)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 0, 520)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 520, 520)
                formsurface.DrawLine(Pens.Yellow, 520, 0, 0, intY)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 520, 0)
            Next

        End If

    End Sub

    Private Sub btnAnimation2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation2.Click

        Me.Refresh()

        'Settings For RainBow Button

        If radRainbow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 520, 0, intY)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 520, intY, 520 - intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 0, intY, 520 - intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, 520, 0, intY)
                formsurface.DrawLine(Pens.White, intY, 0, 520, intY)
                formsurface.DrawLine(Pens.White, 520, intY, 520 - intY, 520)
                formsurface.DrawLine(Pens.White, 0, intY, 520 - intY, 0)
            Next

            MsgBox("Rework This")

        End If

        'Settings For Red Button
        If radRed.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 520, 0, intY)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, intY, 520 - intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 0, intY, 520 - intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, 520, 0, intY)
                formsurface.DrawLine(Pens.Red, intY, 0, 520, intY)
                formsurface.DrawLine(Pens.Red, 520, intY, 520 - intY, 520)
                formsurface.DrawLine(Pens.Red, 0, intY, 520 - intY, 0)
            Next

        End If

        'Settings For Blue Button
        If radBlue.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 520, 0, intY)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 520, intY, 520 - intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 0, intY, 520 - intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, 520, 0, intY)
                formsurface.DrawLine(Pens.Blue, intY, 0, 520, intY)
                formsurface.DrawLine(Pens.Blue, 520, intY, 520 - intY, 520)
                formsurface.DrawLine(Pens.Blue, 0, intY, 520 - intY, 0)
            Next

        End If

        'Settings For Green Button
        If radGreen.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 520, 0, intY)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 520, intY, 520 - intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 0, intY, 520 - intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, 520, 0, intY)
                formsurface.DrawLine(Pens.Green, intY, 0, 520, intY)
                formsurface.DrawLine(Pens.Green, 520, intY, 520 - intY, 520)
                formsurface.DrawLine(Pens.Green, 0, intY, 520 - intY, 0)
            Next

        End If

        'Settings For Yellow Button
        If radYellow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 0, intY)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 520, intY, 520 - intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 0, intY, 520 - intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 520, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, 520, 0, intY)
                formsurface.DrawLine(Pens.Yellow, intY, 0, 520, intY)
                formsurface.DrawLine(Pens.Yellow, 520, intY, 520 - intY, 520)
                formsurface.DrawLine(Pens.Yellow, 0, intY, 520 - intY, 0)
            Next

        End If

    End Sub

    Private Sub btnAnimation3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation3.Click

        Me.Refresh()

        'Settings for Rainbow Button
        If radRainbow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 0, intY, intY, intY)

            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 520, intY, intY, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, intY, intY, intY, 0)
                formsurface.DrawLine(Pens.White, 0, intY, intY, intY)
                formsurface.DrawLine(Pens.White, intY, intY, intY, 520)
                formsurface.DrawLine(Pens.White, 520, intY, intY, intY)
            Next

            MsgBox("In development")

        End If

        'Settings for Red Button
        If radRed.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, intY)

            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, intY, intY, intY, 0)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, intY)
                formsurface.DrawLine(Pens.Red, intY, intY, intY, 520)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, intY)
            Next

        End If

        'Settings for Blue Button
        If radBlue.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, intY)

            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 520, intY, intY, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, intY, intY, intY, 0)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, intY)
                formsurface.DrawLine(Pens.Blue, intY, intY, intY, 520)
                formsurface.DrawLine(Pens.Blue, 520, intY, intY, intY)
            Next

        End If

        'Settings for Green Button
        If radGreen.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, intY)

            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, intY, intY, intY, 0)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, intY)
                formsurface.DrawLine(Pens.Green, intY, intY, intY, 520)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, intY)
            Next

        End If

        'Settings for Yellow Button
        If radYellow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, intY)

            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, intY)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, intY, intY, intY, 0)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, intY)
                formsurface.DrawLine(Pens.Yellow, intY, intY, intY, 520)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, intY)
            Next

        End If

    End Sub

    Private Sub RainbowToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RainbowToolStripMenuItem.Click

        'Line Animation Rainbow
        radRainbow.Checked = True
        btnAnimation.PerformClick()

    End Sub

    Private Sub RedToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RedToolStripMenuItem.Click

        'Line Animation Red
        radRed.Checked = True
        btnAnimation.PerformClick()

    End Sub

    Private Sub BlueToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlueToolStripMenuItem.Click

        'Line Animation Blue
        radBlue.Checked = True
        btnAnimation.PerformClick()

    End Sub

    Private Sub GreenToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreenToolStripMenuItem.Click

        'Line Animation Green
        radGreen.Checked = True
        btnAnimation.PerformClick()

    End Sub

    Private Sub YellowToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles YellowToolStripMenuItem.Click

        'Line Animation Yellow
        radYellow.Checked = True
        btnAnimation.PerformClick()

    End Sub

    Private Sub RainbowToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RainbowToolStripMenuItem1.Click

        'Parabola Animation Rainbow
        radRainbow.Checked = True
        btnAnimation2.PerformClick()

    End Sub

    Private Sub RedToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RedToolStripMenuItem1.Click

        'Parabola Animation Red
        radRed.Checked = True
        btnAnimation2.PerformClick()

    End Sub

    Private Sub BlueToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlueToolStripMenuItem1.Click

        'Parabola Animation Blue
        radBlue.Checked = True
        btnAnimation2.PerformClick()

    End Sub

    Private Sub GreenToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreenToolStripMenuItem1.Click

        'Parabola Animation Green
        radGreen.Checked = True
        btnAnimation2.PerformClick()

    End Sub

    Private Sub YellowToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles YellowToolStripMenuItem1.Click

        'Parabola Animation Yellow
        radYellow.Checked = True
        btnAnimation2.PerformClick()

    End Sub

    Private Sub RainbowToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RainbowToolStripMenuItem2.Click

        'Parabola Animation Rainbow
        radRainbow.Checked = True
        btnAnimation3.PerformClick()

    End Sub

    Private Sub RedToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RedToolStripMenuItem2.Click

        'Parabola Animation Red
        radRed.Checked = True
        btnAnimation3.PerformClick()

    End Sub

    Private Sub BlueToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlueToolStripMenuItem2.Click

        'Parabola Animation Blue
        radBlue.Checked = True
        btnAnimation3.PerformClick()

    End Sub

    Private Sub GreenToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreenToolStripMenuItem2.Click

        'Parabola Animation Green
        radGreen.Checked = True
        btnAnimation3.PerformClick()

    End Sub

    Private Sub YellowToolStripMenuItem2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles YellowToolStripMenuItem2.Click

        'Parabola Animation Yellow
        radYellow.Checked = True
        btnAnimation3.PerformClick()

    End Sub

    Private Sub RainbowToolStripMenuItem9_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RainbowToolStripMenuItem9.Click

        'Movie Rainbow
        radRainbow.Checked = True
        btnAnimation.PerformClick()
        btnAnimation2.PerformClick()
        btnAnimation3.PerformClick()
        Me.Refresh()
        MsgBox("Hope You Enjoyed!")

    End Sub

    Private Sub RedToolStripMenuItem8_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RedToolStripMenuItem8.Click

        'Movie Red
        radRed.Checked = True
        btnAnimation.PerformClick()
        btnAnimation2.PerformClick()
        btnAnimation3.PerformClick()
        Me.Refresh()
        MsgBox("Hope You Enjoyed!")

    End Sub

    Private Sub BlueToolStripMenuItem9_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BlueToolStripMenuItem9.Click

        'Movie Blue
        radBlue.Checked = True
        btnAnimation.PerformClick()
        btnAnimation2.PerformClick()
        btnAnimation3.PerformClick()
        Me.Refresh()
        MsgBox("Hope You Enjoyed!")

    End Sub

    Private Sub GreenToolStripMenuItem10_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GreenToolStripMenuItem10.Click

        'Movie Green
        radGreen.Checked = True
        btnAnimation.PerformClick()
        btnAnimation2.PerformClick()
        btnAnimation3.PerformClick()
        Me.Refresh()
        MsgBox("Hope You Enjoyed!")

    End Sub

    Private Sub YellowToolStripMenuItem9_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles YellowToolStripMenuItem9.Click

        'Movie Yellow
        radYellow.Checked = True
        btnAnimation.PerformClick()
        btnAnimation2.PerformClick()
        btnAnimation3.PerformClick()
        Me.Refresh()
        MsgBox("Hope You Enjoyed!")
    End Sub

    Private Sub ToolStripMenuItem15_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ToolStripMenuItem15.Click

        'Shows Source
        txtSource.Show()

    End Sub

    Private Sub ToolStripMenuItem16_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ToolStripMenuItem16.Click

        'Shows Source
        txtSource2.Show()

    End Sub

    Private Sub ToolStripMenuItem17_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ToolStripMenuItem17.Click

        'Shows Source
        txtSource3.Show()

    End Sub

    Private Sub txtSource_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtSource.Click

        'Shows Source
        txtSource.Hide()

    End Sub

    Private Sub txtsource2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtSource2.Click

        'Shows Source
        txtSource2.Hide()

    End Sub

    Private Sub txtSource3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtSource3.Click

        'Shows Source
        txtSource3.Hide()

    End Sub

    Private Sub OpenPaintToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OpenPaintToolStripMenuItem.Click

        'Shows Array Menu
        frmPaint.Show()

    End Sub

    Private Sub btnanimation4_click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation4.Click

        Me.Refresh()

        If radRainbow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 0, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 0, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 520, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 520, intY, intY, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.White, 0, intY, intY, 0)
                formsurface.DrawLine(Pens.White, 520, intY, intY, 520)
                formsurface.DrawLine(Pens.White, 0, intY, intY, 520)
                formsurface.DrawLine(Pens.White, 520, intY, intY, 0)
            Next

        End If

        If radRed.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, 0)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, 520)
                formsurface.DrawLine(Pens.Red, 0, intY, intY, 520)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, 0)
            Next

        End If

        If radBlue.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 520, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Red, 520, intY, intY, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, 0)
                formsurface.DrawLine(Pens.Blue, 520, intY, intY, 520)
                formsurface.DrawLine(Pens.Blue, 0, intY, intY, 520)
                formsurface.DrawLine(Pens.Blue, 520, intY, intY, 0)
            Next

        End If

        If radGreen.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, 0)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, 520)
                formsurface.DrawLine(Pens.Green, 0, intY, intY, 520)
                formsurface.DrawLine(Pens.Green, 520, intY, intY, 0)
            Next

        End If

        If radYellow.Checked = True Then

            Dim formsurface As Graphics = Me.CreateGraphics
            Dim intY As Integer
            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, 0)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, 520)
            Next

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, 0)
            Next

            Me.Refresh()

            For intY = 0 To 520 Step 10
                System.Threading.Thread.Sleep(12)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, 0)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, 520)
                formsurface.DrawLine(Pens.Yellow, 0, intY, intY, 520)
                formsurface.DrawLine(Pens.Yellow, 520, intY, intY, 0)
            Next

        End If

    End Sub

    Private Sub btnAnimation5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation5.Click

        Dim formsurface As Graphics = Me.CreateGraphics
        Dim intY As Integer

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 0, 520, intY, 0)
        Next

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 520, intY, 0, 520)
        Next

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 0, intY, 520, 0)
        Next

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 520, 0, intY, 520)
        Next

        Me.Refresh()

        For intY = 0 To 520 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 520, intY, 0, 520)
            formsurface.DrawLine(Pens.Red, 0, 520, intY, 0)
            formsurface.DrawLine(Pens.Red, 520, 0, intY, 520)
            formsurface.DrawLine(Pens.Red, 0, intY, 520, 0)
        Next

    End Sub

    Private Sub Button6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button6.Click

        Dim formsurface As Graphics = Me.CreateGraphics
        Dim intY As Integer

        For intY = 0 To 300 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, intY, 520 - intY, 520, intY)
        Next

        For intY = 0 To 300 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, intY, 520 - intY, 0, intY)
        Next

    End Sub

    Private Sub btnAnimation7_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnimation7.Click

        Dim formsurface As Graphics = Me.CreateGraphics
        Dim intY As Integer

        For intY = 0 To 300 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 520, 0, intY - 520, 520)
        Next

        For intY = 0 To 300 Step 10
            System.Threading.Thread.Sleep(12)
            formsurface.DrawLine(Pens.Red, 520, 520, intY - 520, 0)
        Next

    End Sub

    Private Sub btnCustom_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCustom.Click

        If radRed.Checked = True Then
            btnAnimation.PerformClick()
            btnAnimation2.PerformClick()
            btnAnimation3.PerformClick()
            btnAnimation4.PerformClick()
            btnAnimation5.PerformClick()
            btnAnimation6.PerformClick()
            btnAnimation7.PerformClick()
            btnAnimation9.PerformClick()
        End If

        If radBlue.Checked = True Then
            btnAnimation.PerformClick()
            btnAnimation2.PerformClick()
            btnAnimation3.PerformClick()
            btnAnimation4.PerformClick()
            btnAnimation5.PerformClick()
            btnAnimation6.PerformClick()
            btnAnimation7.PerformClick()
            btnAnimation9.PerformClick()
        End If

        If radGreen.Checked = True Then
            btnAnimation.PerformClick()
            btnAnimation2.PerformClick()
            btnAnimation3.PerformClick()
            btnAnimation4.PerformClick()
            btnAnimation5.PerformClick()
            btnAnimation6.PerformClick()
            btnAnimation7.PerformClick()
            btnAnimation9.PerformClick()
        End If

        If radYellow.Checked = True Then
            btnAnimation.PerformClick()
            btnAnimation2.PerformClick()
            btnAnimation3.PerformClick()
            btnAnimation4.PerformClick()
            btnAnimation5.PerformClick()
            btnAnimation6.PerformClick()
            btnAnimation7.PerformClick()
            btnAnimation9.PerformClick()
        End If

        If radRainbow.Checked = True Then
            btnAnimation.PerformClick()
            btnAnimation2.PerformClick()
            btnAnimation3.PerformClick()
            btnAnimation4.PerformClick()
            btnAnimation5.PerformClick()
            btnAnimation6.PerformClick()
            btnAnimation7.PerformClick()
            btnAnimation9.PerformClick()
        End If

    End Sub
End Class
