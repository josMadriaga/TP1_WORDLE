package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.GridLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Juego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtP;
	private JTextField textField_2;
	private JTextField txtC;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JToggleButton tglbtnSubmit;
	private JLabel lblCantIntentos;
	private JLabel lblDificultad;
	private JLabel lblTextBox;
	private JLabel lblNewLabel;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#121213"));
		contentPane.setSize(new Dimension(20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 88, 168, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		tglbtnSubmit = new JToggleButton("Confirmar");
		tglbtnSubmit.setBorderPainted(false);
		tglbtnSubmit.setFocusPainted(false);
		tglbtnSubmit.setForeground(Color.WHITE);
		tglbtnSubmit.setBackground(Color.decode("#538D4E"));
		tglbtnSubmit.setBorder(new LineBorder(Color.WHITE, 1, true));
		tglbtnSubmit.setBounds(10, 117, 90, 34);
		tglbtnSubmit.setToolTipText("Revisa si la palabra coincide o si hay letras que coincidan.");
		contentPane.add(tglbtnSubmit);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setForeground(new Color(0, 0, 0));
		panel.setSize(new Dimension(8, 8));
		panel.setBounds(219, 59, 160, 185);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 5, 5, 5));
		
		txtP = new JTextField();
		txtP.setBackground(new Color(18, 18, 19));
		txtP.setForeground(Color.WHITE);
		txtP.setFont(new Font("Arial", Font.BOLD, 30));
		txtP.setHorizontalAlignment(SwingConstants.CENTER);
		txtP.setSize(new Dimension(8, 8));
		txtP.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtP.setEnabled(false);
		txtP.setEditable(false);
		panel.add(txtP);
		txtP.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(18, 18, 19));
		textField_7.setForeground(Color.WHITE);
		textField_7.setFont(new Font("Arial", Font.BOLD, 30));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setSize(new Dimension(8, 8));
		textField_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBackground(new Color(18, 18, 19));
		textField_13.setForeground(SystemColor.textText);
		textField_13.setFont(new Font("Arial", Font.BOLD, 30));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setSize(new Dimension(8, 8));
		textField_13.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_13.setEnabled(false);
		textField_13.setEditable(false);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBackground(new Color(18, 18, 19));
		textField_14.setForeground(SystemColor.textText);
		textField_14.setFont(new Font("Arial", Font.BOLD, 30));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setSize(new Dimension(8, 8));
		textField_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_14.setEnabled(false);
		textField_14.setEditable(false);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(18, 18, 19));
		textField_2.setForeground(SystemColor.textText);
		textField_2.setFont(new Font("Arial", Font.BOLD, 30));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setSize(new Dimension(8, 8));
		textField_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(18, 18, 19));
		textField_4.setForeground(SystemColor.textText);
		textField_4.setFont(new Font("Arial", Font.BOLD, 30));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setSize(new Dimension(8, 8));
		textField_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(18, 18, 19));
		textField_5.setForeground(SystemColor.textText);
		textField_5.setFont(new Font("Arial", Font.BOLD, 30));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setSize(new Dimension(8, 8));
		textField_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBackground(new Color(18, 18, 19));
		txtC.setForeground(SystemColor.textText);
		txtC.setFont(new Font("Arial", Font.BOLD, 30));
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setSize(new Dimension(8, 8));
		txtC.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtC.setEnabled(false);
		txtC.setEditable(false);
		panel.add(txtC);
		txtC.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(18, 18, 19));
		textField_9.setForeground(SystemColor.textText);
		textField_9.setFont(new Font("Arial", Font.BOLD, 30));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setSize(new Dimension(8, 8));
		textField_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBackground(new Color(18, 18, 19));
		textField_15.setForeground(SystemColor.textText);
		textField_15.setFont(new Font("Arial", Font.BOLD, 30));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setSize(new Dimension(8, 8));
		textField_15.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(18, 18, 19));
		textField_6.setForeground(SystemColor.textText);
		textField_6.setFont(new Font("Arial", Font.BOLD, 30));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setSize(new Dimension(8, 8));
		textField_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(18, 18, 19));
		textField_8.setForeground(SystemColor.textText);
		textField_8.setFont(new Font("Arial", Font.BOLD, 30));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setSize(new Dimension(8, 8));
		textField_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(new Color(18, 18, 19));
		textField_11.setForeground(SystemColor.textText);
		textField_11.setFont(new Font("Arial", Font.BOLD, 30));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setSize(new Dimension(8, 8));
		textField_11.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(18, 18, 19));
		textField_10.setForeground(SystemColor.textText);
		textField_10.setFont(new Font("Arial", Font.BOLD, 30));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setSize(new Dimension(8, 8));
		textField_10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_10.setEnabled(false);
		textField_10.setEditable(false);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBackground(new Color(18, 18, 19));
		textField_19.setForeground(SystemColor.textText);
		textField_19.setFont(new Font("Arial", Font.BOLD, 30));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setSize(new Dimension(8, 8));
		textField_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_19.setEnabled(false);
		textField_19.setEditable(false);
		panel.add(textField_19);
		textField_19.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBackground(new Color(18, 18, 19));
		textField_21.setForeground(SystemColor.textText);
		textField_21.setFont(new Font("Arial", Font.BOLD, 30));
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setSize(new Dimension(8, 8));
		textField_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_21.setEnabled(false);
		textField_21.setEditable(false);
		panel.add(textField_21);
		textField_21.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBackground(new Color(18, 18, 19));
		textField_20.setForeground(SystemColor.textText);
		textField_20.setFont(new Font("Arial", Font.BOLD, 30));
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setSize(new Dimension(8, 8));
		textField_20.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_20.setEnabled(false);
		textField_20.setEditable(false);
		panel.add(textField_20);
		textField_20.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBackground(new Color(18, 18, 19));
		textField_16.setForeground(SystemColor.textText);
		textField_16.setFont(new Font("Arial", Font.BOLD, 30));
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setSize(new Dimension(8, 8));
		textField_16.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBackground(new Color(18, 18, 19));
		textField_12.setForeground(SystemColor.textText);
		textField_12.setFont(new Font("Arial", Font.BOLD, 30));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setSize(new Dimension(8, 8));
		textField_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBackground(new Color(18, 18, 19));
		textField_24.setForeground(SystemColor.textText);
		textField_24.setFont(new Font("Arial", Font.BOLD, 30));
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setSize(new Dimension(8, 8));
		textField_24.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_24.setEnabled(false);
		textField_24.setEditable(false);
		panel.add(textField_24);
		textField_24.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBackground(new Color(18, 18, 19));
		textField_23.setForeground(SystemColor.textText);
		textField_23.setFont(new Font("Arial", Font.BOLD, 30));
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setSize(new Dimension(8, 8));
		textField_23.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_23.setEnabled(false);
		textField_23.setEditable(false);
		panel.add(textField_23);
		textField_23.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBackground(new Color(18, 18, 19));
		textField_25.setForeground(SystemColor.textText);
		textField_25.setFont(new Font("Arial", Font.BOLD, 30));
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setSize(new Dimension(8, 8));
		textField_25.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_25.setEnabled(false);
		textField_25.setEditable(false);
		panel.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBackground(new Color(18, 18, 19));
		textField_26.setForeground(SystemColor.textText);
		textField_26.setFont(new Font("Arial", Font.BOLD, 30));
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setSize(new Dimension(8, 8));
		textField_26.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_26.setEnabled(false);
		textField_26.setEditable(false);
		panel.add(textField_26);
		textField_26.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBackground(new Color(18, 18, 19));
		textField_29.setForeground(SystemColor.textText);
		textField_29.setFont(new Font("Arial", Font.BOLD, 30));
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setSize(new Dimension(8, 8));
		textField_29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		panel.add(textField_29);
		textField_29.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBackground(new Color(18, 18, 19));
		textField_28.setForeground(SystemColor.textText);
		textField_28.setFont(new Font("Arial", Font.BOLD, 30));
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setSize(new Dimension(8, 8));
		textField_28.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_28.setEnabled(false);
		textField_28.setEditable(false);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBackground(new Color(18, 18, 19));
		textField_22.setForeground(SystemColor.textText);
		textField_22.setFont(new Font("Arial", Font.BOLD, 30));
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setSize(new Dimension(8, 8));
		textField_22.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_22.setEnabled(false);
		textField_22.setEditable(false);
		panel.add(textField_22);
		textField_22.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBackground(new Color(18, 18, 19));
		textField_17.setForeground(SystemColor.textText);
		textField_17.setFont(new Font("Arial", Font.BOLD, 30));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setSize(new Dimension(8, 8));
		textField_17.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_17.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField_17.setEnabled(false);
		textField_17.setEditable(false);
		panel.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBackground(new Color(18, 18, 19));
		textField_18.setForeground(SystemColor.textText);
		textField_18.setFont(new Font("Arial", Font.BOLD, 30));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setSize(new Dimension(8, 8));
		textField_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_18.setEnabled(false);
		textField_18.setEditable(false);
		panel.add(textField_18);
		textField_18.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBackground(new Color(18, 18, 19));
		textField_27.setForeground(SystemColor.textText);
		textField_27.setFont(new Font("Arial", Font.BOLD, 30));
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setSize(new Dimension(8, 8));
		textField_27.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		panel.add(textField_27);
		textField_27.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBackground(new Color(18, 18, 19));
		textField_30.setForeground(SystemColor.textText);
		textField_30.setFont(new Font("Arial", Font.BOLD, 30));
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setSize(new Dimension(8, 8));
		textField_30.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		panel.add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblIntentos = new JLabel("Intentos:");
		lblIntentos.setForeground(new Color(255, 255, 255));
		lblIntentos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntentos.setBounds(10, 7, 90, 25);
		contentPane.add(lblIntentos);
		
		JLabel lblGameMode = new JLabel("Dificultad:");
		lblGameMode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGameMode.setForeground(Color.white);
		lblGameMode.setBounds(10, 234, 111, 19);
		contentPane.add(lblGameMode);
		
		lblCantIntentos = new JLabel("0");
		lblCantIntentos.setForeground(new Color(255, 255, 255));
		lblCantIntentos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantIntentos.setBounds(85, 13, 44, 12);
		contentPane.add(lblCantIntentos);
		
		lblDificultad = new JLabel("");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDificultad.setBounds(96, 232, 66, 25);
		contentPane.add(lblDificultad);
		
		lblTextBox = new JLabel("Ingrese una palabra");
		lblTextBox.setForeground(Color.WHITE);
		lblTextBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTextBox.setBounds(10, 59, 168, 19);
		contentPane.add(lblTextBox);
		
		//TODO este lbl va a mostrar de forma oculta la palabra que resolvio el model de juego
		lblNewLabel = new JLabel("RESULTADO");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(219, 15, 189, 17);
		contentPane.add(lblNewLabel);

	}
}
