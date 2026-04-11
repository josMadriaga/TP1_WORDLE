package view;

import javax.swing.UIManager;

import utils.LanguageUtil;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

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

	private void initialize() {	
		setBounds(getBounds());
		setBackground(Color.decode("#121213"));
		setLayout(null);

		JLabel lblLogo = new JLabel("WORDLE UNGS", SwingConstants.CENTER);
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblLogo.setBounds(100, 40, 400, 100);
		add(lblLogo);
		
		// Lado Izquierdo - Lenguaje
		labelLenguaje = new JLabel("");
		labelLenguaje.setForeground(new Color(150, 155, 160));
		labelLenguaje.setFont(new Font("SansSerif", Font.BOLD, 18));
		labelLenguaje.setBounds(130, 180, 150, 25);
		add(labelLenguaje);
		
		rdbtnEspanol = new RadioButtonCustom("");
		rdbtnEspanol.setActionCommand("SPANISH");	
		rdbtnEspanol.setBounds(130, 220, 150, 30);

		rdbtnIngles = new RadioButtonCustom("");
		rdbtnIngles.setActionCommand("ENGLISH");
		rdbtnIngles.setBounds(130, 260, 150, 30);
		
		buttonGroup_1.add(rdbtnIngles);
		buttonGroup_1.add(rdbtnEspanol);
		add(rdbtnIngles);
		add(rdbtnEspanol);
		
		// Lado Derecho - Dificultad
		labelDificultad = new JLabel("");
		labelDificultad.setForeground(new Color(150, 155, 160));
		labelDificultad.setFont(new Font("SansSerif", Font.BOLD, 18));
		labelDificultad.setBounds(350, 180, 150, 25);
		add(labelDificultad);
		
		rdbtnFacil = new RadioButtonCustom("");
		rdbtnFacil.setActionCommand("EASY");
		rdbtnFacil.setBounds(350, 220, 150, 30);
		
		rdbtnNormal = new RadioButtonCustom("");
		rdbtnNormal.setActionCommand("NORMAL");
		rdbtnNormal.setBounds(350, 260, 150, 30);
		
		rdbtnDificil = new RadioButtonCustom("");
		rdbtnDificil.setActionCommand("HARD");
		rdbtnDificil.setBounds(350, 300, 150, 30);
		
		buttonGroup.add(rdbtnFacil);
		buttonGroup.add(rdbtnNormal);
		buttonGroup.add(rdbtnDificil);
		add(rdbtnDificil);
		add(rdbtnNormal);
		add(rdbtnFacil);

		// Botón de Start
		btnStart = new ButtonCustom("");
		btnStart.setBounds(200, 420, 200, 45);
		add(btnStart);
		updateTexts();
	}
	public void updateTexts() {
		ResourceBundle  rb = LanguageUtil.getBundle("menu");
		labelLenguaje.setText(rb.getString("labelLenguaje"));
		rdbtnEspanol.setText(rb.getString("rdbtnEspanol"));
		rdbtnIngles.setText(rb.getString("rdbtnIngles"));
		labelDificultad.setText(rb.getString("labelDificultad"));
		rdbtnFacil.setText(rb.getString("rdBtnFacil"));
		rdbtnNormal.setText(rb.getString("rdBtnNormal"));
		rdbtnDificil.setText(rb.getString("rdBtnDificil"));
		btnStart.setText(rb.getString("btnStart"));
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
