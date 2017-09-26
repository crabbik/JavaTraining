package homeWork;

public class Task19 {

	public static void main(String[] args) {

		String str = "Текстовая, строка, ! с несколькими,, запятыми.";
		int n = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ' ')
				n++;

		}
		System.out.println("У нас есть " + n + " пробелов");
	}

}
