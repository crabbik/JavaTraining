package collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		System.out.println("first word is: " + words.get(0));
		words.remove(0);
		System.out.println("first word after remove is: " + words.get(0));
		doList1(words);
		doList2(words);
		doList3(words);

	}

	public static void doList1(List<String> words) {

	}

	public static void doList2(List<String> words) {

	}

	public static void doList3(List<String> words) {

	}

}
