package taskIN;

import java.util.Arrays;
import java.util.Comparator;

public class Task7 {

	public static void main(String[] args) {

		String arr[] = { "bb", "a", "AA" };

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		};

		Arrays.sort(arr, comp);
		System.out.println(Arrays.toString(arr));

	}

}
