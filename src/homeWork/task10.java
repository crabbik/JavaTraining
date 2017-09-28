package homeWork;

public class Task10 {

	public static void main(String[] args) {
		//готово

		int i = 147;
		int sum = 0;

		while (i != 0) {

			sum = sum + (i % 10);
			i = i / 10;

		}
		System.out.println(sum);

	}

}
