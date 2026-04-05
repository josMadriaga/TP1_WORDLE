package view.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilaRanking extends JPanel {
	public FilaRanking(int rank, String nombre, int segundos) {
		setLayout(new GridLayout(1, 3));
		setOpaque(false);
		
		String tiempoFormateado = String.format("%02d:%02d", segundos / 60, segundos % 60);
		
		JLabel lblRank = new JLabel("0" + rank);
		JLabel lblNom = new JLabel(nombre);
		JLabel lblTime = new JLabel(tiempoFormateado);
		
		Font f = new Font("Monospaced", Font.BOLD, 18);
		for (JLabel l : new JLabel[]{lblRank, lblNom, lblTime}) {
			l.setForeground(new Color(0, 255, 65));
			l.setFont(f);
			l.setHorizontalAlignment(JLabel.CENTER);
			add(l);
		}
	}
	
	public void resaltar() {
		setOpaque(true);
		setBackground(new Color(0, 60, 0));
		for (Component c : getComponents()) {
			c.setForeground(Color.WHITE);
		}
	}
}
