package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonCustom extends JButton {
	private Color colorNormal = new Color(38, 166, 154); // Turquesa
	private Color colorHover = new Color(45, 186, 174);
	private Color colorPresionado = new Color(30, 136, 127);
	private Color currentColor = colorNormal;

	public ButtonCustom(String texto) {
		super(texto);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setForeground(Color.WHITE);
		setFont(new Font("SansSerif", Font.BOLD, 16));
		setCursor(new Cursor(Cursor.HAND_CURSOR));

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				currentColor = colorHover;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				currentColor = colorNormal;
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				currentColor = colorPresionado;
				repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				currentColor = colorHover;
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g.create();
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setColor(new Color(0, 0, 0, 50));
		g2D.fillRoundRect(2, 2, getWidth() - 2, getHeight() - 2, 20, 20);

		g2D.setColor(currentColor);
		g2D.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 20, 20);

		g2D.dispose();
		super.paintComponent(g);
	}
}