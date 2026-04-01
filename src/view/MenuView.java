package view;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import view.components.RadioButtonCustom;
import view.components.ButtonCustom;

public class MenuView extends JPanel {
	private ButtonCustom btnStart;

	private JLabel labelDificultad;
	private JLabel labelLenguaje;

	private RadioButtonCustom rdbtnDificil;
	private RadioButtonCustom rdbtnNormal;
	private RadioButtonCustom rdbtnFacil;
	private RadioButtonCustom rdbtnEspanol;
	private RadioButtonCustom		 rdbtnIngles;

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
		setBackground(Color.decode("#121213"));
		setLayout(null);

		JLabel lblLogo = new JLabel("WORDLE UNGS", SwingConstants.CENTER);
		lblLogo.setForeground(Color.WHITE); // Texto temporal por si no carga la imagen
		lblLogo.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblLogo.setBounds(100, 40, 400, 100);
		add(lblLogo);
		
		// Lado Izquierdo - Lenguaje
		labelLenguaje = new JLabel("Idioma:");
		labelLenguaje.setForeground(new Color(150, 155, 160)); // Un gris clarito elegante
		labelLenguaje.setFont(new Font("SansSerif", Font.BOLD, 18));
		labelLenguaje.setBounds(130, 180, 150, 25);
		add(labelLenguaje);
		
		rdbtnEspanol = new RadioButtonCustom("Español");
		rdbtnEspanol.setActionCommand("SPANISH");	
		rdbtnEspanol.setBounds(130, 220, 150, 30);

		rdbtnIngles = new RadioButtonCustom("Ingles");
		rdbtnIngles.setActionCommand("ENGLISH");
		rdbtnIngles.setBounds(130, 260, 150, 30);
		
		buttonGroup_1.add(rdbtnIngles);
		buttonGroup_1.add(rdbtnEspanol);
		add(rdbtnIngles);
		add(rdbtnEspanol);
		
		// Lado Derecho - Dificultad
		labelDificultad = new JLabel("Dificultad:");
		labelDificultad.setForeground(new Color(150, 155, 160));
		labelDificultad.setFont(new Font("SansSerif", Font.BOLD, 18));
		labelDificultad.setBounds(350, 180, 150, 25);
		add(labelDificultad);
		
		rdbtnFacil = new RadioButtonCustom("Fácil");
		rdbtnFacil.setActionCommand("EASY");
		rdbtnFacil.setBounds(350, 220, 150, 30);
		
		rdbtnNormal = new RadioButtonCustom("Normal");
		rdbtnNormal.setActionCommand("NORMAL");
		rdbtnNormal.setBounds(350, 260, 150, 30);
		
		rdbtnDificil = new RadioButtonCustom("Difícil");
		rdbtnDificil.setActionCommand("HARD");
		rdbtnDificil.setBounds(350, 300, 150, 30);
		
		buttonGroup.add(rdbtnFacil);
		buttonGroup.add(rdbtnNormal);
		buttonGroup.add(rdbtnDificil);
		add(rdbtnDificil);
		add(rdbtnNormal);
		add(rdbtnFacil);

		// Botón de Start
		btnStart = new ButtonCustom("Start");
		btnStart.setBounds(200, 420, 200, 45); // Botón más ancho y vistoso
		add(btnStart);
		
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
