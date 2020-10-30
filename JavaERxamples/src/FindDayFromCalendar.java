import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, day);

		return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
	}
}

public class FindDayFromCalendar {
	public static void main(String[] args) throws IOException {

		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.println(nf.getCurrency());

//		nf.setCurrency();
	}
}
