package view;

import javax.swing.*;

import utils.ViewEnum;

import java.awt.*;

public class PrincipalView extends JFrame {

    private CardLayout cardLayout;
    private JPanel contenedorPrincipal;

    private MenuView panelMenu;
    private JuegoView panelJuego;
    private GameOverView panelGameOver;

    public PrincipalView() {
        setTitle("Wordle UNGS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 550);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        contenedorPrincipal = new JPanel(cardLayout);

        panelMenu = new MenuView();
        panelJuego = new JuegoView();
        panelGameOver = new GameOverView();

        contenedorPrincipal.add(panelMenu, ViewEnum.MENU.toString());
        contenedorPrincipal.add(panelJuego, ViewEnum.JUEGO.toString());
        contenedorPrincipal.add(panelGameOver, ViewEnum.GAMEOVER.toString());

        getContentPane().add(contenedorPrincipal, BorderLayout.CENTER);
        
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