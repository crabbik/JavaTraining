package task12;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {

		int[][] array = new int[10][15];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = random.nextInt(15);
			}
			Boolean check = false;

			Integer indexI = null;
			Integer indexJ = null;

			for (int i1 = 0; i1 < 10; i1++) {
				if (check == false) {
					for (int j = 0; j < 15; j++)
						if (check == false)
							if (array[i1][j] == 9) {
								indexI = i1;
								indexJ = j;
								check = true;
								break;}
				} else
					break;

			}

			System.out.println("����� 9 ���������� � ������� : i1(������) = "
					+ ++indexI + ", j(�������) = " + ++indexJ);
			// �� ������������� ����?
		}
	}
}