package controller;

import java.util.ArrayList;

import events.ILeaderBoardObserver;
import model.LeaderBoard;
import model.Score;
import view.LeaderBoardView;

public class LeaderBoardController implements ILeaderBoardObserver {
	private LeaderBoard rankingModel;
	private LeaderBoardView rankingView;
	
	public LeaderBoardController(LeaderBoard rankingModel, LeaderBoardView rankingView) {
		this.rankingModel = rankingModel;
		this.rankingView = rankingView;
		this.rankingModel.addObserver(this);
		this.rankingModel.obtenerRanking();
	}
	@Override
	public void onInitialize(ArrayList<Score> scores) {
		this.rankingView.actualizarTabla(scores);
	}

}
