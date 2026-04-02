package view.components;

import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RadioButtonCustom extends JRadioButton {
	
	// Usamos el mismo turquesa del ButtonCustom y un gris para cuando está apagado
	private Color colorSeleccionado = new Color(38, 166, 154); 
	private Color colorDesactivado = new Color(80, 85, 90);

	public RadioButtonCustom(String text) {
		super(text);
		setOpaque(false); // Fondo transparente
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setForeground(Color.WHITE);
		setFont(new Font("SansSerif", Font.PLAIN, 16));
		setFocusPainted(false); // Saca el cuadrito punteado feo
		
		// Reemplazamos el circulo de Windows por nuestro propio dibujo
		setIcon(new CustomIcon(false));
		setSelectedIcon(new CustomIcon(true));
	}

	// Esta clase interna dibuja el circulito perfecto con antialiasing
	private class CustomIcon implements javax.swing.Icon {
		private boolean selected;

		public CustomIcon(boolean selected) {
			this.selected = selected;
		}

		public int getIconWidth() { return 18; }
		public int getIconHeight() { return 18; }

		public void paintIcon(java.awt.Component c, Graphics g, int x, int y) {
			Graphics2D g2 = (Graphics2D) g.create();
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			if (selected) {
				g2.setColor(colorSeleccionado);
				g2.fillOval(x, y, 16, 16); // Circulo relleno turquesa
				g2.setColor(Color.WHITE);
				g2.fillOval(x + 5, y + 5, 6, 6); // Puntito blanco en el centro
			} else {
				g2.setColor(colorDesactivado);
				g2.drawOval(x, y, 16, 16); // Solo el borde gris
			}
			g2.dispose();
		}
	}
}