package view;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;

public class MenuView extends JPanel {
	private JButton btnStart;

	private JLabel labelDificultad;
	private JLabel labelLenguaje;

	private JRadioButton rdbtnDificil;
	private JRadioButton rdbtnNormal;
	private JRadioButton rdbtnFacil;
	private JRadioButton rdbtnEspanol;
	private JRadioButton rdbtnIngles;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public MenuView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(getBounds());
		setLayout(null);

		btnStart = new JButton("Start");
		btnStart.setBounds(189, 165, 55, 21);
		add(btnStart);
		rdbtnDificil = new JRadioButton("Difícil");
		rdbtnDificil.setActionCommand("HARD");

		buttonGroup.add(rdbtnDificil);
		rdbtnDificil.setBounds(355, 116, 49, 21);
		add(rdbtnDificil);

		rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setActionCommand("NORMAL");
		buttonGroup.add(rdbtnNormal);
		rdbtnNormal.setBounds(355, 93, 59, 21);
		add(rdbtnNormal);

		rdbtnFacil = new JRadioButton("Fácil");
		rdbtnFacil.setActionCommand("EASY");
		buttonGroup.add(rdbtnFacil);
		rdbtnFacil.setBounds(355, 70, 47, 21);
		add(rdbtnFacil);

		labelDificultad = new JLabel("Elegir Dificultad:");
		labelDificultad.setBounds(275, 56, 74, 13);
		add(labelDificultad);

		labelLenguaje = new JLabel("Elegir Lenguaje:");
		labelLenguaje.setBounds(10, 56, 74, 13);
		add(labelLenguaje);

		rdbtnEspanol = new JRadioButton("Español");
		rdbtnEspanol.setActionCommand("SPANISH");
		buttonGroup_1.add(rdbtnEspanol);
		rdbtnEspanol.setBounds(89, 70, 61, 21);
		add(rdbtnEspanol);

		rdbtnIngles = new JRadioButton("Ingles");
		rdbtnIngles.setActionCommand("ENGLISH");
		buttonGroup_1.add(rdbtnIngles);
		rdbtnIngles.setBounds(89, 93, 53, 21);
		add(rdbtnIngles);
	}

	public JButton getBtnStart() {
		return btnStart;
	}

	public JRadioButton getRdbtnDificil() {
		return rdbtnDificil;
	}

	public JRadioButton getRdbtnNormal() {
		return rdbtnNormal;
	}

	public JRadioButton getRdbtnFacil() {
		return rdbtnFacil;
	}

	public JRadioButton getRdbtnEspanol() {
		return rdbtnEspanol;
	}

	public JRadioButton getRdbtnIngles() {
		return rdbtnIngles;
	}

	public void addDificultadListener(ActionListener listener) {

		rdbtnFacil.addActionListener(listener);
		rdbtnNormal.addActionListener(listener);
		rdbtnDificil.addActionListener(listener);
	}

	public void addLanguageListener(ActionListener listener) {
		rdbtnEspanol.addActionListener(listener);
		rdbtnIngles.addActionListener(listener);
	}

}
