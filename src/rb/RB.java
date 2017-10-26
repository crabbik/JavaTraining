package rb;

import java.util.Locale;
import java.util.ResourceBundle;

public class RB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = new Locale("ru", "RU");
		Locale localeEn = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
		ResourceBundle rb1 = ResourceBundle.getBundle("MessagesBundle", localeEn);
		System.out.println(rb.getString("greetings"));
		System.out.println(rb1.getString("greetings"));

	}

}
