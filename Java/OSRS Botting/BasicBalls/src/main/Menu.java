package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setResizable(false);
		setTitle("testabcdef's Basic Cannonballer");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 398, 109);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbLastAction = new JComboBox();
		cmbLastAction.setModel(new DefaultComboBoxModel(new String[] {"Stop Script", "Safely Logout", "Get More Bars From GE"}));
		cmbLastAction.setBounds(189, 16, 188, 27);
		contentPane.add(cmbLastAction);
		
		JLabel lblOnceBarsAreCompleted = new JLabel("Once Bars Are Completed:");
		lblOnceBarsAreCompleted.setBounds(20, 20, 171, 16);
		contentPane.add(lblOnceBarsAreCompleted);
		
		JLabel lblPseudoAntibanLevel = new JLabel("Pseudo Anti-Ban Level:");
		lblPseudoAntibanLevel.setBounds(20, 48, 164, 16);
		contentPane.add(lblPseudoAntibanLevel);
		
		JComboBox cmbPseudoAntiBan = new JComboBox();
		cmbPseudoAntiBan.setModel(new DefaultComboBoxModel(new String[] {"None", "Low", "Medium", "High", "Insane"}));
		cmbPseudoAntiBan.setBounds(189, 44, 188, 27);
		contentPane.add(cmbPseudoAntiBan);
	}
}
