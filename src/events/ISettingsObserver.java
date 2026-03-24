package events;

import utils.DifficultEnum;
import utils.LanguageEnum;

public interface ISettingsObserver {
	void onLanguageChanged(LanguageEnum language);
	void onDifficultChanged(DifficultEnum difficult);
}
