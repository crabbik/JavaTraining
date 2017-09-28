package string;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.TimeZone;

public class DateSamples {

	public static void main(String[] args) throws ParseException, InterruptedException {

		Date date = new Date();

		System.out.println(date.getTime());

		Thread.sleep(10);

		Calendar calendar = Calendar.getInstance();

		Date dateFromCalendar = calendar.getTime();

		System.out.println(dateFromCalendar.getTime());

		calendar.setTime(date);

		System.out.println(dateFromCalendar.getTime());

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		calendar.add(Calendar.MONTH, -3);

		System.out.println(dateFromCalendar);

		SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

		String dateAsStr = sdf1.format(date);

		System.out.println(dateAsStr);

		SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println(sdf2.parse(dateAsStr).getTime());

	}

}
