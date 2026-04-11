package view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import utils.LanguageUtil;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.ResourceBundle;

import view.components.ButtonCustom;
import view.components.CeldaCustom;
import view.components.TextBoxCustom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class JuegoView extends JPanel {

	private static final long serialVersionUID = 1L;
	private TextBoxCustom textField;
	private ButtonCustom tglbtnSubmit;
	private JLabel lblCantIntentos;
	private JLabel lblDificultad;
	private JLabel lblResult;
	private JLabel lblError;
	private CeldaCustom[][] celdas = new CeldaCustom[6][5];
	private JLabel lblIntentos;

	public JuegoView() {
		setBounds(getBounds());
		setBackground(Color.decode("#121213"));
		setSize(new Dimension(632, 509));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

		textField = new TextBoxCustom();
		textField.setBounds(168, 450, 180, 34);
		add(textField);
		textField.setColumns(10);

		lblError = new JLabel("");
		lblError.setForeground(new Color(255, 100, 100));
		lblError.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setBounds(150, 400, 400, 30);
		lblError.setVisible(false);
		add(lblError);

		tglbtnSubmit = new ButtonCustom("");
		tglbtnSubmit.setForeground(Color.WHITE);
		tglbtnSubmit.setBounds(358, 455, 119, 29);
		tglbtnSubmit.setToolTipText("Revisa si la palabra coincide o si hay letras que coincidan.");
		add(tglbtnSubmit);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(18, 18, 20));
		panel.setBounds(10, 86, 570, 350);
		add(panel);
		panel.setLayout(new GridLayout(6, 5, 8, 8));

		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 5; c++) {
				celdas[f][c] = new CeldaCustom();
				panel.add(celdas[f][c]);
			}
		}

		lblIntentos = new JLabel("");
		lblIntentos.setForeground(new Color(255, 255, 255));
		lblIntentos.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblIntentos.setBounds(10, 7, 174, 25);
		add(lblIntentos);

		lblCantIntentos = new JLabel("0");
		lblCantIntentos.setForeground(new Color(255, 255, 255));
		lblCantIntentos.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblCantIntentos.setBounds(96, 10, 66, 19);
		add(lblCantIntentos);

		lblResult = new JLabel("");
		lblResult.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblResult.setForeground(new Color(255, 255, 255));
		lblResult.setBounds(246, 10, 250, 66);
		add(lblResult);
		updateTexts();
		((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				int currentLength = fb.getDocument().getLength();
				int overLimit = (currentLength + text.length() - length) - 5;

				if (overLimit <= 0) {
					super.replace(fb, offset, length, text.toUpperCase(), attrs);
					return;
				}
				if (text.length() > overLimit) {
					super.replace(fb, offset, length, text.substring(0, text.length() - overLimit).toUpperCase(),
							attrs);
				}
			}
		});
	}

	public void updateTexts() {
		ResourceBundle rb = LanguageUtil.getBundle("juego");
		tglbtnSubmit.setText(rb.getString("btn.Confirm"));
		lblError.setText(rb.getString("lblError"));
		lblIntentos.setText(rb.getString("lblIntentos"));
	}

	public void limpiarTablero() {
		textField.setText("");
		textField.setEnabled(true);
		lblError.setVisible(false);
		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 5; c++) {
				CeldaCustom celda = celdas[f][c];
				celda.reset();
			}
		}
		this.revalidate();
		this.repaint();
	}

	public void pintarCeldas(CeldaCustom[] celdas, String[] colores) {
		for (int i = 0; i < celdas.length; i++) {
			Color color = Color.decode(colores[i]);
			celdas[i].setResultado(color);
		}
	}

	public void escribirCeldas(CeldaCustom[] celdas) {
		String[] arrTextField = getTextField().getText().split("");
		for (int i = 0; i < celdas.length; i++) {
			celdas[i].setText(arrTextField[i]);
		}
	}

	public void recalcularIntentos(String intentos) {
		this.lblCantIntentos.setText(intentos);
	}

	public void drawSecretWord(String secretWord) {
		this.lblResult.setText(secretWord);
	}

	public void mostrarMensajeError() {
		lblError.setVisible(true);
		lblError.getParent().repaint();
		this.revalidate();
	}

	public void ocultarError() {
		lblError.setVisible(false);
	}

	public TextBoxCustom getTextField() {
		return textField;
	}

	public ButtonCustom getTglbtnSubmit() {
		return tglbtnSubmit;
	}

	public JLabel getLblCantIntentos() {
		return lblCantIntentos;
	}

	public JLabel getLblDificultad() {
		return lblDificultad;
	}

	public JLabel getLblResult() {
		return lblResult;
	}

	public CeldaCustom[] getColumnaCeldas(int fila) {
		return celdas[fila];
	}

	public CeldaCustom[][] getCeldas() {
		return celdas;
	}
}
