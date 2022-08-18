package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings extends JFrame {

	private JPanel contentPane;
		
	private String chosenFood;

	private boolean lootDrops = false, buryBones = false;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public Settings() {
		setAlwaysOnTop(true);
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 192, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbFood = new JComboBox();
		cmbFood.setModel(new DefaultComboBoxModel(new String[] {"Shrimp", "Cooked chicken", "Sardine", "Cooked meat", "Bread", "Herring", 
				"Mackerel", "Trout", "Cod", "Pike", "Salmon", "Tuna", "Lobster", "Bass", "Swordfish", "Monkfish", "Shark"}));
		cmbFood.setMaximumRowCount(20);
		cmbFood.setBounds(16, 101, 151, 27);
		contentPane.add(cmbFood);
		
		JCheckBox chbLootDrops = new JCheckBox("Loot Drops");
		chbLootDrops.setBounds(16, 133, 128, 23);
		contentPane.add(chbLootDrops);
		
		JCheckBox chbBuryBones = new JCheckBox("Bury Bones");
		chbBuryBones.setBounds(16, 162, 128, 23);
		contentPane.add(chbBuryBones);
		
		JLabel lblInstructions1 = new JLabel("1. Start Next To Guards");
		lblInstructions1.setBounds(16, 16, 194, 16);
		contentPane.add(lblInstructions1);
		
		JLabel lblInstructions2 = new JLabel("2. Fill Out Settings Below");
		lblInstructions2.setBounds(16, 45, 166, 16);
		contentPane.add(lblInstructions2);
		
		JLabel lblInstructions3 = new JLabel("3. Click The Start Button");
		lblInstructions3.setBounds(16, 73, 166, 16);
		contentPane.add(lblInstructions3);
		
		JButton btnStart = new JButton("Start Script");
		btnStart.setBounds(6, 189, 176, 29);
		contentPane.add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chosenFood = (String)cmbFood.getSelectedItem();
				if (chbBuryBones.isSelected()) {
					buryBones = true;
					System.out.println(buryBones);
				}
				if (chbLootDrops.isSelected()) {
					lootDrops = true;
					System.out.println(lootDrops);
				}
			}
		});
	}
}
