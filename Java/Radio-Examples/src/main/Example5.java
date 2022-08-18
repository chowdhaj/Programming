package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example5 {

	private JFrame frmRadioProgram;
	private JLabel lblFrequency = new JLabel("101.3");
	private JButton btnScan = new JButton("Scan");
	
	private static boolean isPoweredOn = false;
	private static float radioFrequency = 0.0f;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example5 window = new Example5();
					window.frmRadioProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadioProgram = new JFrame();
		frmRadioProgram.setResizable(false);
		frmRadioProgram.setAlwaysOnTop(true);
		frmRadioProgram.setTitle("Radio Program");
		frmRadioProgram.setBounds(100, 100, 294, 191);
		frmRadioProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0,
			Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0,
			Double.MIN_VALUE};
		frmRadioProgram.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblPower = new JLabel("OFF");
		GridBagConstraints gbc_lblPower = new GridBagConstraints();
		gbc_lblPower.insets = new Insets(0, 0, 5, 0);
		gbc_lblPower.gridx = 0;
		gbc_lblPower.gridy = 0;
		frmRadioProgram.getContentPane().add(lblPower, gbc_lblPower);
		
		GridBagConstraints gbc_lblFrequency = new GridBagConstraints();
		gbc_lblFrequency.insets = new Insets(0, 0, 5, 0);
		gbc_lblFrequency.gridx = 0;
		gbc_lblFrequency.gridy = 2;
		frmRadioProgram.getContentPane().add(lblFrequency,
			gbc_lblFrequency);
		lblFrequency.setVisible(false);
		
		GridBagConstraints gbc_btnScan = new GridBagConstraints();
		gbc_btnScan.gridx = 0;
		gbc_btnScan.gridy = 3;
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (isPoweredOn) {
					radioFrequency = Float.parseFloat(
						lblFrequency.getText()); 
					radioFrequency -= 0.1;
					lblFrequency.setText(
						String.valueOf(radioFrequency));
				} else {
					System.out.println("How the...?");
				}
				
			}
		});
		frmRadioProgram.getContentPane().add(btnScan, gbc_btnScan);
		btnScan.setVisible(false);
		
		JButton btnPower = new JButton("Power");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (isPoweredOn) {
					isPoweredOn = false; // turn off
				} else {
					isPoweredOn = true; // turn on
				}
				
				if (isPoweredOn) { // Not ON
					lblPower.setText("ON");
					lblFrequency.setVisible(true);
					btnScan.setVisible(true);
				} else { // Power Off
					lblPower.setText("OFF");
					lblFrequency.setVisible(false);
					btnScan.setVisible(false);
					lblFrequency.setText("101.3");
					//btnPower.setText("Power");
				}
			}
		});
		GridBagConstraints gbc_btnPower = new GridBagConstraints();
		gbc_btnPower.insets = new Insets(0, 0, 5, 0);
		gbc_btnPower.gridx = 0;
		gbc_btnPower.gridy = 1;
		frmRadioProgram.getContentPane().add(btnPower, gbc_btnPower);
	}

}
