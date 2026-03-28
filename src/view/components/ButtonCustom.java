package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonCustom extends JButton {
	private Color cNormal;
	private Color cHover;
	private Color cPress;
	private Color currentColor;

	private static final Color DEFAULT_NORMAL = new Color(38, 166, 154);
	private static final Color DEFAULT_HOVER = new Color(45, 186, 174);
	private static final Color DEFAULT_PRESS = new Color(30, 136, 127);

	public ButtonCustom(String texto, String hexNormal, String hexHover, String hexPress) {
		super(texto);
		try {
			this.cNormal = (hexNormal != null) ? Color.decode(hexNormal) : DEFAULT_NORMAL;
			this.cHover = (hexHover != null) ? Color.decode(hexHover) : DEFAULT_HOVER;
			this.cPress = (hexPress != null) ? Color.decode(hexPress) : DEFAULT_PRESS;
		} catch (NumberFormatException e) {
			this.cNormal = DEFAULT_NORMAL;
			this.cHover = DEFAULT_HOVER;
			this.cPress = DEFAULT_PRESS;
		}
		init();
	}

	public ButtonCustom(String texto) {
		super(texto);
		this.cNormal = DEFAULT_NORMAL;
		this.cHover = DEFAULT_HOVER;
		this.cPress = DEFAULT_PRESS;
		init();
	}

	private void init() {
		this.currentColor = cNormal;

		setContentAreaFilled(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setForeground(Color.WHITE);
		setFont(new Font("SansSerif", Font.BOLD, 16));
		setCursor(new Cursor(Cursor.HAND_CURSOR));

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				updateColor(cHover);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				updateColor(cNormal);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				updateColor(cPress);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				updateColor(contains(e.getPoint()) ? cHover : cNormal);
			}
		});
	}

	private void updateColor(Color nextColor) {
		this.currentColor = nextColor;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g.create();
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setColor(new Color(0, 0, 0, 40));
		g2D.fillRoundRect(2, 2, getWidth() - 2, getHeight() - 2, 20, 20);

		g2D.setColor(currentColor);
		g2D.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 20, 20);

		g2D.dispose();
		super.paintComponent(g);
	}
}