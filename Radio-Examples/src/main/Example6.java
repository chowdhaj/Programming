package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example6 {

	private JFrame frame;
	private boolean isPoweredOff = true; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example6 window = new Example6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFrequency = new JLabel("101.3");
		GridBagConstraints gbc_lblFrequency = new GridBagConstraints();
		gbc_lblFrequency.insets = new Insets(0, 0, 5, 0);
		gbc_lblFrequency.gridx = 0;
		gbc_lblFrequency.gridy = 2;
		frame.getContentPane().add(lblFrequency, gbc_lblFrequency);
		lblFrequency.setVisible(false);
		
		JLabel lblPower = new JLabel("OFF");
		GridBagConstraints gbc_lblPower = new GridBagConstraints();
		gbc_lblPower.insets = new Insets(0, 0, 5, 0);
		gbc_lblPower.gridx = 0;
		gbc_lblPower.gridy = 0;
		frame.getContentPane().add(lblPower, gbc_lblPower);
		
		JButton btnButton = new JButton("Power");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (isPoweredOff) {
					isPoweredOff = false;
					lblPower.setText("ON");
					lblFrequency.setText("101.3");
					lblFrequency.setVisible(true);
				} else {
					isPoweredOff = true;
					lblPower.setText("OFF");
					lblFrequency.setVisible(false);
				}
				
			}
		});
		GridBagConstraints gbc_btnButton = new GridBagConstraints();
		gbc_btnButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnButton.gridx = 0;
		gbc_btnButton.gridy = 1;
		frame.getContentPane().add(btnButton, gbc_btnButton);
		
		
		
		JButton btnScan = new JButton("Scan");
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(isPoweredOff)) {
					lblFrequency.setText("change stuff");
				}
				
			}
		});
		GridBagConstraints gbc_btnScan = new GridBagConstraints();
		gbc_btnScan.gridx = 0;
		gbc_btnScan.gridy = 3;
		frame.getContentPane().add(btnScan, gbc_btnScan);
	}

}
