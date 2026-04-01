package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CeldaCustom extends JLabel {

	private Color COLOR_INICIAL = new Color(45, 50, 60);
	private Color backgroundColor = COLOR_INICIAL;

	public CeldaCustom() {
		setOpaque(false);
		setHorizontalAlignment(SwingConstants.CENTER);
		setForeground(Color.WHITE);
		setFont(new Font("SansSerif", Font.BOLD, 24));
		setPreferredSize(new Dimension(60, 60));
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g.create();
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setColor(backgroundColor);
		g2D.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

		g2D.setColor(new Color(80, 85, 90));
		g2D.setStroke(new BasicStroke(2));
		g2D.draw(new RoundRectangle2D.Double(1, 1, getWidth() - 2, getHeight() - 2, 15, 15));

		g2D.dispose();
		super.paintComponent(g);
	}

	public void setResultado(Color nuevoColor) {
		this.backgroundColor = nuevoColor;
		repaint();
	}

	public void reset() {
		this.setText("");
		this.backgroundColor = COLOR_INICIAL;
		repaint();
	}
}
