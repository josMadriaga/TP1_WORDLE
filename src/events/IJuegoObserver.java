package events;

public interface IJuegoObserver {
	public void onPalabraRevisada(String[] coloresLetras, int fila);

	public void onJuegoTerminado(boolean gano, int tiempoUsuario);

	public void onInitialize(int intentos, String secretWord);
	
	public void onError();
}
