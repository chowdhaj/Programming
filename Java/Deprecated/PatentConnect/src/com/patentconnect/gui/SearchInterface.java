package com.patentconnect.gui;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.patentconnect.tools.Parser;

public class SearchInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchInterface frame = new SearchInterface();
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
	public SearchInterface() {
		
		/*
		 * Properties of the window; characteristics such as size, dimension, border, etc.
		 * The absolute size of the window is 370 x 180 (width x height). This is immutable.
		 */
		setMinimumSize(new Dimension(370, 180));
		setMaximumSize(new Dimension(370, 180));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
		/*
		 * This block of code contains the settings for the PatentConnect Label
		 * at the top of the program. It sets the font and color and size of the label,
		 * as well as position/coordinates.
		 */
		JLabel lblPatentconnect = DefaultComponentFactory.getInstance().createLabel("PatentConnect");
		lblPatentconnect.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_lblPatentconnect = new GridBagConstraints();
		gbc_lblPatentconnect.gridwidth = 19;
		gbc_lblPatentconnect.insets = new Insets(0, 0, 5, 5);
		gbc_lblPatentconnect.gridx = 0;
		gbc_lblPatentconnect.gridy = 0;
		contentPane.add(lblPatentconnect, gbc_lblPatentconnect);

		/*
		 * Properties of the TextField. The TextField is where the user enters in
		 * the patent ID they would like to look up. The properties, such as size, of
		 * the text field are below.
		 */
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.gridwidth = 13;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		/*
		 * Properties and behaviour of the "Search" button that is located below
		 * the TextField and PatentConnect Label. The properties indicate things like
		 * size and position. The behaviour is what the program will do when the button
		 * is clicked. When clicked, it will parse user input and process it. It will
		 * check to see if it fits the criteria for the patent ID.
		 */
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Get text from TextField and store into String
				String parseField = textField.getText();
				
				// Store exit code from Parser into an int
				int exitCode = Parser.parseExitCode(parseField);
				
				// Switch Ladder 
				switch(exitCode) {
					case 0: // If String is empty
						System.out.println(" | Exit Code: 0");
						lblStatus.setForeground(Color.GRAY); // Change Status label to Gray
						lblStatus.setText("Status: Waiting For User Input");
						break;
					case 1: // If String is of correct format
						System.out.println(" | Exit Code: 1");
						lblStatus.setForeground(Color.GREEN); // Change Status label to Green
						lblStatus.setText("Status: Please stand by while we process your request...");
						break;
					case 2: // If String is not the correct length
						System.out.println(" | Exit Code: 2");
						lblStatus.setForeground(Color.GRAY); // Change Status label to Gray
						lblStatus.setText("Status: Invalid patent number");
						break;
					case 3: // If String could not be converted into BigInteger
						System.out.println(" | Exit Code: 3");
						lblStatus.setForeground(Color.RED); // Change Status label to Red 
						lblStatus.setText("Status: This is not a number. Please try again");
						break;
					case 4: // Last case for Parser
						System.out.print(" | Exit Code : 4");
						lblStatus.setForeground(Color.BLACK); // Change Status label to Black
						lblStatus.setText("Status: Unknown error encountered. Please try again");
						break;
					default: // In case all other cases are not met
						System.out.print("ERROR: Something Went Terribly Wrong. Please Restart PatentConnect.");
						lblStatus.setForeground(Color.BLACK); // Change Status label to Black
						lblStatus.setText("Status: Unknown error encountered. Please try again");
				}
			}
		});
		
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridwidth = 13;
		gbc_btnSearch.gridx = 4;
		gbc_btnSearch.gridy = 3;
		contentPane.add(btnSearch, gbc_btnSearch);

		/*
		 * Properties of the "Status" Label. This label indicates what the program is doing and
		 * if the user input is valid or not. An appropriate message is displayed. For example:
		 * if the user inputs a string with non-numeric values, it will indicate that the input 
		 * does not adhere to standards.
		 */
		lblStatus = DefaultComponentFactory.getInstance().createLabel("Status: Waiting For User Input");
		lblStatus.setForeground(Color.GRAY);
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.gridwidth = 6;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 5;
		gbc_lblStatus.gridy = 4;
		contentPane.add(lblStatus, gbc_lblStatus);
	}
}

/*
 * 	ROUGH CODE
 *  PLEASE IGNORE THIS
				// empty string --> u didnt enter in anything
				// non-numerics are not allowed
				// try to use integer.parseInt
				// correct string --> is all numbers and of length 5 - 7
				
				 * 1. check if empty string 2. try integer.parseint a. if works
				 * then check length => length must be in between 5 to 7 b. if
				 * no work then spit error =>
				 * ("only numerics are allowed of the format XXXXXXX")
				 
				// Color red = new Color(255,0,0);
				// Color green = new Color(0,255,0);
				// Color gray
				// long parseString;
				// System.out.println(textField.getText());
				// System.out.println("#####");
				// System.out.println(textField.toString());
 * 
 */