package homeWork;

public class Task5NO {

	public static void main(String[] args) {
		// Ќ≈ сделал , определить промежутки в которых мен€етьс€ падеж
		int a = 41;

		if (a == 0 || a >= 5) {
			System.out.println(a + " рублей");
		} else if (a == 1) {
			System.out.println(a + " рубль");
		} else if (2 <= a && a < 5) {
			System.out.println(a + " рубл€");
		}

	}

}
