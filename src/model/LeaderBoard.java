package model;

import java.util.ArrayList;

import events.ILeaderBoardObserver;
import utils.Observable;

public class LeaderBoard  extends Observable<ILeaderBoardObserver>{
	private ArrayList<Score> scores = new ArrayList<Score>();
	private int tiempoUsuario;
	
	public LeaderBoard(int tiempoUsuario) {
		this.tiempoUsuario = tiempoUsuario;
		this.scores = buildDefaultScores();
	}
	private ArrayList<Score> buildDefaultScores() {
		scores.add(new Score("LEGRAND", 20));
		scores.add(new Score("HOMERO", 35));
		scores.add(new Score("BARTO", 50));
		scores.add(new Score("EZIO", 999));
		
		return scores;
	}
	
	public void obtenerRanking(){
		System.out.println(this.tiempoUsuario);
		scores.add(new Score("YOU", this.tiempoUsuario));
		scores.sort((a, b) -> Integer.compare(a.getSegundos(), b.getSegundos()));
		
		notifyObservers(o -> {
			o.onInitialize(scores);
		});
	}

}
