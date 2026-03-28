package view;

import javax.swing.*;
import java.awt.*;

public class PrincipalView extends JFrame {
    public static final String PANTALLA_MENU = "MENU";
    public static final String PANTALLA_JUEGO = "JUEGO";
    public static final String PANTALLA_GAMEOVER = "GAMEOVER";

    private CardLayout cardLayout;
    private JPanel contenedorPrincipal;

    private MenuView panelMenu;
    private JuegoView panelJuego;
    private GameOverView panelGameOver;

    public PrincipalView() {
        setTitle("Wordle UNGS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        contenedorPrincipal = new JPanel(cardLayout);

        panelMenu = new MenuView();
        panelJuego = new JuegoView();
        panelGameOver = new GameOverView();

        contenedorPrincipal.add(panelMenu, PANTALLA_MENU);
        contenedorPrincipal.add(panelJuego, PANTALLA_JUEGO);
        contenedorPrincipal.add(panelGameOver, PANTALLA_GAMEOVER);

        getContentPane().add(contenedorPrincipal, BorderLayout.CENTER);
        
        cardLayout.show(contenedorPrincipal, PANTALLA_MENU);
        
        revalidate();
        repaint();
    }

    public void navegarA(String nombrePantalla) {
        cardLayout.show(contenedorPrincipal, nombrePantalla);
    }

	public MenuView getPanelMenu() {
		return panelMenu;
	}

	public JuegoView getPanelJuego() {
		return panelJuego;
	}

	public GameOverView getPanelGameOver() {
		return panelGameOver;
	}

}