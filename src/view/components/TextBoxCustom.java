package view.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextBoxCustom extends JTextField {
    private Color backgroundColor = new Color(45, 50, 60);
    private Color borderColor = new Color(80, 85, 90);

    public TextBoxCustom() {
        setOpaque(false);
        setSelectionColor(new Color(76, 175, 80));
        setSelectedTextColor(Color.WHITE);
        setForeground(Color.WHITE);
        setCaretColor(Color.WHITE);
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new Font("SansSerif", Font.BOLD, 18));
        
        setBorder(new EmptyBorder(5, 15, 5, 15)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g.create();
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2D.setColor(backgroundColor);
        g2D.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        g2D.setColor(borderColor);
        g2D.setStroke(new BasicStroke(2));
        g2D.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 20, 20);
        
        g2D.dispose();
        super.paintComponent(g);
    }
}