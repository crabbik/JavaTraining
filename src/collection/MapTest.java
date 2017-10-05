package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> words = new HashMap<Integer, String>();
		words.put(1, "First");
		words.put(2, "Two");
		words.put(3, "Three");
		System.out.println("Map :" + words);
		System.out.println("Map is:" + words.get(3));

	}

}
