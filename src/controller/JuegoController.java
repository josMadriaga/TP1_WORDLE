package controller;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import events.IJuegoObserver;
import model.JuegoM;
import model.Navigation;
import utils.ViewEnum;
import view.JuegoView;
import view.dialogs.StatusDialog;

public class JuegoController implements IJuegoObserver {
	private JuegoView juegoView;
	private JuegoM juegoModel;
	private Navigation navigation;

	public JuegoController(JuegoView juego, JuegoM juegoM, Navigation nav) {
		this.juegoView = juego;
		this.juegoModel = juegoM;
		this.navigation = nav;
		this.juegoModel.addObserver(this);
		this.juegoModel.initialize();
		for (ActionListener listener : this.juegoView.getTextField().getActionListeners()) {
			this.juegoView.getTextField().removeActionListener(listener);
		}
		
		handleEvents();
	}

	private void handleEvents() {
		this.juegoView.getTglbtnSubmit().addActionListener(e -> enviarPalabra());
		this.juegoView.getTextField().addActionListener(e -> enviarPalabra());
	}

	private void enviarPalabra() {
		if (this.juegoView.getTextField().getText().trim().length() < 5) {
			this.juegoModel.sendError();
			return;
		}
		this.juegoModel.validarPalabra(this.juegoView.getTextField().getText().trim());
	}

	@Override
	public void onPalabraRevisada(String[] coloresLetras, int fila) {
		this.juegoView.pintarCeldas(this.juegoView.getColumnaCeldas(fila), coloresLetras);
		this.juegoView.escribirCeldas(this.juegoView.getColumnaCeldas(fila));
		this.juegoView.getTextField().setText("");
		this.juegoView.getLblCantIntentos().setText(String.valueOf(this.juegoModel.getIntentosRestantes()));
	}

	@Override
	public void onJuegoTerminado(boolean gano) {
		this.juegoView.getTextField().setEnabled(false);
		String textoResumen = "<html><div>Perdiste por esta vez,<br> pero podes volver a intentarlo.</div></html>";
		if (gano) {
			textoResumen = "<html><div>" + "¡Felicitaciones!<br>" + "Pudiste adivinar la palabra que fue<br>"
					+ "seleccionada especialmente para vos." + "</div></html>";
		}
		StatusDialog modal = new StatusDialog(textoResumen);
		modal.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				navigation.updateView(ViewEnum.GAMEOVER);
			}
		});
		modal.getOkButton().addActionListener(e -> {
			modal.dispose();
			this.navigation.updateView(ViewEnum.GAMEOVER);
		});
		modal.setVisible(true);
	}

	@Override
	public void onInitialize(int intentos, String secretWord) {
		this.juegoView.recalcularIntentos(String.valueOf(this.juegoModel.getIntentosRestantes()));
		this.juegoView.drawSecretWord(this.juegoModel.getPalabraSecreta());
		this.juegoView.getTextField().requestFocus();
	}

	@Override
	public void onError() {
		this.juegoView.mostrarMensajeError("¡LA PALABRA DEBE TENER 5 LETRAS!");
		Timer timerOcultar = new Timer(2000, e -> {
            this.juegoView.ocultarError();
        });
        timerOcultar.setRepeats(false);
        timerOcultar.start();
	}

}
