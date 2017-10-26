package locale;

import java.text.Collator;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestNumber {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale locale = new Locale("ru", "RU");
		Locale localeDe = new Locale("de", "DE");

		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rubFormat.format(10000));
		Locale locale1 = new Locale("en", "US");

		NumberFormat enFormat = NumberFormat.getCurrencyInstance(locale1);
		System.out.println(enFormat.format(10000));

		NumberFormat numFormat = NumberFormat.getNumberInstance(localeDe);
		Number num = numFormat.parse("10.50");
		double n = num.doubleValue();
		System.out.println(n);

		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale1);
		System.out.println(df.format(currentDate));

		Date parsedDate = df.parse("10/15/10");
		System.out.println(parsedDate);

		Collator collator = Collator.getInstance(locale);
		List<String> wordsList = new ArrayList<String>();
		wordsList.add("дерево");
		wordsList.add("Деньги");
		wordsList.add("аннаса");
		wordsList.add("лес");
		Collections.sort(wordsList, collator);
		System.out.println(wordsList);

	}

}
