package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import view.components.ButtonCustom;

public class GameOverView extends JPanel {
	private ButtonCustom btnNewButton_1;
	private ButtonCustom btnNewButton;
	public GameOverView() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juego Terminado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(73, 30, 300, 40);
		add(lblNewLabel);
		
		
		//aqui no se si informar la palabra porque en caso de perder quiza podriamos hacer que reinicie con esa misma palabra
		JLabel lblNewLabel_1 = new JLabel("La plabra era: .....");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 90, 300, 30);
		add(lblNewLabel_1);
		
		btnNewButton = new ButtonCustom("Reintentar");	
		btnNewButton.setBounds(40, 160, 140, 40);
		add(btnNewButton);
		
		btnNewButton_1 = new ButtonCustom("Volver al menu");
		btnNewButton_1.setBounds(264, 160, 140, 40);
		add(btnNewButton_1);
	}
	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
}
