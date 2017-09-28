package homeWork;

public class Task21No {

	public static void main(String[] args) {
		// Как сравнить скорость выполнения?
		String str0 = "Строка один";
		String str1 = "Строка два";
		StringBuilder strBuilder = new StringBuilder(str1);

		for (int i = 0; i <= 3; i++) {
			str0 += " добавляется строка";

		}
		System.out.println(str0);

		for (int i = 0; i <= 3; i++) {

			strBuilder.append(" добавляется строка");

		}
		System.out.println(strBuilder);

	}

}
