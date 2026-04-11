package events;

import utils.LanguageEnum;

public interface ISettingsObserver {
	void onLanguageChanged(LanguageEnum language);
}
