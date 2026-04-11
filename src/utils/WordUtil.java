package utils;

public class WordUtil {
	// Listas en ESPAÑOL
	private static String[] facil = { "GATOS", "PERRO", "CASAS", "AUTOS", "AGUAS", "COCHE", "COLOR", "FELIZ", "ARBOL", "AMIGO",
			"MESAS", "LIBRO", "LAPIZ", "NOCHE", "TARDE", "LUNAS", "SOLES", "RATON", "REINA", "FUEGO" };

	private static String[] normal = { "ACTOR", "BRAZO", "CLIMA", "HIELO", "JUEGO", "BARCO", "DULCE", "GENTE", "JOVEN", "CINCO",
			"CAMPO", "MUNDO", "NORTE", "PISTA", "RADIO", "SALUD", "VALOR", "VOCES", "VUELO", "PLAZA" };

	private static String[] dificil = { "ZARZA", "ÑANDU", "AÑEJO", "QUIZA", "GNOMO", "YELMO", "XENON", "BOXEO", "KIWIS", "KAYAK",
			"FLUOR", "EBANO", "PIZZA", "ZORRO", "VORAZ", "SAXOS", "JUEZA", "BAZAR", "BRUJA", "CHUZA" };

	// Listas en INGLES
	private static String[] facilEN = { "APPLE", "WATER", "HOUSE", "MOUSE", "CHAIR", "TABLE", "CLOCK", "TRAIN", "PLANT", "GRASS",
			"BEACH", "RIVER", "MUSIC", "SOUND", "LIGHT", "NIGHT", "HEART", "SMILE", "HAPPY", "SEVEN" };

	private static String[] normalEN = { "BREAD", "JUICE", "KNIFE", "SPOON", "SUGAR", "FLOUR", "WHEAT", "GRAIN", "EARTH", "WORLD",
			"SPACE", "ALIEN", "GHOST", "MAGIC", "WITCH", "SPELL", "SWORD", "SHAPE", "ARMOR", "FRAME" };

	private static String[] dificilEN = { "AZURE", "BAZAR", "CIVIC", "CRUMB", "DIZZY", "DWARF", "FLUFF", "FUZZY", "GYPSY", "HAIKU",
			"JAZZY", "KAZOO", "KHAKI", "NYMPH", "PIZZA", "PLUMP", "QUEUE", "QUART", "TOPAZ", "ZEBRA" };

	public static String[] buildWordArray(LanguageEnum language, DifficultEnum difficult) {
		String[] arr = switch (language) {
		case ENGLISH -> getWordsByDifficult_EN(difficult);
		case SPANISH -> getWordsByDifficult_ES(difficult);
		};

		return arr;
	}

	private static String[] getWordsByDifficult_ES(DifficultEnum difficult) {
		String[] words = switch (difficult) {
		case EASY -> facil;
		case HARD -> dificil;
		case NORMAL -> normal;
		};
		return words;
	}

	private static String[] getWordsByDifficult_EN(DifficultEnum difficult) {
		String[] words = switch (difficult) {
		case EASY -> facilEN;
		case HARD -> dificilEN;
		case NORMAL -> normalEN;
		};
		return words;
	}
}
