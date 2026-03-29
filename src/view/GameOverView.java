package view;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JLabel;

public class GameOverView extends JPanel {
	public GameOverView() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 9, 9);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("GAME OVER");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(197, 68, 135, 58);
		add(lblNewLabel);
	}
}
