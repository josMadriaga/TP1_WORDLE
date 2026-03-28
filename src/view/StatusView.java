package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.components.ButtonCustom;
import javax.swing.JLabel;

public class StatusView extends JDialog {

	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout = new CardLayout();
	private final JPanel contentPanel = new JPanel(cardLayout);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StatusView dialog = new StatusView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StatusView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.decode("#121213"));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			ButtonCustom okButton = new ButtonCustom("OK", "#D9C584", "#DBD3B6", "#D9C584");
			okButton.setBounds(165, 174, 73, 29);
			contentPanel.add(okButton);
			okButton.setActionCommand("Aceptar");
			getRootPane().setDefaultButton(okButton);
		}
		
		JLabel lblStatus = new JLabel("New label");
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setBounds(44, 24, 344, 125);
		lblStatus.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPanel.add(lblStatus);
	}
	 
}
