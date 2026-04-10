package utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageUtil {
	 private static Locale actualLocale = new Locale.Builder().setLanguage("es").build();

	    public static void setIdioma(String lenguaje) {
	        actualLocale = new Locale.Builder().setLanguage(lenguaje).build();
	        Locale.setDefault(actualLocale);
	    }

	    public static ResourceBundle getBundle(String nombreArchivo) {
	        return ResourceBundle.getBundle(nombreArchivo, actualLocale);
	    }
}
