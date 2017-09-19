package cycles;

public class continuecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {
			if (i == 3) {

				System.out.println("continue!");
				continue;
			}
			System.out.println("i= " + i);

		}
	}

}
