package events;

public interface IJuegoObserver {
	
	public void onPalabraRevisada(String[] coloresLetras);
	
	public void onJuegoTerminado(boolean gano);
}
