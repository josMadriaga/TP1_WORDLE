package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import view.components.ButtonCustom;
import view.components.PanelGameOver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class GameOverView extends PanelGameOver {
	private ButtonCustom btnMenu;
	private ButtonCustom btnRetry;

	public GameOverView() {
		setBounds(new Rectangle(0, 0, 600, 500));
		setLayout(null);
		
		JLabel lblGameOver = new JLabel("GAME           OVER");
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setForeground(Color.decode("#00FF41"));
		lblGameOver.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 36));
		lblGameOver.setBounds(-25, 84, 600, 60);
		add(lblGameOver);

		btnRetry = new ButtonCustom("Reintentar", "#050796", "#2c2d96", "#1c1e99");
		btnRetry.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnRetry.setBounds(341, 413, 123, 40);
		add(btnRetry);

		btnMenu = new ButtonCustom("Menu Principal", "#a30714", "#a14d54", "#992e37");
		btnMenu.setText("Menu");
		btnMenu.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnMenu.setBounds(117, 413, 108, 40);
		add(btnMenu);
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}

	public JButton getBtnRetry() {
		return btnRetry;
	}
}
