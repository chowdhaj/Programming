/*
 * Created by JFormDesigner on Tue Aug 18 19:34:59 EDT 2015
 */

package BasicGUIandPaint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Jeff Smith
 */
public class BasicWoodcutterGUI extends JFrame {
	
    private BasicGUIandPaint ctx;
    
    public BasicWoodcutterGUI(BasicGUIandPaint main){
        this.ctx = main;
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        ctx.setStartScript(true);
        this.setVisible(false);
    }

    private void initComponents() {
        button1 = new JButton();
        comboBox1 = new JComboBox<>();
        label1 = new JLabel();

        //======== this ========
        setTitle("Simple WoodCutter GUI");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Start");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(10, 55, 275, 55);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                "Tree",
                "Oak",
                "Willow",
                "Maple"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(15, 10, 185, 35);

        //---- label1 ----
        label1.setText("Select your tree type.");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(205, 20), label1.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(335, 120));
        pack();
        setLocationRelativeTo(getOwner());
    }

    public String getTreeType() {
        return comboBox1.getSelectedItem().toString();
    }

    private JButton button1;
    private JComboBox<String> comboBox1;
    private JLabel label1;
} 
