package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Menu extends JFrame {

	private JPanel contentPane;
	
	private boolean startScript;
	JComboBox cmbFood;
	JCheckBox chbLootRunes;
	JCheckBox chbLootTalies;

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

	public Menu() {
		setTitle("GUI");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 231, 116);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Kill Elemental Wizards");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startScript = true;
				setVisible(false);
			}
		});
		btnStart.setBounds(6, 58, 217, 29);
		contentPane.add(btnStart);
		
		cmbFood = new JComboBox();
		cmbFood.setModel(new DefaultComboBoxModel(new String[] {"Shrimp", "Cooked Chicken", "Sardine", "Cooked Meat", 
				"Bread", "Herring", "Mackerel", "Trout", "Cod", "Pike", "Salmon", "Tuna", "Lobster", "Bass", "Swordfish", 
				"Monkfish", "Shark"}));
		cmbFood.setBounds(6, 6, 217, 27);
		contentPane.add(cmbFood);
		
		chbLootRunes = new JCheckBox("Loot Runes?");
		chbLootRunes.setBounds(6, 33, 115, 23);
		contentPane.add(chbLootRunes);
		
		chbLootTalies = new JCheckBox("Loot Tallies?");
		chbLootTalies.setBounds(110, 33, 110, 23);
		contentPane.add(chbLootTalies);
		
	}
	public boolean getStartScript() { return startScript; }
	
	public String getFoodType() { return (cmbFood.getSelectedItem().toString()); }
	
	public boolean shouldLootRunes() { return (chbLootRunes.isSelected() ? true : false); }
	
	public boolean shouldLootTalies() { return (chbLootTalies.isSelected() ? true: false); }
}
