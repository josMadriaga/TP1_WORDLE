package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

import view.components.ButtonCustom;
import view.components.CeldaCustom;
import view.components.TextBoxCustom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Juego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TextBoxCustom textField;
	private ButtonCustom tglbtnSubmit;
	private JLabel lblCantIntentos;
	private JLabel lblDificultad;
	private JLabel lblNewLabel;
	private CeldaCustom[] celdas = new CeldaCustom[30];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 575);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#121213"));
		contentPane.setSize(new Dimension(20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new TextBoxCustom();
		textField.setBounds(168, 450, 180, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		tglbtnSubmit = new ButtonCustom("Confirmar");
		tglbtnSubmit.setForeground(Color.WHITE);
		tglbtnSubmit.setBounds(358, 450, 119, 34);
		tglbtnSubmit.setToolTipText("Revisa si la palabra coincide o si hay letras que coincidan.");
		contentPane.add(tglbtnSubmit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(18, 18, 20));
	    panel.setBounds(10, 86, 570, 350);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 5, 8, 8));
		
		for (int i = 0; i < 30; i++) {
	        celdas[i] = new CeldaCustom();
	        panel.add(celdas[i]);
	    }
		
		JLabel lblIntentos = new JLabel("Intentos:");
		lblIntentos.setForeground(new Color(255, 255, 255));
		lblIntentos.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblIntentos.setBounds(10, 7, 90, 25);
		contentPane.add(lblIntentos);
		
		lblCantIntentos = new JLabel("0");
		lblCantIntentos.setForeground(new Color(255, 255, 255));
		lblCantIntentos.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblCantIntentos.setBounds(96, 10, 66, 19);
		contentPane.add(lblCantIntentos);
		
		lblDificultad = new JLabel("");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDificultad.setBounds(96, 232, 66, 25);
		contentPane.add(lblDificultad);
		
		//TODO este lbl va a mostrar de forma oculta la palabra que resolvio el model de juego
		lblNewLabel = new JLabel("RESULTADO");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(226, 55, 189, 17);
		contentPane.add(lblNewLabel);

	}
}
