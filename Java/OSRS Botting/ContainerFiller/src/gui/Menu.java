package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import enums.Container;
import enums.Location;
import main.ContainerFiller;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Menu extends JFrame {

	private JButton btnStart;
	private JPanel contentPane;
	private JLabel lblLocation;
	private JLabel lblContainer;
	private final ContainerFiller data;
	private JComboBox<Location> cmbLocation;
	private JComboBox<Container> cmbContainer;
	
	public Menu(ContainerFiller data) {
		
		this.data = data;
		setTitle("GUI");
		setResizable(false);
		setAlwaysOnTop(true);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 150};
		gbl_contentPane.rowHeights = new int[]{42, 42, 0,};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		lblLocation = new JLabel("Location:");
		lblLocation.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblLocation = new GridBagConstraints();
		gbc_lblLocation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocation.gridx = 0;
		gbc_lblLocation.gridy = 0;
		contentPane.add(lblLocation, gbc_lblLocation);
		
		cmbLocation = new JComboBox<Location>(Location.values());
		//cmbLocation = new JComboBox();
		GridBagConstraints gbc_cmbLocation = new GridBagConstraints();
		gbc_cmbLocation.fill = GridBagConstraints.BOTH;
		gbc_cmbLocation.insets = new Insets(0, 0, 5, 5);
		gbc_cmbLocation.gridx = 1;
		gbc_cmbLocation.gridy = 0;
		contentPane.add(cmbLocation, gbc_cmbLocation);
		
		lblContainer = new JLabel("Container:");
		lblContainer.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblContainer = new GridBagConstraints();
		gbc_lblContainer.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblContainer.insets = new Insets(0, 0, 5, 5);
		gbc_lblContainer.gridx = 0;
		gbc_lblContainer.gridy = 1;
		contentPane.add(lblContainer, gbc_lblContainer);
		
		cmbContainer = new JComboBox<Container>(Container.values());
		//cmbContainer = new JComboBox();
		GridBagConstraints gbc_cmbContainer = new GridBagConstraints();
		gbc_cmbContainer.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbContainer.insets = new Insets(0, 0, 5, 5);
		gbc_cmbContainer.gridx = 1;
		gbc_cmbContainer.gridy = 1;
		contentPane.add(cmbContainer, gbc_cmbContainer);
		
		btnStart = new JButton("Start Script");
		btnStart.addActionListener((ae) -> btnStart());
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.gridwidth = 2;
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.fill = GridBagConstraints.BOTH;
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 2;
		contentPane.add(btnStart, gbc_btnStart);
	}
	
	private void btnStart() {
		data.setLocation(Location.values()[cmbLocation.getSelectedIndex()]);
		//data.setLocation((Location)cmbLocation.getSelectedItem());
		data.setContainerType(cmbContainer.getSelectedItem().toString());
		setVisible(false);
	}
}
