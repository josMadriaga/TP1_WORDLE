package view.dialogs;

import java.awt.Color;
import java.awt.Font;
import java.util.ResourceBundle;

import javax.swing.JDialog;
import utils.LanguageUtil;
import view.components.ButtonCustom;
import javax.swing.JLabel;

public class StatusDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private ButtonCustom okButton;

	/**
	 * Create the dialog.
	 */
	public StatusDialog(boolean gano) {
		getContentPane().setBackground(new Color(18, 18, 20));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		okButton = new ButtonCustom("OK", "#D9C584", "#DBD3B6", "#D9C584");		
		okButton.setBounds(157, 178, 100, 35);
		getContentPane().add(okButton);
		okButton.setActionCommand("Aceptar");

		JLabel lblStatus = new JLabel(setText(gano));
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setBounds(61, 32, 400, 120);
		lblStatus.setFont(new Font("SansSerif", Font.BOLD, 15));
		getContentPane().add(lblStatus);
	}

	private String setText(boolean gano) {
		ResourceBundle rb = LanguageUtil.getBundle("juego");
		String texto = rb.getString("lblResumen.lose");
		if (gano) {
			texto = rb.getString("lblResumen.win");
		}
		return texto;
	}

	public ButtonCustom getOkButton() {
		return this.okButton;
	}

}
