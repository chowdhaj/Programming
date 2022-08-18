package radio.gui;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;

import java.awt.Color;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Interface {

	public JFrame frmRadio;
	private JButton btnSwitch, btnReset;
	private boolean isRadioOn = false;
	private JLabel lblAction, lblStatus, lblFrequency, lblMHZ;
	private String topFrequency = "108.0";

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Interface window = new Interface();
//					window.frmRadio.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmRadio = new JFrame();
		frmRadio.setTitle("Radio");
		frmRadio.setResizable(false);
		frmRadio.setBounds(100, 100, 269, 125);
		frmRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmRadio.getContentPane().setLayout(gridBagLayout);
		
		JSeparator sepTop = new JSeparator();
		GridBagConstraints gbc_sepTop = new GridBagConstraints();
		gbc_sepTop.insets = new Insets(0, 0, 5, 5);
		gbc_sepTop.gridx = 1;
		gbc_sepTop.gridy = 1;
		frmRadio.getContentPane().add(sepTop, gbc_sepTop);
		
		lblStatus = DefaultComponentFactory.getInstance().createLabel("Status:");
		lblStatus.setForeground(Color.RED);
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.anchor = GridBagConstraints.EAST;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 1;
		gbc_lblStatus.gridy = 2;
		frmRadio.getContentPane().add(lblStatus, gbc_lblStatus);
		
		lblAction = DefaultComponentFactory.getInstance().createLabel("Off");
		lblAction.setForeground(Color.RED);
		GridBagConstraints gbc_lblAction = new GridBagConstraints();
		gbc_lblAction.anchor = GridBagConstraints.WEST;
		gbc_lblAction.insets = new Insets(0, 0, 5, 5);
		gbc_lblAction.gridx = 2;
		gbc_lblAction.gridy = 2;
		frmRadio.getContentPane().add(lblAction, gbc_lblAction);
		
		lblFrequency = DefaultComponentFactory.getInstance().createLabel("Frequency:");
		lblFrequency.setForeground(Color.RED);
		GridBagConstraints gbc_lblFrequency = new GridBagConstraints();
		gbc_lblFrequency.anchor = GridBagConstraints.EAST;
		gbc_lblFrequency.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrequency.gridx = 1;
		gbc_lblFrequency.gridy = 3;
		frmRadio.getContentPane().add(lblFrequency, gbc_lblFrequency);
		
		lblMHZ = DefaultComponentFactory.getInstance().createLabel("MHz");
		lblMHZ.setForeground(Color.RED);
		GridBagConstraints gbc_lblMHZ = new GridBagConstraints();
		gbc_lblMHZ.anchor = GridBagConstraints.WEST;
		gbc_lblMHZ.insets = new Insets(0, 0, 5, 5);
		gbc_lblMHZ.gridx = 2;
		gbc_lblMHZ.gridy = 3;
		frmRadio.getContentPane().add(lblMHZ, gbc_lblMHZ);
		
		btnSwitch = new JButton("Turn On");
		btnSwitch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (isRadioOn == false) { 
					// If radio is not on, lets turn it on
					isRadioOn = true;
					btnSwitch.setText("Turn Off");
					lblAction.setText("On");
					lblAction.setForeground(Color.GREEN);
					lblStatus.setForeground(Color.GREEN);
					lblFrequency.setForeground(Color.GREEN);
					lblMHZ.setForeground(Color.GREEN);
					lblMHZ.setText(topFrequency);
					System.out.println("Radio: On");
				} else {
					// Radio must be on, so lets turn off
					isRadioOn = false;
					btnSwitch.setText("Turn On");
					lblAction.setText("Off");
					lblAction.setForeground(Color.RED);
					lblStatus.setForeground(Color.RED);
					lblFrequency.setForeground(Color.RED);
					lblMHZ.setForeground(Color.RED);
					lblMHZ.setText("MHz");
					System.out.println("Radio: Off");
				}	
			}
		});
		
		GridBagConstraints gbc_btnSwitch = new GridBagConstraints();
		gbc_btnSwitch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSwitch.gridx = 1;
		gbc_btnSwitch.gridy = 4;
		frmRadio.getContentPane().add(btnSwitch, gbc_btnSwitch);
		
		JButton btnScan = new JButton("Scan");
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (isRadioOn) {
					
					float tempFrequency = Float.parseFloat(lblMHZ.getText());
					if (tempFrequency > 88.0) {
						System.out.println("Tuning...");
						tempFrequency -= 0.5;
						lblMHZ.setText(String.valueOf(tempFrequency));
					} else {
						System.out.println("Bottom Reached");
					}
					
					if (tempFrequency % 1 == 0) {
						lblMHZ.setForeground(Color.GREEN);
					} else {
						lblMHZ.setForeground(Color.BLUE);
					}	
				}
			}
		});
		GridBagConstraints gbc_btnScan = new GridBagConstraints();
		gbc_btnScan.insets = new Insets(0, 0, 5, 5);
		gbc_btnScan.gridx = 2;
		gbc_btnScan.gridy = 4;
		frmRadio.getContentPane().add(btnScan, gbc_btnScan);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (isRadioOn) {
					System.out.println("Reset");
					lblMHZ.setText(topFrequency);
					lblMHZ.setForeground(Color.GREEN);
				}
				
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 5, 5);
		gbc_btnReset.gridx = 3;
		gbc_btnReset.gridy = 4;
		frmRadio.getContentPane().add(btnReset, gbc_btnReset);
	}
}