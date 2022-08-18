package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.PubLocation;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import main.Beer;

public class Menu extends JFrame {

	private final Beer data;
	private JButton btnStart;
	private JPanel contentPane;
	private JComboBox cmbEnding;
	private int endingActionAsInt;
	private JComboBox<PubLocation> cmbLocation;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Menu(Beer data) {

		this.data = data;
		setTitle("iBuyBeer");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLocationOfPub = new JLabel("Location Of Pub:");
		lblLocationOfPub.setBounds(20, 20, 115, 16);
		contentPane.add(lblLocationOfPub);

		JLabel lblEndingAction = new JLabel("Ending Action:");
		lblEndingAction.setBounds(20, 59, 99, 16);
		contentPane.add(lblEndingAction);
		
		cmbEnding = new JComboBox();
		cmbEnding.setModel(new DefaultComboBoxModel(new String[] { "Stop Script", "Safely Logout" }));
		cmbEnding.setBounds(131, 55, 190, 27);
		contentPane.add(cmbEnding);

		cmbLocation = new JComboBox<PubLocation>(PubLocation.values());
		cmbLocation.setBounds(131, 16, 190, 27);
		contentPane.add(cmbLocation);

		btnStart = new JButton("Start Script");
		btnStart.addActionListener((ae) -> btnStart());
		btnStart.setBounds(330, 15, 100, 60);
		contentPane.add(btnStart);
	}

	private void btnStart() {
		data.pubLocation = PubLocation.values()[cmbLocation.getSelectedIndex()];
		endingActionAsInt = calculateEndingAction();
		setVisible(false);
	}

	private int calculateEndingAction() {
		if (cmbEnding.getSelectedIndex() == 0) {
			return 0;
		} else if (cmbEnding.getSelectedIndex() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	public int getEndingAction() {
		return this.endingActionAsInt;
	}
}
