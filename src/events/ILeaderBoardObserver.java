package events;

import java.util.ArrayList;

import model.Score;

public interface ILeaderBoardObserver {
	void onInitialize(ArrayList<Score> scores);
}
