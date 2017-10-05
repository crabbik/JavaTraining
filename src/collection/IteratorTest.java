package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new HashSet<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}
}