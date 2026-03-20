package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Interfaz {

	private JFrame frame;
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
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(172, 80, 89, 23);
		frame.getContentPane().add(btnStart);
		
		rdbtnDificil = new JRadioButton("Difícil");
		buttonGroup.add(rdbtnDificil);
		rdbtnDificil.setBounds(20, 210, 109, 23);
		frame.getContentPane().add(rdbtnDificil);
		
		rdbtnNormal = new JRadioButton("Normal");
		buttonGroup.add(rdbtnNormal);
		rdbtnNormal.setBounds(20, 184, 109, 23);
		frame.getContentPane().add(rdbtnNormal);
		
		rdbtnFacil = new JRadioButton("Fácil");
		buttonGroup.add(rdbtnFacil);
		rdbtnFacil.setBounds(20, 158, 109, 23);
		frame.getContentPane().add(rdbtnFacil);
		
		labelDificultad = new JLabel("Elegir Dificultad:");
		labelDificultad.setBounds(10, 139, 89, 14);
		frame.getContentPane().add(labelDificultad);
		
		labelLenguaje = new JLabel("Elegir Lenguaje:");
		labelLenguaje.setBounds(330, 139, 90, 14);
		frame.getContentPane().add(labelLenguaje);
		
		rdbtnEspanol = new JRadioButton("Español");
		buttonGroup_1.add(rdbtnEspanol);
		rdbtnEspanol.setBounds(334, 158, 109, 23);
		frame.getContentPane().add(rdbtnEspanol);
		
		rdbtnIngles = new JRadioButton("Ingles");
		buttonGroup_1.add(rdbtnIngles);
		rdbtnIngles.setBounds(334, 184, 109, 23);
		frame.getContentPane().add(rdbtnIngles);
	}
	public JFrame getFrame() {
		return frame;
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

}
