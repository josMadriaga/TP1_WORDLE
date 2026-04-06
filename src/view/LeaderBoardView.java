package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Score;
import view.components.FilaRanking;


public class LeaderBoardView extends JPanel {
    private JPanel contenedorFilas; 

    public LeaderBoardView() {
        setLayout(null);
        setBackground(Color.BLACK);
        
        JLabel lblWin = new JLabel("SYSTEMS CRACKED");
        lblWin.setForeground(new Color(0, 255, 65));
        lblWin.setFont(new Font("Monospaced", Font.BOLD, 32));
        lblWin.setHorizontalAlignment(SwingConstants.CENTER);
        lblWin.setBounds(0, 30, 600, 50);
        add(lblWin);

        contenedorFilas = new JPanel();
        contenedorFilas.setOpaque(false);
        contenedorFilas.setLayout(new javax.swing.BoxLayout(contenedorFilas, javax.swing.BoxLayout.Y_AXIS));
        
        contenedorFilas.setBounds(50, 120, 500, 300); 
        add(contenedorFilas);
    }

    public void actualizarTabla(ArrayList<Score> ranking) {
        contenedorFilas.removeAll();

        for (int i = 0; i < Math.min(5, ranking.size()); i++) {
            Score s = ranking.get(i);
            FilaRanking fila = new FilaRanking(i + 1, s.getNombre(), s.getSegundos());
            fila.setMaximumSize(new java.awt.Dimension(500, 40));
            
            if (s.getNombre().equals("YOU")) {
                fila.resaltar();
            }

            contenedorFilas.add(fila);
            contenedorFilas.add(javax.swing.Box.createVerticalStrut(10));
        }
        
        contenedorFilas.revalidate();
        contenedorFilas.repaint();
    }
}