package com.polycoding.chopper.gui;

import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

import com.polycoding.chopper.enums.Presets;
import com.polycoding.chopper.Chopper;;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JComboBox<Presets> cmbTree;
	private JButton btnStart;
	private Chopper c;

	public Menu(Chopper c) {

		this.c = c;
		setTitle("Poly");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 160, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		cmbTree = new JComboBox<Presets>(Presets.values());
		GridBagConstraints gbc_cmbTree = new GridBagConstraints();
		gbc_cmbTree.insets = new Insets(0, 0, 5, 0);
		gbc_cmbTree.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbTree.gridx = 0;
		gbc_cmbTree.gridy = 0;
		contentPane.add(cmbTree, gbc_cmbTree);

		btnStart = new JButton("Start Script");
		btnStart.addActionListener(((ae) -> startScript()));
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 1;
		contentPane.add(btnStart, gbc_btnStart);
	}

	private void startScript() {
		//amazing use of enums in order to reuse code and reduce redundancy
		c.setTreeType(Presets.values()[cmbTree.getSelectedIndex()]);
		setVisible(false);
	}
}
