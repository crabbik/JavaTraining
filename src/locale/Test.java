package locale;

import java.util.Arrays;
import java.util.Locale;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(Arrays.toString(locale.getAvailableLocales()));
	}
}
