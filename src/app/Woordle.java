package app;
import javax.swing.UIManager;

import controller.NavigationController;
import model.Navigation;
import view.PrincipalView;

public class Woordle {

	public static void main(String[] args) {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		PrincipalView ventanaPrincipal = new PrincipalView();
		Navigation navigation = new Navigation();
		new NavigationController(ventanaPrincipal, navigation);
		
		ventanaPrincipal.setVisible(true);
	}

}
