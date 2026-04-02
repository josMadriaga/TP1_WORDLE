package view.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGameOver extends JPanel{
	private Image imagen;

    public PanelGameOver() {
        // Importante para que los componentes encima se vean
        setOpaque(false); 
        setLayout(null); 
        
        // Cargamos la imagen con precaución para el editor visual
        URL imgUrl = getClass().getResource("/icons/matrix.jpg");
        if (imgUrl != null) {
            imagen = new ImageIcon(imgUrl).getImage();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Dibujamos el fondo original del panel por si la imagen falla
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        if (imagen != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            // Esto hace que la imagen se vea mejor
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            g2d.dispose();
        }
        super.paintComponent(g);
    }
}
