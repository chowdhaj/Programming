package com.polycoding.bond.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.polycoding.bond.price.*;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;

import com.polycoding.bond.Bond;

public class Menu extends JFrame {

	private JLabel lblKing;
	private JButton btnStart;
	private JPanel contentPane;
	private JRadioButton radReturnChange;
	private JFormattedTextField txtfldKingsName;
	private JComboBox cmbBondPrices, cmbEndingAction;
	private JLabel lblPrices;
	private Item i;
	private Bond b;
	 
	public Menu(Bond b) {
		this.b = b;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 210, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblKing = new JLabel("Who Is The Mule King?");
		GridBagConstraints gbc_lblKing = new GridBagConstraints();
		gbc_lblKing.insets = new Insets(0, 0, 5, 0);
		gbc_lblKing.gridx = 0;
		gbc_lblKing.gridy = 0;
		contentPane.add(lblKing, gbc_lblKing);

		txtfldKingsName = new JFormattedTextField();
		txtfldKingsName.setText("Enter RSN Here");
		GridBagConstraints gbc_txtfldKingsName = new GridBagConstraints();
		gbc_txtfldKingsName.insets = new Insets(0, 0, 5, 0);
		gbc_txtfldKingsName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfldKingsName.gridx = 0;
		gbc_txtfldKingsName.gridy = 1;
		contentPane.add(txtfldKingsName, gbc_txtfldKingsName);
				
		i = new Item("Old school bond", 13190);
		
		cmbBondPrices = new JComboBox();
		cmbBondPrices.setModel(new DefaultComboBoxModel(new String[] {"Low Price: " + i.getLow(), "Regular Price: " + i.getRegular(), 
				"High Price: " + i.getHigh(), "Custom Price: You Pick"}));
		GridBagConstraints gbc_cmbBondPrices = new GridBagConstraints();
		gbc_cmbBondPrices.insets = new Insets(0, 0, 5, 0);
		gbc_cmbBondPrices.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBondPrices.gridx = 0;
		gbc_cmbBondPrices.gridy = 2;
		contentPane.add(cmbBondPrices, gbc_cmbBondPrices);
		
		btnStart = new JButton("Start Script");
		//btnStart.addActionListener(((ae) -> btnStart()));		
		
		lblPrices = new JLabel("[[Bond Prices Retrieved From OS Buddy]]");
		lblPrices.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		GridBagConstraints gbc_lblPrices = new GridBagConstraints();
		gbc_lblPrices.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrices.gridx = 0;
		gbc_lblPrices.gridy = 3;
		contentPane.add(lblPrices, gbc_lblPrices);
		
		radReturnChange = new JRadioButton("Return Change?");
		GridBagConstraints gbc_radReturnChange = new GridBagConstraints();
		gbc_radReturnChange.fill = GridBagConstraints.VERTICAL;
		gbc_radReturnChange.insets = new Insets(0, 0, 5, 0);
		gbc_radReturnChange.gridx = 0;
		gbc_radReturnChange.gridy = 4;
		contentPane.add(radReturnChange, gbc_radReturnChange);
		
		cmbEndingAction = new JComboBox();
		cmbEndingAction.setModel(new DefaultComboBoxModel(new String[] {"Stop Script", "Trade & Logout", 
				"Walk To Lumby", "Walk To Edgeville", "Walk To Falador", "Walk To Draynor", "Walk To Varrock"}));
		GridBagConstraints gbc_cmbEndingAction = new GridBagConstraints();
		gbc_cmbEndingAction.insets = new Insets(0, 0, 5, 0);
		gbc_cmbEndingAction.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbEndingAction.gridx = 0;
		gbc_cmbEndingAction.gridy = 5;
		contentPane.add(cmbEndingAction, gbc_cmbEndingAction);
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 6;
		contentPane.add(btnStart, gbc_btnStart);
	}
	
	public void btnStart() {
		
		b.setMuleKingName(txtfldKingsName.getText());
		
		if (cmbBondPrices.getSelectedIndex() == 0) {
			b.setBondPrice(i.getLow());
		} else if (cmbBondPrices.getSelectedIndex() == 1) {
			b.setBondPrice(i.getRegular());
		} else if (cmbBondPrices.getSelectedIndex() == 2) {
			b.setBondPrice(i.getHigh());
		} else if (cmbBondPrices.getSelectedIndex() == 3) {
			b.setBondPrice(-69);
		}
		
		if (radReturnChange.isSelected()) {
			b.setReturnChange(true);
		}
		
		b.setEndingAction(cmbEndingAction.getSelectedIndex());

		setVisible(false);
	}
}
