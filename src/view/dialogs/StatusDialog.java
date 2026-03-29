package view.dialogs;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.components.ButtonCustom;
import javax.swing.JLabel;

public class StatusDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private ButtonCustom okButton;

	/**
	 * Create the dialog.
	 */
	public StatusDialog(String texto) {
		getContentPane().setBackground(new Color(18, 18, 20));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		okButton = new ButtonCustom("OK", "#D9C584", "#DBD3B6", "#D9C584");		
		okButton.setBounds(157, 178, 100, 35);
		getContentPane().add(okButton);
		okButton.setActionCommand("Aceptar");

		JLabel lblStatus = new JLabel(texto);
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setBounds(61, 32, 400, 120);
		lblStatus.setFont(new Font("SansSerif", Font.BOLD, 15));
		getContentPane().add(lblStatus);
	}

	public ButtonCustom getOkButton() {
		return this.okButton;
	}

}
